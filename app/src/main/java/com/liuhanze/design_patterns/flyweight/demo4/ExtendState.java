package com.liuhanze.design_patterns.flyweight.demo4;

import java.util.Objects;

/**
 * 使用外部类作为 外部状态
 * 一定要覆写equals和hashCode方法，否则它作为HashMap中的key值是根本没有意义的，只有hashCode值相等，
 * 并且equals返回结果为true，两个对象才相等，也只有在这种情况下才有可能从对象池中查找获得对象。
 * 如果把一个对象作为Map类的键值，一定要确保重写了equals和hashCode方法，否则会出现通过键值搜索失败的情况，
 * 例如map.get(object)、map.contains(object)等会返回失败的结果。
 */
public class ExtendState {

    /**
     * 考试科目
     */
    private String subject;
    /**
     * 考场
     */
    private String location;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExtendState)) return false;
        ExtendState that = (ExtendState) o;
        return getSubject().equals(that.getSubject()) && getLocation().equals(that.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSubject(), getLocation());
    }
}
