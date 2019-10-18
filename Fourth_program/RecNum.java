package Fourth_program;

public class RecNum {
    public static void main(String[] args) {
        RecNum(5);
    }

        public static void RecNum(int n){
            if(n==0){
                return;
            }
            if(n%2==1){
                System.out.println(n);
            }
            RecNum(n-1);
            if(n%2==0){
                System.out.println(n);
            }
    }
}
