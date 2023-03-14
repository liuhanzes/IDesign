package com.liuhanze.design_patterns.bridge.demo2;

public class BridgeMain {

    public void main(){
        HandSetBrand huawei = new HandSetBrandHuaWei();
        huawei.setHandsetSoft(new HandSetSoftMusic());
        huawei.run();
        huawei.setHandsetSoft(new HandsetSoftGame());
        huawei.run();

        HandSetBrand sunsam = new HandSetBrandSunsum();
        sunsam.setHandsetSoft(new HandSetSoftMusic());
        sunsam.run();
        sunsam.setHandsetSoft(new HandsetSoftGame());
        sunsam.run();

    }
}
