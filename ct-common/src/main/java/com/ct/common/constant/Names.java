package com.ct.common.constant;

import com.ct.common.bean.Value;

// 名称常量枚举类
public enum Names implements Value {
    NAMESPACE("ct");

    private String name;
    private Names(String name){
        this.name = name;
    }

    @Override
    public String value() {
        return name;
    }
}
