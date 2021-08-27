package xyz.myzsl.context;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.myzsl.context.entity.BannerEntity;
import xyz.myzsl.context.service.BannerService;

@SpringBootTest
class SlxueContextApplicationTests {

    @Autowired
    private BannerService bannerService;


    @Test
    void testCreateBanner() {
        BannerEntity bannerEntity = new BannerEntity();
        bannerEntity.setTitle("测试广告");
        bannerEntity.setImgUrl("1.jpg");
        bannerEntity.setRenderUrl("http://www.ujiuye.com");
        //保存
        bannerService.save(bannerEntity);
    }
}
