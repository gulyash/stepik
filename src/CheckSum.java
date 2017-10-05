import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CheckSum {
    public static void main(String[] args) {
        byte[] bytes ={ 0x33, 0x45, 0x01};
        try {
            System.out.println(checkSumOfStream(new ByteArrayInputStream(bytes)));
        }
        catch (IOException e) {
            System.out.println("Error");
        }
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int i;
        int sum = 0;
        while ((i =inputStream.read()) != -1) {
            sum = Integer.rotateLeft(sum, 1) ^ i;
        }
        return sum;
    }
}
