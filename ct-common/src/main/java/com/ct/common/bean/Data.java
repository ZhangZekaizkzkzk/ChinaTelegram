package com.ct.common.bean;

//数据对象
public class Data implements Value {
    public String content;

    public void setValue(String value){
        content =  value;
    }
    public Object value(){
        return content;
    }
}
