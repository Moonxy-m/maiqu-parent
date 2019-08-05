package cn.itsource.maiqu.service.impl;


import cn.itsource.maiqu.domain.Sku;
import cn.itsource.maiqu.mapper.SkuMapper;
import cn.itsource.maiqu.service.ISkuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class SkuServiceImpl extends ServiceImpl<SkuMapper, Sku> implements ISkuService {

}
