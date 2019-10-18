package Fourth_program;
import java.util.*;

public class ArraySumTriplet {

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int target = sc.nextInt();
            for (int j = 0; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    for (int p = k + 1; p < n; p++) {
                        if (a[j] + a[k] + a[p] == target) {
                            System.out.println(a[j] + ", " + a[k] + " " + "and " + a[p]);
                        }
                    }
                }
            }

        }
    }
