package jocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by meng on 6/1/14.
 */
public class Pipe {

    public static void pipe(InputStream in, OutputStream out) throws IOException {
        byte[] buf = new byte[1024];
        while (true) {
            int len = in.read(buf);
            if (len >= 0) {
                out.write(buf, 0, len);
                out.flush();
            }
            else {
                System.out.println("Closed");
                break;
            }
        }
    }
}
