package Program_8;

public class LinkedList {
    //starting  LinkedList from the Head
    Node head;

    //int data will take the values from the user
    public void insert(int data) {
        Node node = new Node();

        //taking data value on th e node
        node.data = data;

        node.next = null;

        //checking whether it is first elememnt or not
        //means head is null or not

        if (head == null) {
            head = node;
        } else {
            //if it is not null then make a node and make it as head
            Node n = head;
            //travelling all node and inserting a node in last
            while (n.next != null) {
                //if the node is not null then jump to next Node
                n = n.next;
            }
            // if got the null the change its reference
            n.next = node;
        }

    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            //while travelling the linked list print the data
            System.out.println(node.data);
            //after printing one node we are shifting to another node
            node=node.next;
        }
        //here we are printing last element manually
        //becz it will stop excution after finding the null value
        System.out.println(node.data);
    }

}
