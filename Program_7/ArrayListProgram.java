package Program_7;

import java.util.ArrayList;

public class ArrayListProgram {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        //default capacity of a ArrayList is two
        //after that is starts to increase the size
        //by 2*default capacity
        System.out.println(list);
        System.out.println(list.size());

        list.add(10);
        System.out.println(list);
        System.out.println(list.size());

        list.add(20);
        System.out.println(list);
        System.out.println(list.size());

        list.add(30);
        System.out.println(list);
        System.out.println(list.size());

        System.out.println("******************");

        //get the index value by
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println("******************");

        list.remove(1);
        System.out.println(list);
        System.out.println(list.size());
    }
}
