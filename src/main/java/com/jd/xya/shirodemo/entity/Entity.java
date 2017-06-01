package com.jd.xya.shirodemo.entity;

/**
 * Created by Administrator on 2017/6/1 0001.
 */
public abstract class Entity<T> {

    T id;
    String name;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
