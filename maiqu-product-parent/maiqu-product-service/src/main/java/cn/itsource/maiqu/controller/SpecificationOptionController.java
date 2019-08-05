package cn.itsource.maiqu.controller;


import cn.itsource.basic.util.AjaxResult;
import cn.itsource.basic.util.PageList;
import cn.itsource.maiqu.domain.SpecificationOption;
import cn.itsource.maiqu.query.SpecificationOptionQuery;
import cn.itsource.maiqu.service.ISpecificationOptionService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/specificationOption")
public class SpecificationOptionController {
    @Autowired
    public ISpecificationOptionService specificationOptionService;

    /**
    * 保存和修改公用的
    */
    @RequestMapping(value="/add",method= RequestMethod.POST)
    public AjaxResult save(@RequestBody SpecificationOption specificationOption){
        try {
            if(specificationOption.getId()!=null){
                specificationOptionService.updateById(specificationOption);
            }else{
                specificationOptionService.save(specificationOption);
            }
            return AjaxResult.me();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setMessage("保存对象失败！"+e.getMessage());
        }
    }

    /**
    * 删除对象信息
    */
    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
    public AjaxResult delete(@PathVariable("id") Integer id){
        try {
            specificationOptionService.removeById(id);
            return AjaxResult.me();
        } catch (Exception e) {
        e.printStackTrace();
            return AjaxResult.me().setMessage("删除对象失败！"+e.getMessage());
        }
    }

    //获取用户
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public SpecificationOption get(@RequestParam(value="id",required=true) Long id)
    {
        return specificationOptionService.getById(id);
    }


    /**
    * 查看所有的员工信息
    */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<SpecificationOption> list(){

        return specificationOptionService.list(null);
    }


    /**
    * 分页查询数据
    */
    @RequestMapping(value = "/json",method = RequestMethod.POST)
    public PageList<SpecificationOption> json(@RequestBody SpecificationOptionQuery query)
    {
        IPage<SpecificationOption> page = specificationOptionService.page(new Page<SpecificationOption>(query.getPageNum(),query.getPageSize()));
        return new PageList<>(page.getTotal(),page.getRecords());
    }
}
