import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class CopyingContent {
    static void main(String[] args) throws IOException {
       try(FileInputStream fin=new FileInputStream("TLP");  FileOutputStream fon=new FileOutputStream("TLPfile")) {
            int ch;
            while((ch = fin.read()) != -1) {
                fon.write(ch);
            }
        }
        System.out.println("File Copied Successfully");
    }
}