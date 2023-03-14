package com.liuhanze.design_patterns.component.demo1;

import com.liuhanze.iutil.log.ILog;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;
import rx.functions.Action1;

class Composite extends Component{

    private List<Component> componentList = new ArrayList<>();

    public Composite(String name){
        super(name);
    }

    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
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

        for(Component obj : componentList){
            obj.display(depth+2);
        }
    }
}
