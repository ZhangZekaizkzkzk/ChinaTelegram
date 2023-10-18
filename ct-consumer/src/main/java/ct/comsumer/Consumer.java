package ct.comsumer;

import java.io.Closeable;
import java.io.IOException;

/*消费者接口*/
public interface Consumer extends Closeable {
    public void consume() throws IOException;
}
