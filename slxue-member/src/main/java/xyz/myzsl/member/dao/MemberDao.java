package xyz.myzsl.member.dao;

import xyz.myzsl.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员-会员表
 * 
 * @author shilin
 * @email g1335026358@gmail.com
 * @date 2021-08-27 14:37:22
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
