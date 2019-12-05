package Program_10;

public interface StackI {
    //here the size is static & final and cannot be access directly .... to access use interface nameand variable "sout(StackI.size)"

    int size=0;
    public void push(int item);
    public int pop();

}
