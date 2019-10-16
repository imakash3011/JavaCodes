package Second_program;

import java.math.BigDecimal;

public class BigDecimalExample {
    public static void main(String[] args) {
        //BigInteger a=new BigInteger("10");
        int n=100;

        BigDecimal fact=new BigDecimal("234.234");          // instead of  int write biginteger becz factorial of 1000 will be too long
        //BigInteger fact=new BigInteger.ONE;

        BigDecimal big1=new BigDecimal("11.34");
        big1=big1.multiply(big1);
        System.out.println(big1);
       big1=fact.subtract(big1);
        System.out.println(big1);

        for (int i = n; i >=1 ; i--) {                          //to take mod type "fact.mod()"
            //fact=fact.multiply(new BigInteger(Integer.toString(i)));  //add,shift,mod,subtract etc...use it instead of operators
            fact=fact.multiply(BigDecimal.valueOf(i));
        }

        System.out.println(fact);
        System.out.println(fact.toString().length());
        //BigDecimal big2=new BigDecimal("2343454565787598465245673568795345423");
//        big2=fact.mod(big2);
//        System.out.println(big2);
//        System.out.println(big2.toString().length());
    }

}