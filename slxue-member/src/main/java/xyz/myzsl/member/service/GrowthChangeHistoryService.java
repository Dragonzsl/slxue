package xyz.myzsl.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.myzsl.member.entity.GrowthChangeHistoryEntity;
import xyz.myzsl.utils.PageUtils;

import java.util.Map;

/**
 * 会员-积分值变化历史记录表
 *
 * @author shilin
 * @email g1335026358@gmail.com
 * @date 2021-08-27 14:37:22
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

