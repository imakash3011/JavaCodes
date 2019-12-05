package Program_7;

public class RecString {
    public static void main(String[] args) {
        System.out.println(recstr("abc","abe",0));
    }
   public static boolean recstr(String str1,String str2,int index){
        if(str1.length() != str2.length()){
            return false;
        }
       if(index <= (str1.length()-1)){  //length zero return
           return true;   //problem in return type
       }
        int prestr1=str1.charAt(index);
        int prestr2=str2.charAt(index);

        if(prestr1==prestr2){
            index++;
        }
            return recstr(str1,str2,index+1);
   }
}
