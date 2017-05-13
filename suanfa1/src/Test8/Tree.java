package Test8;

/**
 * Created by ln on 2017/5/13.
 */
public class Tree {
    public int value;
    public String c;
    public Tree left;
    public Tree right;

    public Tree(int value,String c) {
        this.value = value;
        this.c = c;
    }

    public void display(){
        Tree t = this;
        if(t.left!=null){
            System.out.println(t.left.value);
        }else {
            System.out.println("left is Empty");
        }
        if(t.right!=null){
            System.out.println(t.right.value);
        }else {
            System.out.println("right is Empty");
        }
    }
}
