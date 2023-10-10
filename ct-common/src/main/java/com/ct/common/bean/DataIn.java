package com.ct.common.bean;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/*数据来源*/
public interface DataIn extends Closeable {
    public void setPath(String path) throws FileNotFoundException;
    public Object read() throws IOException;
    public <T extends Data> List<T> read(Class<T> clazz) throws IOException;
}
