package Program_15.Recursion;

public class PrintBoardPath {
    public static void main(String[] args) {
//        printBoardPath(0,10,"");
        System.out.println(countBoardPath(0,10));
    }
    public static void printBoardPath(int curr,int end,String ans){
        if(curr==end){
            System.out.println(ans);
            return;
        }
        if (curr>end){
            return;
        }
        //here we are making the string which will tell the path to reach base-case 10
        //and we are also concatenating different all possible route in  string
        for (int dice= 1; dice <=6; dice++) {
            printBoardPath(curr+dice,end,ans + dice);

        }
    }


    public static int countBoardPath(int curr,int end){
        if(curr==end){
            //it will return 1 ,when it will hit the base-case
            return + 1;
        }
        if (curr>end){
            //return 0 when -ve base-case it touched i.e beyound 10
            return 0;
        }
        //here we are making the string which will tell the path to reach base-case 10
        //and we are also concatenating different all possible route in  string
        int count=0;
        for (int dice= 1; dice <=6; dice++) {
            count+=countBoardPath(curr + dice,end);

        }
        return count;
    }
}
