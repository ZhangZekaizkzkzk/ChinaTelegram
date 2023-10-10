package com.ct.common.bean;

import java.io.Closeable;

/*数据到哪去*/
public interface DataOut extends Closeable {
    public void setPath(String path);
}
