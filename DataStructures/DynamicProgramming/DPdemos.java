package Program_15.DynamicProgramming;

public class DPdemos {
    public static long start;
    public static long end;

    public static  void startAlgo(){
        start=System.currentTimeMillis();
    }

    public static  long endAlgo(){
        end=System.currentTimeMillis();
        return end - start;
    }

    public static void main(String[] args) {
        int n=45;
        //n+1 helps to make available the last index too
        int[] strg=new int[n+1];

        //using recursive method
        startAlgo();
        System.out.println(fib(n));
        System.out.println("Fib Normal took time "+ endAlgo()+"ms" );

        //using DP
        startAlgo();
        System.out.println(fibRS(n,strg));
        System.out.println("Fib Recursive Storage took time "+ endAlgo()+"ms" );


        //using iterative method
        startAlgo();
        System.out.println(fibIS(n));
        System.out.println("Fib iterative methid took time "+ endAlgo()+"ms" );

    }
    public static int fib(int n){
        if(n==1){
            return n;
        }
        if(n==0){
            return n;
        }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }

    //using DP fibonaci of recursive storage
    //store the value in array strg after calculating it once and again call it where its required
    public static int fibRS(int n,int[] strg){
        if(n==1){
            return n;
        }
        if(n==0){
            return n;
        }
        if (strg[n]!=0){
            return strg[n];
        }

        int fnm1=fibRS(n-1,strg);
        int fnm2=fibRS(n-2,strg);
        int fn=fnm1+fnm2;
        strg[n]=fn;
        return fn;
    }

    public static  int fibIS(int n){
        int[] strg=new int[n+1];

        //seed
        strg[0]=0;
        strg[1]=1;

        for (int i=2;i<=n;i++){
            strg[i]=strg[i-1]+strg[i-2];
        }
        return strg[n];
    }
}
