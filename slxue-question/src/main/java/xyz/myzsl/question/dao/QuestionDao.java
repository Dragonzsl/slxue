package xyz.myzsl.question.dao;

import xyz.myzsl.question.entity.QuestionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author shilin
 * @email g1335026358@gmail.com
 * @date 2021-08-27 14:38:29
 */
@Mapper
public interface QuestionDao extends BaseMapper<QuestionEntity> {
	
}
