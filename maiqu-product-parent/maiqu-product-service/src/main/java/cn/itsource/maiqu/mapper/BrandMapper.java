package cn.itsource.maiqu.mapper;


import cn.itsource.maiqu.domain.Brand;
import cn.itsource.maiqu.query.BrandQuery;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

/**

 * 品牌信息 Mapper 接口
 */
public interface BrandMapper extends BaseMapper<Brand> {

    /**
     * 分页条件查询
     */
    IPage<Brand> queryPage(Page page, @Param("query") BrandQuery query);
}
