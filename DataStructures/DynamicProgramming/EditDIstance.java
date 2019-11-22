package Program_15.DynamicProgramming;

public class EditDIstance {

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
        String s1="agbgsdxvc";
        String s2="acgbsteer";

        startAlgo();
        System.out.println(editDistance(s1,s2));
        System.out.println("Edit distance -Recursive Normal took time "+ endAlgo()+"ms" );

        startAlgo();
        System.out.println(editDistanceI(s1,s2));
        System.out.println("Edit distance Iterative method took time "+ endAlgo()+"ms" );

    }

    public static int editDistance(String s1,String s2){
        //is s1 length is 0 than return s2 length becz we have to perform action/operation equals to s2.length
        if (s1.length()==0){
            return s2.length();
        }

        //same as above reason
        if (s2.length()==0){
            return s1.length();
        }

        String ros1=s1.substring(1);
        String ros2=s2.substring(1);

        int ans=0;
        if(s1.charAt(0)==s2.charAt(0)){
            ans=editDistance(ros1,ros2);
        }else {
            //replace
            int f1=1+editDistance(ros1,ros2);

            //add
            int f2=1+editDistance(ros1,s2);

            //remove
            int f3=1+editDistance(s1,ros2);
            ans=Math.min(f1,Math.min(f2,f3));
        }
        return ans;
    }

    //using dynamic programming method
    public static int editDistanceI(String s1,String s2){
        int[][] strg=new int[s1.length()+1][s2.length()+2];
        strg[s1.length()][s2.length()]=0;
        for (int i = s1.length(); i >=0 ; i--) {
            for (int j = s2.length(); j >=0 ; j--) {
                if (i==s1.length()){
                    strg[i][j]=s2.length()-j;
                    continue;
                }
                if (j==s2.length()){
                    strg[i][j]=s1.length()-i;
                    continue;
                }
                if (s1.charAt(i)==s2.charAt(j)){
                    strg[i][j]=strg[i+1][j+1];
                }else {
                    strg[i][j]=1+Math.min(strg[i+1][j+1],Math.min(strg[i+1][j],strg[i][j+1]));
                }

            }

        }
        return strg[0][0];
    }
}
