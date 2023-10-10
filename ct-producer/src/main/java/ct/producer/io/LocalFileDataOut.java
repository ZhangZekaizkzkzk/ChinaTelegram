package ct.producer.io;

import com.ct.common.bean.DataOut;

import java.io.IOException;

// 本地文件数据输出
public class LocalFileDataOut implements DataOut {

    public LocalFileDataOut(String path) {
        setPath(path);
    }

    @Override
    public void setPath(String path) {

    }

    @Override
    public void close() throws IOException {

    }
}
