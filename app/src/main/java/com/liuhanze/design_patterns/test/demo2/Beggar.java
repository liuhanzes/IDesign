package com.liuhanze.design_patterns.test.demo2;

import com.liuhanze.iutil.log.ILog;

public class Beggar extends EventCustomer{


    public Beggar() {
        super(EventCustomerType.DEL);
    }

    @Override
    public void exec(ProductEvent event) {
        Product product = event.getSource();
        ProductEventType eventType = event.getEventType();
        ILog.LogDebug("乞丐事件："+product.getName()+", 事件类型："+eventType);

    }

}
