//package Program_14.GenericsProgram;
//
////by making LL as generic now we can pass any type data
//
//public class GenericsLinkedList<T> {
//    private class Node{
//        T data;
//        Node next;
//
//        Node(T data,Node next){
//            this.data=data;
//            this.next=next;
//        }
//    }
//
//
//    private Node head;
//    private  Node tail;
//    private int size;
//
//    public int size(){
//        return this.size;
//    }
//
//    public boolean isEmpty(){
//        return this.size()==0;
//    }
//
//
//    public void display(){
//        System.out.println("=============");
//        Node temp=this.head;
//        while (temp!=null){
//            System.out.print(temp.data+" , ");
//            temp=temp.next;
//        }
//        System.out.println(".");
//        System.out.println("=============");
//    }
//
//    public int find(T data){
//          int index=0;
//        for (Node temp = this.head; temp!=null ;temp=temp.next) {
//           //== compares the address while equals check the value
//            if(temp.data.equals(data)){
//                return index;
//            }
//            index++;
//        }
//        return -1;
//    }
//
//
//
//
//    public void addLast(T item){
//        //create a new Node for inserting next element
//
//        Node nn=new Node();
//        nn.data=item;
//        nn.next=null;
//        //attach
//        if(this.size>=1){
//            this.tail.next=nn;
//        }
//
//        if(this.size==0){
//            this.head=nn;
//            this.tail=nn;
//            this.size++;
//        }else{
//            this.tail=nn;
//            this.size++;
//        }
//    }
//    public void addFirst(T item){
//        Node nn=new Node();
//        nn.data=item;
//        nn.next=null;
//
//        //attach
//        if(this.size>=1){
//            nn.next=head;
//        }
//        if(this.size==0){
//            this.head=nn;
//            this.tail=nn;
//            this.size++;
//        }else{
//            this.head=nn;
//            this.size++;
//        }
//    }
//    public T getFirst() throws Exception{
//        if (this.size==0){
//            throw new Exception("LL is Empty");
//        }
//        return this.head.data;
//    }
//
//    public T getLast() throws Exception{
//        if (this.size==0){
//            throw new Exception("LL is Empty");
//        }
//        return this.tail.data;
//    }
//
//    public T getAt(int idx) throws Exception{
//        if(this.size==0){
//            throw new Exception("LL is empty");
//        }
//        if(idx<0|| idx>=this.size){
//            throw new Exception("Invalid index");
//        }
//        Node temp=this.head;
//        for (int i = 1; i <=idx ; i++) {
//            temp=temp.next;
//
//        }
//        return temp.data;
//    }
//
//    private Node getNodeAt(int idx) throws Exception{
//        if(this.size==0){
//            throw new Exception("LL is empty");
//        }
//        if(idx<0|| idx>=this.size){
//            throw new Exception("Invalid index");
//        }
//        Node temp=this.head;
//        for (int i = 1; i <=idx ; i++) {
//            temp=temp.next;
//
//        }
//        return temp;
//    }
//    //adding a new Node anywhere in Linked List
//    public void addAt(T item,int idx) throws Exception{
//        if(idx<0||idx>size){
//            throw new Exception("Invalid Index");
//        }
//        if(idx==0){
//            addFirst(item);
//        }else if(idx==this.size){
//            addLast(item);
//        }else{
//            //create a new node
//            Node nn=new Node();
//            nn.data=item;
//            nn.next=null;
//            //attach
//            Node nm1=getNodeAt(idx-1);
//            Node np1=nm1.next;
//
//            nm1.next=nn;
//            nn.next=np1;
//
//            //summary ...head and tail will not get affected by this
//            this.size++;
//        }
//
//    }
//    public T removeFirst()throws Exception{
//        if(this.size==0){
//            throw new Exception("LL is Empty");
//        }
//        T rv=this.head.data;
//        if(this.size==1){
//            this.head=null;
//            this.tail=null;
//            this.size=0;
//        }else{
//            this.head=this.head.next;
//            this.size--;
//        }
//        return rv;
//    }
//    public T removeLast()throws Exception {
//        if (this.size == 0) {
//            throw new Exception("LL is Empty");
//        }
//        T rv=this.tail.data;
//
//        if(this.size==1){
//            this.head=null;
//            this.tail=null;
//            this.size=0;
//        }else{
//            Node sizem2=getNodeAt(this.size-2);
//            this.tail=sizem2;
//            this.tail.next=null;
//            this.size--;
//        }return rv;
//    }
//
//    public T removeAt(int idx) throws Exception{
//        if(idx<0||idx>=this.size){
//            throw new Exception("Invalid Index");
//        }
//        if(idx==0){
//            return removeFirst();
//        }else if(idx==this.size-1){
//            return removeLast();
//        }else{
//            Node nm1=getNodeAt(idx-1);
//            Node n=nm1.next;
//            Node np1=n.next;
//
//            nm1.next=np1;
//
//            this.size--;
//            return n.data;
//
//        }
//    }
//}
