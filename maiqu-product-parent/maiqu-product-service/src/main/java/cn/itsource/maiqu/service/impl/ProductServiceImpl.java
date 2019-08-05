package cn.itsource.maiqu.service.impl;


import cn.itsource.basic.util.PageList;
import cn.itsource.maiqu.domain.Product;
import cn.itsource.maiqu.mapper.ProductMapper;
import cn.itsource.maiqu.query.ProductQuery;
import cn.itsource.maiqu.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 商品 服务实现类
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

    @Override
    public PageList<Product> queryPage(ProductQuery query) {
        return null;
    }
}
