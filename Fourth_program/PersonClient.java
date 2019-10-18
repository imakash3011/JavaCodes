package Fourth_program;

public class PersonClient {
    public static void main(String[] args) {
        Person p1=new Person();
        Person p2=new Person();

//  1      System.out.println(p1.name);
//   1     System.out.println(p1.age);
//1
//1
// 1       System.out.println(p2.name);
//  1      System.out.println(p2.age);

        System.out.println(p1.getName());    //it will print null because we are not giving any value to it
        System.out.println(p1.getAge());     // it will print 0 i.e default value of int

        p2.setName("Akash");
        p2.setAge(10);

        System.out.println(p2.getName());
        System.out.println(p2.getAge());

    }
}
