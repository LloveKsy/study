package Test8;

/**
 * Created by ln on 2017/5/13.
 */
public class TreeQueue {
    TreeList start;

    public void push(TreeList v){
        if(start==null){
            start = v;
        }else {
            TreeList t = start;
            TreeList p = t;
            while (t!=null&&v.root.value>t.root.value){
                p = t;
                t = t.next;
            }
            if(t==null){
                p.next=v;
            }else if(t==start){
                v.next=start;
                start=v;
            }else {
                v.next=p.next;
                p.next=v;
            }
        }
    }

    public TreeList pop(){
        TreeList t = start;
        start = start.next;
        return t;
    }

    public void display(){
        TreeList t = start;
        while (t!=null){
            System.out.println(t.root.value+":"+t.root.c);
            t=t.next;
        }
    }

}
