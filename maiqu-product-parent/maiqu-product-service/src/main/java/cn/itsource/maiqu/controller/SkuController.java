package cn.itsource.maiqu.controller;


import cn.itsource.basic.util.AjaxResult;
import cn.itsource.basic.util.PageList;
import cn.itsource.maiqu.domain.Sku;
import cn.itsource.maiqu.query.SkuQuery;
import cn.itsource.maiqu.service.ISkuService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sku")
public class SkuController {
    @Autowired
    public ISkuService skuService;

    /**
    * 保存和修改公用的
    */
    @RequestMapping(value="/add",method= RequestMethod.POST)
    public AjaxResult save(@RequestBody Sku sku){
        try {
            if(sku.getId()!=null){
                skuService.updateById(sku);
            }else{
                skuService.save(sku);
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
            skuService.removeById(id);
            return AjaxResult.me();
        } catch (Exception e) {
        e.printStackTrace();
            return AjaxResult.me().setMessage("删除对象失败！"+e.getMessage());
        }
    }

    //获取用户
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Sku get(@RequestParam(value="id",required=true) Long id)
    {
        return skuService.getById(id);
    }


    /**
    * 查看所有的员工信息
    */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Sku> list(){

        return skuService.list(null);
    }


    /**
    * 分页查询数据
    */
    @RequestMapping(value = "/json",method = RequestMethod.POST)
    public PageList<Sku> json(@RequestBody SkuQuery query)
    {
        IPage<Sku> page = skuService.page(new Page<Sku>(query.getPageNum(),query.getPageSize()));
        return new PageList<>(page.getTotal(),page.getRecords());
    }
}
