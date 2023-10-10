package ct.producer;

import com.ct.common.bean.DataIn;
import com.ct.common.bean.DataOut;
import com.ct.common.bean.Producer;
import ct.producer.bean.LocalFileProducer;
import ct.producer.io.LocalFileDataIn;
import ct.producer.io.LocalFileDataOut;

import java.io.IOException;

/*
* 启动对象
* */
public class Bootstrap {
    public static void main(String[] args) throws Exception {
        // 构建生产者对象
        Producer  producer = new LocalFileProducer();
        producer.seiIn(new LocalFileDataIn("E:\\2_混口饭吃\\尚硅谷大数据电信客服\\2.资料\\辅助文档\\contact.log"));
        producer.setOut(new LocalFileDataOut("E:\\2_混口饭吃\\尚硅谷大数据电信客服\\2.资料\\辅助文档\\call.log"));

        // 生产数据
        producer.produce();

        // 关闭生产者对象
        producer.close();
    }
}
