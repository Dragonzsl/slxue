package xyz.myzsl.context.dao;

import xyz.myzsl.context.entity.NewsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-资讯表
 * 
 * @author shilin
 * @email g1335026358@gmail.com
 * @date 2021-08-27 14:32:22
 */
@Mapper
public interface NewsDao extends BaseMapper<NewsEntity> {
	
}
