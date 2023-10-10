package ct.producer.bean;

import com.ct.common.bean.DataIn;
import com.ct.common.bean.DataOut;
import com.ct.common.bean.Producer;

import java.io.IOException;
import java.util.List;

// 本地数据文件的生产者
public class LocalFileProducer implements Producer {

    private DataIn in;
    private DataOut out;
    private volatile boolean flg = true; // 增强内存可见性

    @Override
    public void seiIn(DataIn in) {
        this.in = in;
    }

    @Override
    public void setOut(DataOut out) {
        this.out = out;
    }
    @Override
    public void produce() throws IOException {
        try {
            // 读取通讯录数据
            List<Contact> contacts  = in.read(Contact.class);
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
//            while( flg ){ // 不断生成数据
//                // 从通讯录中随机查找两个电话号码（主叫、被叫）
//
//                // 生成随机的童话时间
//
//                // 生成随机的通话时长
//
//                // 生成通话记录
//
//                // 将通话记录刷写到数据文件中
//            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    /*关闭生产者*/
    @Override
    public void close() throws IOException {
        if (in != null ){
            in.close();
        }
        if (out != null){
            out.close();
        }
    }
}
