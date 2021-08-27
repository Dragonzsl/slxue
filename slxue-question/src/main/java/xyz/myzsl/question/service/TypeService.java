package xyz.myzsl.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.myzsl.utils.PageUtils;
import xyz.myzsl.question.entity.TypeEntity;

import java.util.Map;

/**
 * 题目-题目类型表
 *
 * @author shilin
 * @email g1335026358@gmail.com
 * @date 2021-08-27 14:38:28
 */
public interface TypeService extends IService<TypeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

