package com.liuhanze.design_patterns.bridge.demo2;

abstract class HandSetBrand {
    protected HandsetSoft handsetSoft;

    public void setHandsetSoft(HandsetSoft handsetSoft) {
        this.handsetSoft = handsetSoft;
    }

    abstract void run();
}
