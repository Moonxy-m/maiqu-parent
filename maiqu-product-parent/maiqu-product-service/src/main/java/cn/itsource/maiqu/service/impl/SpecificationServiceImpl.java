package cn.itsource.maiqu.service.impl;


import cn.itsource.maiqu.domain.Specification;
import cn.itsource.maiqu.mapper.SpecificationMapper;
import cn.itsource.maiqu.service.ISpecificationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class SpecificationServiceImpl extends ServiceImpl<SpecificationMapper, Specification> implements ISpecificationService {

}
