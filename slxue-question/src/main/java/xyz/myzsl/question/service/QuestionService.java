package xyz.myzsl.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.myzsl.utils.PageUtils;
import xyz.myzsl.question.entity.QuestionEntity;

import java.util.Map;

/**
 * 
 *
 * @author shilin
 * @email g1335026358@gmail.com
 * @date 2021-08-27 14:38:29
 */
public interface QuestionService extends IService<QuestionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

