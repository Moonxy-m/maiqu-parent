package cn.itsource.maiqu.service;


import cn.itsource.basic.util.PageList;
import cn.itsource.maiqu.domain.Brand;
import cn.itsource.maiqu.query.BrandQuery;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 品牌信息 服务类
 */
public interface IBrandService extends IService<Brand> {

    /**
     * 分页查询
     * @param query
     * @return
     */
    PageList<Brand> queryPage(BrandQuery query);
}
