package Program_15.DynamicProgramming;

public class CountBoardPath {

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
        int n=30;
        int[] strg=new int[n+1];
        //using Normal CBP method
        startAlgo();
        System.out.println(cbp(n,0));
        System.out.println("Count Board Path Normal took time "+ endAlgo()+"ms" );


        startAlgo();
        System.out.println(cbpRS(n,0,strg));
        System.out.println("Count Board Path Recursive Storage took time "+ endAlgo()+"ms" );


        startAlgo();
        System.out.println(cbpIS(n,0));
        System.out.println("Count Board Path Iterative Storage took time "+ endAlgo()+"ms" );

    }
    public static int cbp(int end,int curr){
        if (end==curr){
            return 1;
        }
        if (curr>end){
            return 0;
        }

        int count=0;
        for (int dice = 1; dice <=6; dice++) {
            count=count+cbp(end,curr+dice);
        }
        return count;
    }

    public static int cbpRS(int end,int curr,int[] strg){
        if (end==curr){
            return 1;
        }
        if (curr>end){
            return 0;
        }
        if (strg[curr]!=0){
            return strg[curr];
        }

        int count=0;
        for (int dice = 1; dice <=6; dice++) {
            count=count+cbpRS(end,curr+dice,strg);
        }
        strg[curr]=count;
        return count;
    }

    public static int cbpIS(int end,int curr){
        int[] strg=new int[end+1];
        //seed
        strg[end]=1;
        for (int i = end; i >=0 ; i--) {
            int count=0;
            for (int dice = 0; dice <=6 && dice+i<strg.length ; dice++) {
                count=count+strg[dice+i];
            }
            strg[i]=count;
        }
        return strg[curr];
    }
}
