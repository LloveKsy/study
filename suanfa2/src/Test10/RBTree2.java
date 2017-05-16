package Test10;

/**
 * Created by ln on 2017/5/15.
 */
public class RBTree2 {
    public Node root;

    private static final boolean RED   = false;
    private static final boolean BLACK = true;

    //左旋
    private void leftRotate(Node node) {
        Node r = node.right;
        node.right=r.left;
        if(r.left!=null){
            r.left.parent=node;
        }

        r.parent=node.parent;
        if(node.parent==null){
            root = r;
        }else {
           if(node.parent.left==node){
               node.parent.left=r;
           }else {
               node.parent.right=r;
           }
        }

        r.left=node;
        node.parent=r;
    }

    //右旋
    public void rightRotate(Node node){
        Node l = node.left;
        node.left = l.right;
        if(l.right!=null){
            l.right.parent=node;
        }

        l.parent = node.parent;
        if(node.parent==null){
            root = l;
        }else {
            if(node.parent.left==node){
                node.parent.left=l;
            }else {
                node.parent.right=l;
            }
        }

        l.right = node;
        node.parent = l;
    }


    //插入node
    public void insert(Node node){
        boolean isLeft = true;
        Node t = root;
        Node p = null;
        while (t!=null){
            p = t;
            if (node.key<t.key){
                t=t.left;
                isLeft = true;
            }else {
                t=t.right;
                isLeft = false;
            }
        }
        node.parent = p;
        if(p==null){
            root = node;
        }else {
            if(isLeft){
                p.left = node;
            }else {
                p.right = node;
            }
        }

        // 2. 设置节点的颜色为红色
        node.color = RED;

        // 3. 将它重新修正为一颗二叉查找树
        insertFixUp(node);
    }

    private void insertFixUp(Node node){
        Node p;
        Node g ;
        //若父节点存在，并且父节点的颜色是红色
        while ((p=node.parent)!=null&&p.color==RED){
            System.out.println("line97:"+p.key);
            g = p.parent;
            System.out.println("line99:"+g.key);
            //1.若“父节点”是“祖父节点的左孩子
            if(g.left==p){
                //1.叔叔节点是红色
                if(g.right!=null&&g.right.color==RED){
                    System.out.println("line:104"+g.right.key);
                    setRed(g);
                    setBlack(g.right);
                    setBlack(p);
                    node = g;
                    continue;
                }
                //2.叔叔是黑色，且当前节点是右孩子
                if(node==p.right){
                    Node t;
                    leftRotate(p);
                    t = p;
                    p = node;
                    node = t;
                }
                //3.叔叔是黑色，且当前节点是左孩子
                setBlack(p);
                setRed(g);
                rightRotate(g);
                System.out.println("p:"+p.key);
            }else {
                Node uncle = g.left;
                if(uncle!=null&&uncle.color==RED){
                    setBlack(p);
                    setBlack(uncle);
                    setRed(g);
                    node = g;
                    continue;
                }
                if(p.left==node){
                    rightRotate(p);
                    Node t = p;
                    p = node;
                    node = t;
                }
                setRed(g);
                setBlack(p);
                leftRotate(g);
                System.out.println(12345);
            }
        }
        setBlack(root);
    }

    //插入value
    public void insert(int value){
        Node node = new Node(value,BLACK,null,null,null);
        insert(node);
    }

    public void setBlack(Node node){
        node.color=BLACK;
    }

    public void setRed(Node node){
        node.color=RED;
    }

    //中序遍历
    public void display(Node node){
        if(node.left!=null){
            display(node.left);
        }
        System.out.println(node.key);
        if(node.right!=null){
            display(node.right);
        }
    }

    public void show(Node node){
        System.out.println(node.key);
        if(node.left!=null){
            show(node.left);
        }
        if(node.right!=null){
            show(node.right);
        }
    }

}
