package Test5;

/**
 * Created by ln on 2017/5/12.
 */
public class Test1 {
    public Link start;

    public void push(int key){
        Link link = new Link(key);
        if(start==null){
//            System.out.println("12:"+link.value);
            start=link;
        }else {
            Link t = start;
            Link p = t;
            while (t!=null&&t.value<key){
                p = t;
                t= t.next;
            }
            if(t==null){
                p.next = link;
//                System.out.println("23:"+link.value);
            }else {
                if(t==start){
                    link.next=start;
                    start=link;
                }else {
                    p.next = link;
                    link.next = t;
                }
//                System.out.println("27:"+link.value);
            }
        }
    }

    public int pop(){
        int v = start.value;
        start = start.next;
        return v;
    }

    public int peek(){
        return start.value;
    }

    public boolean isEmpty(){
        return start==null;
    }
}
