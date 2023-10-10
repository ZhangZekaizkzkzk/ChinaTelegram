package com.ct.common.bean;
/*
* 值对象接口
* */
public interface Value {
    String value();

    public void setValue(Object val);
    public Object getValue();
}
