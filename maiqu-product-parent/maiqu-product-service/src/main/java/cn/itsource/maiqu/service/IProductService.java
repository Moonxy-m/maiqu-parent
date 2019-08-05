package cn.itsource.maiqu.service;


import cn.itsource.basic.util.PageList;
import cn.itsource.maiqu.domain.Product;
import cn.itsource.maiqu.query.ProductQuery;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 商品 服务类
 */
public interface IProductService extends IService<Product> {

    PageList<Product> queryPage(ProductQuery query);
}
