package xyz.myzsl.context.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import xyz.myzsl.context.entity.BannerEntity;
import xyz.myzsl.context.service.BannerService;
import xyz.myzsl.utils.PageUtils;
import xyz.myzsl.utils.R;


/**
 * 内容-横幅广告表
 *
 * @author shilin
 * @email g1335026358@gmail.com
 * @date 2021-08-27 14:32:23
 */
@RestController
@RequestMapping("context/banner")
public class BannerController {
    @Autowired
    private BannerService bannerService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = bannerService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		BannerEntity banner = bannerService.getById(id);

        return R.ok().put("banner", banner);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BannerEntity banner){
		bannerService.save(banner);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BannerEntity banner){
		bannerService.updateById(banner);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		bannerService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
