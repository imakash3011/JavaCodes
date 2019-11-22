package Program_15.Recursion;

public class Permutation {
    public static void main(String[] args) {
        printPermutation("abc","");
    }
    public static void printPermutation(String ques,String ans){
        if (ques.length()==0){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i <ques.length() ; i++) {

            char ch=ques.charAt(i);
            //roq:rest of question
            //delete the ith char.
            //see very carefully we are ignoring the ith char only and again we are adding whole string
            //ques.substring(0,i):here ith char will be ignored
            //ques.substring(i+1) : and then again we are adding the while string from i+1
            String roq=ques.substring(0,i) + ques.substring(i+1);

            printPermutation(roq,ans+ch);
        }
    }
}
