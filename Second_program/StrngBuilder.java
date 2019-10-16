package Second_program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrngBuilder {
    public static void main(String[] args) throws IOException {
        StringBuffer sb=new StringBuffer("Hello");
        System.out.println(sb);

        System.out.println("in reverse "+sb.reverse());    // to preint in reverse order

        sb.append("Sir");
        System.out.println(sb);

        sb.insert(5,"..hey..");
        System.out.println(sb);

        sb.delete(5,7);
        System.out.println(sb);

        int n=sb.indexOf("Sir");   //based on the above output it will count
        System.out.println(n);

        String s=sb.substring(0,4);
        System.out.println(s);

        StringBuffer obj =new StringBuffer();   // for taking input in bufferstring
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name..");
        String naam=br.readLine();
        System.out.println(naam);

    }
}
