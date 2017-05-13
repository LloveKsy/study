package Test5;

/**
 * Created by ln on 2017/5/12.
 */
public class Test3 {
    public Link start;
    public Link last;

    public void pushInStart(int key){
        Link link = new Link(key);
        if(start==null){
            start=link;
            last=link;
        }else {
            link.next=start;
            start=link;
            last.next=start;
        }
    }

    public void delete(int key){
        Link t = start;
        Link p = t;
        while (t!=last&&t.value!=key){
            p = t;
            t=t.next;
        }
        if(t==last){
            if(t.value!=key){
                System.out.println("error");
            }else {
                p.next = t.next;
                last=p;
            }
        }else if(t==start){
            last.next=start.next;
            start=last.next;
        }else {
            p.next=t.next;
        }
    }

    public void display(){
        Link t = start;
        while (t!=last){
            System.out.println(t.value);
            t=t.next;
        }
        System.out.println(last.value);
    }

    public Iterator getIterator(){
        Iterator it = new Iterator(start,this);
        return it;
    }
}
