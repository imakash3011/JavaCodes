package Program_7;

import java.util.Scanner;

public class SubSequence {
        public static void main(String[] args) {
            Scanner obj=new Scanner(System.in);
            String unprocessed=obj.next();
            subseq("",unprocessed);  // it will give all the subsequence possible in the given string
        }
        public static void subseq(String processed,String unprocessed){
            if(unprocessed.isEmpty()){
                if(!processed.isEmpty()){
                    System.out.print(processed+" ");
                }
                return;
            }
            char ch=unprocessed.charAt(0);
            unprocessed=unprocessed.substring(1);

            subseq(processed+ch,unprocessed);
            subseq(processed,unprocessed);
        }
    }
