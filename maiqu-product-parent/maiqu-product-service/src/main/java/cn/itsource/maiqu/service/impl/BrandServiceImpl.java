package cn.itsource.maiqu.service.impl;


import cn.itsource.basic.util.PageList;
import cn.itsource.maiqu.domain.Brand;
import cn.itsource.maiqu.mapper.BrandMapper;
import cn.itsource.maiqu.query.BrandQuery;
import cn.itsource.maiqu.service.IBrandService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 品牌信息 服务实现类
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService{


    @Override
    //当前有事务在，则加入到当前事务中，当前没有事务，以非事务方式执行
    @Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
    public PageList<Brand> queryPage(BrandQuery query) {
        //查询总数
        //查询当前页的数据
        Page<Brand> page = new Page<>(query.getPageNum(),query.getPageSize());
        IPage<Brand> ip = baseMapper.queryPage(page, query);
        //封装到PageList返回
        return new PageList<>(ip.getTotal(),ip.getRecords());
    }

}
