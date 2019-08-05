package cn.itsource.maiqu.service;


import cn.itsource.maiqu.domain.ProductType;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 商品目录 服务类
 */
public interface IProductTypeService extends IService<ProductType> {

    /**
     * 加载类型树
     * @return
     */
    List<ProductType> loadTypeTree();
    /**
     * 页面静态化
     *
     */
    void genHomePage();
}
