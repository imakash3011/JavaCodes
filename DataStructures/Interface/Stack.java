package Program_14.Interface;

public class Stack implements DynamicStackI {

    //see the package  Program10
    @Override
    public void push(int item) {
        //variables are static and final by default in interface class
        //and they cannot be access directly
        System.out.println(StackI.size);
    }

    @Override
    public int pop() {
        return 0;
    }

    @Override
    public void display() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
