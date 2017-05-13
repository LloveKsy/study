package Test8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by ln on 2017/5/12.
 */
public class hafuman {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        TreeQueue tq = new TreeQueue();
//        TreeList tl[] = new TreeList[9];
        System.out.println(1);
        for(int i=0;i<9;i++){
            int v = s.nextInt();
            String c = s.next();
            Tree root = new Tree(v,c);
            TreeList tl = new TreeList(root);
            tq.push(tl);
        }
//        tq.display();

        while (tq.start.next!=null){
            TreeList t1 = tq.pop();
//            System.out.println(t1.root.c);
            TreeList t2 = tq.pop();
            Tree root = new Tree(t1.root.value+t2.root.value,"L");
            root.left=t1.root;
            root.right=t2.root;
            TreeList t = new TreeList(root);
            tq.push(t);
        }

//        System.out.println(tq.pop().root.value);
        TreeList list = tq.pop();
//        list.root.display();
        Map<String,String> map = new HashMap<>();
        toChirld(list.root,"",map);
        for(Map.Entry<String,String> en:map.entrySet()){
            System.out.println(en.getKey()+":"+en.getValue());
        }
    }

    public static void toChirld(Tree tree,String v,Map m){
        if(tree.left!=null&&tree.right!=null){
            toChirld(tree.left,v+0,m);
            toChirld(tree.right,v+1,m);
        }else {
            m.put(tree.c,v);
        }
    }



}
