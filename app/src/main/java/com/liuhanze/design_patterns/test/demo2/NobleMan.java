package com.liuhanze.design_patterns.test.demo2;

import com.liuhanze.iutil.log.ILog;

public class NobleMan extends EventCustomer{


    public NobleMan() {
        super(EventCustomerType.EDIT);
        super.addCustomerType(EventCustomerType.CLONE);
    }

    @Override
    public void exec(ProductEvent event) {
        Product product = event.getSource();
        ProductEventType  eventType = event.getEventType();
        if(eventType.getValue() == EventCustomerType.EDIT.getValue()){
            ILog.LogDebug("贵族事件："+product.getName()+",修改，事件类型"+eventType);
        }else{
            ILog.LogDebug("贵族事件："+product.getName()+",克隆，事件类型"+eventType);
        }
    }
}
