package com.ct.common.bean;

import java.io.Closeable;
import java.io.FileNotFoundException;

/*数据到哪去*/
public interface DataOut extends Closeable {
    public void setPath(String path) throws FileNotFoundException;
    public void write(Object data) throws Exception;
    public void write(String data) throws Exception;
}
