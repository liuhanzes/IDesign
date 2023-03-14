package com.liuhanze.design_patterns.component.demo2;

import com.liuhanze.iutil.log.ILog;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;
import rx.functions.Action1;

public class Composite implements IComponent {

    private List<IComponent> componentList = new ArrayList<>();
    private String name;

    public Composite(String name){
        this.name = name;
    }

    @Override
    public void display(int depth) {
        StringBuilder builder = new StringBuilder();
        Observable.just("-").repeat(depth).subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                builder.append(s);
            }
        });

        ILog.LogDebug(builder +name);

        for(IComponent obj : componentList){
            obj.display(depth+2);
        }
    }

    public void add(IComponent component){
        componentList.add(component);
    }

    public void remove(IComponent component){
        componentList.remove(component);
    }





}
