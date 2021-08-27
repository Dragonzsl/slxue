package xyz.myzsl.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.myzsl.member.entity.MemberEntity;
import xyz.myzsl.utils.PageUtils;

import java.util.Map;

/**
 * 会员-会员表
 *
 * @author shilin
 * @email g1335026358@gmail.com
 * @date 2021-08-27 14:37:22
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

