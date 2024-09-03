package com.liuhanze.design_patterns.test.demo2;

import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

public class EventDispatch implements Observer {

    private final static EventDispatch dispatch = new EventDispatch();
    private Vector<EventCustomer> customerVector = new Vector<>();


    private EventDispatch(){

    }

    public static EventDispatch getDispatch(){
        return dispatch;
    }

    @Override
    public void update(Observable o, Object arg) {
        Product product = (Product) arg;
        ProductEvent event = (ProductEvent) o;

        for(EventCustomer customer : customerVector){

          for(EventCustomerType type : customer.getCustomerTypeVector()){
                if(type.getValue() == event.getEventType().getValue()){
                    customer.exec(event);
                }
          }

        }

    }


    public void registerCustomer(EventCustomer  customer){
        customerVector.add(customer);
    }

}
