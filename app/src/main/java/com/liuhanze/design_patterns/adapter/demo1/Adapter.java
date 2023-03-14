package com.liuhanze.design_patterns.adapter.demo1;


/**
 * 对象适配器 通过关联对象needAdapter 来实现
 * 也可以通过构造方法传入needAdapter
 */
class Adapter implements Target{

    NeedAdapter needAdapter = new NeedAdapter();

    @Override
    public void request() {
        needAdapter.needRequest();
    }
}
