package com.liuhanze.design_patterns.adapter.demo2;

public class AdapterMain {

    public void main(){
        Target target = new Adapter();
        target.request();
    }
}
