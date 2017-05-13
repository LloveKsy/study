package Test8;

/**
 * Created by ln on 2017/5/13.
 */
public class TreeList {

    public Tree root;

    //因为队列才存在
    public TreeList next;

    public TreeList() {

    }

    public TreeList(Tree root) {
        this.root = root;
    }

    //insert
    public void insert(int v,String s){
        Tree tree = new Tree(v,s);
        if(root==null){
            root = tree;
        }else {

        }
    }
}
