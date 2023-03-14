package com.liuhanze.design_patterns.bridge.demo3;

import com.liuhanze.iutil.log.ILog;

public class ShanZhaiCorp extends Corp{

    public ShanZhaiCorp(IProduct product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        ILog.LogDebug("山寨公司正在赚钱");
    }
}
