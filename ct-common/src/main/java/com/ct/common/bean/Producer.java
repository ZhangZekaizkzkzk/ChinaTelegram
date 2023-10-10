package com.ct.common.bean;

import java.io.IOException;

/*生产者接口*/
public interface Producer extends Cloneable{
    /*生产数据*/
    public void produce() throws IOException;
    /*数据的来源与去向*/
    public void seiIn(DataIn in);
    public void setOut(DataOut out);
    /*关闭生产者*/
    public void close() throws IOException;
}
