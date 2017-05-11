package LinkTest;

/**
 * Created by ln on 2017/5/11.
 */
public class OrderLink {
    public Link start;

    public void push(int v){
        Link link = new Link(v,v*10);
        Link t = start;
        if(start==null){
            start=link;
        }else {
            Link p = t;
            while (t!=null&&v>t.value){
                p = t;
                t=t.next;
            }
            if(t==null){
                p.next=link;
            }else {
                p.next=link;
                link.next=t;
            }
        }
    }

    public int pop(){
        int v = start.value;
        start=start.next;
        return v;
    }

    public int find(int key){
        Link t = start;
        while (t!=null&&t.value!=key){
            t=t.next;
        }
        if(t==null){
            System.out.println("key is error");
            return 0;
        }else {
            return t.love;
        }
    }

    public int peek(){
        return start.value;
    }

    public boolean isEmpty(){
        return start==null;
    }
}
