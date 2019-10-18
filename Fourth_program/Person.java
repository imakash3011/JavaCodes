package Fourth_program;

public class Person {
//  1  String name;
//   1  int age;

    //getter and setter is used to access  and modify private variable

    private  String name;
    private int age;

    public String getName(){    //getter for name
        return name;
    }
    public void setName(String name){      //setter for name
        this.name=name;
    }


    public int getAge(){     //getter for age
        return age;
    }
    public void setAge(int age){     // setter for age
        this.age=age;
    }
}
