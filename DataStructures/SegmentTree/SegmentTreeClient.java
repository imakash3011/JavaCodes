package Program_15.SegmentTree;

public class SegmentTreeClient {
    public static void main(String[] args) {
        int[] arr={3,8,7,6,-2,-8,4,9};

        SegmentTree tree=new SegmentTree(arr);
        tree.display();

        System.out.println("*******************");
        System.out.println("Sum is " + tree.query(2,6));
        System.out.println("Sum is " + tree.query(1,5));

        tree.update(3,14);
        tree.display();

        System.out.println("*******************");
        System.out.println("Sum is " + tree.query(2,6));
    }
}

