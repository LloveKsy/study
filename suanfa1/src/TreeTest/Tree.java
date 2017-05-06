package TreeTest;

/**
 * Created by ln on 2017/5/6.
 */
public class Tree {

    public Node root;
    //查找节点
    public Node find(int key){
        Node current = root;
        while (current.value!=key){
            if(key<current.value){
                current = current.left;
            }else{
                current = current.right;
            }
            if(current==null){
                return null;
            }
        }
        return current;
    }

    //查找最小节点
    public Node findMin(){
        Node current = root;
        while (true){
            if(current.left==null){
                break;
            }else {
                current = current.left;
            }
        }
        return current;
    }

    //查找最大节点
    public Node findMax(){
        Node current = root;
        while (true){
            if(current.right==null){
                break;
            }else {
                current = current.right;
            }
        }
        return current;
    }

    //插入节点
    public void insert(int v,int c){
        Node newNode = new Node();
        newNode.value = v;
        newNode.color = c;
        if(root == null){
            root = newNode;
        }else{
            Node current = root;
            Node parent;
            while (true){
                parent = current;
                if(v<parent.value){
                    current = parent.left;
                    if(current==null){
                        parent.left = newNode;
                        return;
                    }
                }else{
                    current = parent.right;
                    if(current==null){
                        parent.right=newNode;
                        return;
                    }
                }
            }
        }
    }
    //删除节点
    public boolean delete(int key){
        boolean isLeft = true;
        Node current = root;
        Node parent = current;
        while (current.value!=key){
            parent = current;
            if(key<current.value){
                isLeft = true;
                current = current.left;
            }else{
                isLeft = false;
                current = current.right;
            }
            if(current==null){
                return false;
            }
        }
        //1.
        if(current.left==null&&current.right==null){
            if(current==root){
                current=null;
            }else if(isLeft){
                parent.left=null;
            }else {
                parent.right=null;
            }
        //2.
        }else if(current.right==null){
            if(current==root){
                root = current.left;
            }else if(isLeft){
                parent.left=current.left;
            }else {
                parent.right=current.left;
            }
        //
        }else if(current.left==null) {
            if (current == root) {
                root = current.right;
            } else if (isLeft) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        //3.
        }else {
            Node node = getLast(current);
            if(current==root){
                root = node;
            }else if(isLeft){
                parent.left=node;
            }else {
                parent.right=node;
            }
            node.left = current.left;
        }
        return true;
    }

    //寻找后继节点
    public Node getLast(Node dNode){
        Node rNode = dNode.right;
        Node parent = dNode;
        while (rNode.left!=null){
            parent = rNode;
            rNode = rNode.left;
        }
        if(rNode!=dNode.right){
            parent.left=rNode.right;
            rNode.right=dNode.right;
        }
        return rNode;
    }

    //遍历
    //中序遍历
    public void inOrder(Node node){
        if(node!=null){
            inOrder(node.left);
            System.out.print(node.value+" ");
            inOrder(node.right);
        }
    }
}
