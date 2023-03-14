package com.liuhanze.design_patterns.bridge.demo3;

public class BridgeMain {


    public void main(){
        House house = new House();
        IPOD ipod = new IPOD();

        Corp hoseCorp = new HouseCorp(house);
        Corp shanZhaiCorp = new ShanZhaiCorp(ipod);

        hoseCorp.makeMoney();
        shanZhaiCorp.makeMoney();


    }
}
