package xyz.myzsl.context.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.myzsl.context.entity.BannerEntity;
import xyz.myzsl.utils.PageUtils;

import java.util.Map;

/**
 * 内容-横幅广告表
 *
 * @author shilin
 * @email g1335026358@gmail.com
 * @date 2021-08-27 14:32:23
 */
public interface BannerService extends IService<BannerEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

