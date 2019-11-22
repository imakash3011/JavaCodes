package Program_15.Recursion;

public class Subsequence {
    public static void main(String[] args) {
        printSS("abc","");
        //in result firstly empty string will come

    }

    public static void printSS(String str,String result){
        if (str.length()==0){
            System.out.println(result);
            return;
        }

        char cc=str.charAt(0);
        String ros=str.substring(1);
        printSS(ros,result);

        printSS(ros,result+cc);
    }
}
