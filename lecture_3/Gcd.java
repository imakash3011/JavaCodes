package First_Program;

import java.util.Scanner;
import java.util.*;

public class Gcd {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Long a=obj.nextLong();
        Long b=obj.nextLong();
    }
    public long gcd(long a,long b)
    {
        if (a % b== 0)
            return b;
        return gcd(b, a% b);

    }
}
