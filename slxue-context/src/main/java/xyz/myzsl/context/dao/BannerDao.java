package xyz.myzsl.context.dao;

import xyz.myzsl.context.entity.BannerEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-横幅广告表
 * 
 * @author shilin
 * @email g1335026358@gmail.com
 * @date 2021-08-27 14:32:23
 */
@Mapper
public interface BannerDao extends BaseMapper<BannerEntity> {
	
}
