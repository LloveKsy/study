package TreeTest;

/**
 * Created by ln on 2017/5/6.
 */
public class TreeTest {
    public static void main(String[] args){
        Tree t1 = new Tree();
        t1.insert(2,22);
        t1.insert(3,33);
        t1.insert(5,55);
        t1.insert(1,11);
        t1.inOrder(t1.root);
        Node n1 = t1.find(3);
        System.out.println(n1.color);
        Node n2 = t1.findMin();
        System.out.println(n2.color);
        Node n3 = t1.findMax();
        System.out.println(n3.color);
        t1.delete(2);
        t1.inOrder(t1.root);
    }
}
