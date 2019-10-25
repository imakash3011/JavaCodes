package Fifth_Program;
import java.util.Scanner;
public class CumulativeSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int n = s.nextInt();
            sum += n;
            if (sum < 0) {
                break;
            }
            System.out.println(n);
        }
    }
}
