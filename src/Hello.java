import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author dong
 * @date -
 */
public class Hello {
    public static void main(String[] args) throws IOException {
        FileOutputStream out=new FileOutputStream("example.txt");
        String str="擦混这个孩";
        byte[] b=str.getBytes();
        for (int i = 0; i <b.length ; i++) {
            out.write(b[i]);

        }
        out.close();
    }
}
