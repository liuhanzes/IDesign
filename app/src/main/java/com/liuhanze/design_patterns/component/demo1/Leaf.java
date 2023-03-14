package com.liuhanze.design_patterns.component.demo1;

import com.liuhanze.iutil.log.ILog;

import rx.Observable;
import rx.functions.Action1;

class Leaf extends Component{

    public Leaf(String name){
        super(name);
    }

    @Override
    @Deprecated
    public void add(Component component) {
        //leaf can't add
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public void remove(Component component) {
        //leaf can't remove
        throw new UnsupportedOperationException();
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
