package com.hawk.design.mode;

import com.hawk.design.mode.flyweight.IWebsite;
import com.hawk.design.mode.flyweight.User;
import com.hawk.design.mode.flyweight.WebsiteFactory;

import org.junit.Test;

/**
 * Created by 01370340 on 2017/8/31.
 */

public class FlyWeightTest {

    @Test
    public void testFlyWeight(){
        WebsiteFactory factory = new WebsiteFactory();

        IWebsite fx = factory.getWebsiteCategory("产品展示");
        fx.use(new User("张三"));
        IWebsite fy = factory.getWebsiteCategory("产品展示");
        fy.use(new User("李四"));
        IWebsite fz = factory.getWebsiteCategory("产品展示");
        fz.use(new User("王五"));


        IWebsite f1 = factory.getWebsiteCategory("博客");
        f1.use(new User("张三"));

        IWebsite f2 = factory.getWebsiteCategory("产品展示");
        f2.use(new User("李四"));

        IWebsite f3 = factory.getWebsiteCategory("产品展示");
        f3.use(new User("王五"));


        System.out.println("网站总分类数: "+factory.getWebsiteCount());


    }
}
