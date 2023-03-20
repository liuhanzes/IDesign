package com.liuhanze.design_patterns.flyweight.demo2;

import java.util.HashMap;

class WebSiteFactory {

    private HashMap<String,WebSite> webSiteMap = new HashMap<>();

    public WebSite getWebSite(String key){
        if(!webSiteMap.containsKey(key)){
            webSiteMap.put(key,new ConcreteWebSite(key));
        }

        return webSiteMap.get(key);
    }

    public int getWebSiteCount(){
        return webSiteMap.size();
    }

}
