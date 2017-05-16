package Test10;

/**
 * Created by ln on 2017/5/15.
 */
public class Node {
    boolean color;       // 颜色
    int key;             // 关键字(键值)
    Node left;           // 左孩子
    Node right;          // 右孩子
    Node parent;         // 父结点

    public Node(int key, boolean color, Node parent, Node left, Node right) {
        this.key = key;
        this.color = color;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }
}
