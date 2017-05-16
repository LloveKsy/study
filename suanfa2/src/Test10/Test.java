package Test10;

/**
 * Created by ln on 2017/5/16.
 */
public class Test {
    public static void main(String[] args){
        RBTree2 tree = new RBTree2();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
//        tree.insert(1);
//        tree.display(tree.root);
        tree.show(tree.root);
    }
}
