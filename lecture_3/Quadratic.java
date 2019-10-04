package First_Program;

import java.util.Scanner;
class Quadratic
{
    public static void main(String[] args)
    {
        double a,b,c,root1,root2;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the value of a,b and c respectively");
        a=obj.nextDouble();
        b=obj.nextDouble();
        c=obj.nextDouble();
        double discriminant = (b*b - 4*a*c);
        if(discriminant >0)
        {
            root1=(-b + Math.sqrt(discriminant))/ 2*a;
            root2=(-b - Math.sqrt(discriminant))/2*a;
            System.out.println("real and distinct");
            System.out.printf( "%f %f",root2 ,root1);
        }
        else if(discriminant==0)
        {
            root1=root2= -b/2*a;
            System.out.println("real and equal");
            System.out.printf("%f %f" ,root2,root1);
        }
        else
        {
           // double realpart= -b/2*a;
            double imgpart=(-Math.sqrt(discriminant)/2*a);
            System.out.println("imaginary");
            //System.out.printf("root1= %f + %fi and root2=%f-%fi ",realpart,imgpart,realpart,imgpart);
        }
    }
}
