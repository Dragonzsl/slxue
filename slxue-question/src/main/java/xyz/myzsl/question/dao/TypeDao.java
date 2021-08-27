package xyz.myzsl.question.dao;

import xyz.myzsl.question.entity.TypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题目-题目类型表
 * 
 * @author shilin
 * @email g1335026358@gmail.com
 * @date 2021-08-27 14:38:28
 */
@Mapper
public interface TypeDao extends BaseMapper<TypeEntity> {
	
}
