package Fifth_Program;
import java.util.Scanner;
public class Quadratic {
        public static void main(String args[]) {
            Scanner s=new Scanner(System.in);
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            quadraticequation(a,b,c);

        }
        public static void quadraticequation(int a,int b,int c){
            int d;int root2,root1;
            d=(b*b)-(4*a*c);
            if(d == 0){
                System.out.println("Real and Equal");
                root1=root2=-b/(2*a);
                System.out.println(root2 +" "+root1);
            }
            else if(d>0){
                System.out.println("Real and Distinct ");
                root1= (int) (-b+Math.sqrt(d))/(2*a);
                root2=(int) (-b-Math.sqrt(d))/(2*a);
                System.out.println(root2 +" "+ root1);
            }else{
                System.out.println("Imaginary");
            }
        }
    }
