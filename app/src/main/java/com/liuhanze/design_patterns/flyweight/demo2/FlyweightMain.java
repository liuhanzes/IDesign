package com.liuhanze.design_patterns.flyweight.demo2;

public class FlyweightMain {

    public void main(){
        WebSiteFactory factory = new WebSiteFactory();

        WebSite fx = factory.getWebSite("产品展示");
        fx.use(new User("小菜"));

        WebSite fy = factory.getWebSite("产品展示");
        fy.use(new User("大鸟"));

        WebSite fz = factory.getWebSite("产品展示");
        fz.use(new User("唐僧"));

        WebSite b1 = factory.getWebSite("博客");
        b1.use(new User("三藏"));
        WebSite b2 = factory.getWebSite("博客");
        b2.use(new User("悟空"));
        WebSite b3 = factory.getWebSite("博客");
        b3.use(new User("沙和尚"));

    }
}
