package com.liuhanze.design_patterns.flyweight.demo2;

import com.liuhanze.iutil.log.ILog;

class ConcreteWebSite implements WebSite{

    private String name;

    public ConcreteWebSite(String name){
        this.name = name;
    }

    @Override
    public void use(User user) {
        ILog.LogDebug("网站分类："+name+",用户："+user.getName());
    }
}
