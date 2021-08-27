package xyz.myzsl.context.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.myzsl.context.entity.NewsEntity;
import xyz.myzsl.utils.PageUtils;

import java.util.Map;

/**
 * 内容-资讯表
 *
 * @author shilin
 * @email g1335026358@gmail.com
 * @date 2021-08-27 14:32:22
 */
public interface NewsService extends IService<NewsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

