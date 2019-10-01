import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class ZippingFile {
    public static void main(String[] args) throws IOException {
//        DataInputStream dis=new DataInputStream(System.in);
        FileInputStream fin = new FileInputStream("File1");
        FileOutputStream fos = new FileOutputStream("file2");
        DeflaterOutputStream dos = new DeflaterOutputStream(fos);

        int data;
        while((data=fin.read()) != -1) {
            dos.write(data);

        }
        fin.close();
        dos.close();
    }
}