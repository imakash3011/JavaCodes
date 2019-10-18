package Fourth_program;
public class Prsn {
//  1  String name;
//   1  int age;

    //getter and setter is used to access  and modify private variable
    private  String name;
    private int age;


//   public String getName(){    //getter for name
//        return name;
//    }
//    public void setName(String name){      //setter for name
//        this.name=name;
//    }
//
//
//    public int getAge(){     //getter for age
//        return age;
//    }
//    public void setAge(int age){     // setter for age
//        this.age=age;
//    }
    public Prsn(){
        System.out.println("this is a default constructer ");
//    this.age=age;
    }

    public Prsn(int age,String name){
        System.out.println("this is para. cons. with 2 parameter");
        this.age=age;
        this.name=name;
    }


    public Prsn(int age){
        System.out.println("this is a parameterised constructer ");
        this.age=age;
    }

    public int getAge(){     //getter for age
        return age;
    }

    public String getName(){     //getter for name
        return name;
    }
}