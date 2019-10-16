package Second_program;

public class Strng {
    public static void main(String[] args) {

        String s=new String("java");
        System.out.println(s);

        char arr[]={'a','f','s','e','t','d'};
        String obj=new String(arr);
        System.out.println(obj);

        String s1="Gorakh";
        String s2="pur";
        String s3=s1.concat(s2);     // concat(String variable)
        System.out.println(s3);

        int n=s1.length();
        System.out.println(n);

        int a=s1.charAt(3);
        System.out.println(a);   //check it

        int m=s1.indexOf(s2);    //here s2 is not part of s1 so it will return -1
        System.out.println(m);
        String s4="k";
        int z=s1.indexOf(s4);
        System.out.println(z);

        boolean x=s1.startsWith("G");
        System.out.println(x);

        String s5=s1.substring(0,4);
        System.out.println(s5);

        String s6=s1.toUpperCase();
        System.out.println(s6);

        String s7="Hello, this is a book on java";
        char ar[]=new char[20];
        s7.getChars(7,21,ar,0);
        System.out.println(ar);

        String s8="Ram";    // Note both "==" and "equals()" are different ...
        String s9="Ram";    //== compares reference while equals() compares content
        if(s8==s9){          // here it will equals because we are not creating object
            System.out.println("both are same ");
        } else {
            System.out.println("both are different");
        }
        String s10=new String("Ram");
        if(s8==s10){          // here it will not be equals because we are creating object s10
            System.out.println("both are same ");
        } else {
            System.out.println("both are different");
        }

    }
}
