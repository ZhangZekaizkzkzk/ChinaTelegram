package ct.producer.io;

import com.ct.common.bean.Data;
import com.ct.common.bean.DataIn;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

// 本地文件数据输入
public class LocalFileDataIn implements DataIn {

    private BufferedReader reader = null; //数据以行存储，使用BufferReader按行读取数据。
    public LocalFileDataIn(String path) {
        setPath(path);
    }

    @Override
    public void setPath(String path) {
        try{
            // 由于Buffer是字节流，FileInputStream是字符流，不能直接转换，所以需要InputStreamReader进行转换
            reader = new BufferedReader( new InputStreamReader(new FileInputStream(path),"UTF-8"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Object read() throws IOException {
        return null;
    }
    /**
     * 读取数据返回数据集合
     * */
    @Override
    public <T extends Data> List<T> read(Class<T> clazz){
        List<T> ts = new ArrayList<T>();
        // 从数据文件中读取所有数据
        try {
            String line = null;
            while ( (line = reader.readLine())!= null){
                // 将数据转换为指定类型的对象，封装为集合返回
                T t = clazz.newInstance();
                t.setValue(line);
                ts.add(t);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return ts;
    }

    @Override
    public void close() throws IOException {
        if (reader != null){
            reader.close();
        }
    }
}
