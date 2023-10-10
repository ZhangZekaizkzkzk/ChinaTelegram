package com.ct.common.bean;
/*生产者接口*/
public interface Producer extends Cloneable{
    /*生产数据*/
    public void produce();
    /*数据的来源与去向*/
    public void seiIn(DataIn in);
    public void setOut(DataOut out);

}
