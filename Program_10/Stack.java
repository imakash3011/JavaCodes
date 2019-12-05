package Program_10;

public class Stack implements DynmStack {

    //one interface can extends multiple interface

    //here we are providing the body of the method declared in interface

    @Override
    public void push(int item) {
        //to access the size we have to use the interface name also
        //becz the variable size is static and final
        System.out.println(StackI.size);

    }

    @Override
    public int pop() {  //while impelmenting the method of the interface you simply cannot change the return type
        return 0;
    }

    //we can also write method other than that are present in interface
    public int top(){
        return 1;
    }

    @Override
    public int display() {
        return 0;
    }
}
