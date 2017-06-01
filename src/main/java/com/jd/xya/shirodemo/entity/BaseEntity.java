package com.jd.xya.shirodemo.entity;

/**
 * Created by Administrator on 2017/6/1 0001.
 */
public abstract class BaseEntity<T> extends Entity<T> {

    private boolean isModified;

    public BaseEntity(T id, String name) {
        super.id = id;
        super.name = name;
        isModified = false;
    }

    public boolean isIsModified (){
        return  isModified ;
    }
}
