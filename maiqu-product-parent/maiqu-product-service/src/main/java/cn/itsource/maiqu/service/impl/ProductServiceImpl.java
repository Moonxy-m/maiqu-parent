package cn.itsource.maiqu.service.impl;


import cn.itsource.maiqu.domain.Product;
import cn.itsource.maiqu.mapper.ProductMapper;
import cn.itsource.maiqu.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author solargen
 * @since 2019-07-30
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
