package com.liuhanze.design_patterns.component.demo2;

import com.liuhanze.iutil.log.ILog;

import rx.Observable;
import rx.functions.Action1;

public class Leaf implements IComponent {

    private String name;

    public Leaf(String name){
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
    }
}
