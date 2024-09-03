package com.liuhanze.design_patterns.test.demo2;

import com.liuhanze.iutil.log.ILog;

public class Commoner extends EventCustomer{


    public Commoner() {
        super(EventCustomerType.NEW);
    }

    @Override
    public void exec(ProductEvent event) {
        Product product = event.getSource();
        ProductEventType eventType = event.getEventType();
        ILog.LogDebug("普通人事件："+product.getName()+", 事件类型："+eventType);

    }
}
