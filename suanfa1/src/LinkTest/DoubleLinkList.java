package LinkTest;

/**
 * Created by ln on 2017/5/11.
 */
public class DoubleLinkList {
    public DoubleLink start;
    public DoubleLink last;

    public void insertStart(int v){
        DoubleLink link = new DoubleLink(v);
        if(start==null){
            start=link;
            last=link;
        }else {
            link.next=start;
            start.prev=link;
            start=link;
        }
    }

    public void insertLast(int v){
        DoubleLink link = new DoubleLink(v);
        if(last==null){
            start=link;
            last=link;
        }else {
            last.next=link;
            link.prev=last;
            last=link;
        }
    }

    public int deleteStart(){
        int v = start.value;
        if (start.next==null){
            start= null;
            last = null;
        }else {
            start.next.prev=null;
            start=start.next;
        }
        return v;
    }

    public int deleteLast(){
        int v = last.value;
        if(last.prev==null){
            last=null;
            start=null;
        }else {
            last.prev.next=null;
            last=last.prev;
        }
        return v;
    }

    public void insertAfterKey(int key,int love){
        DoubleLink link = new DoubleLink(love);
        DoubleLink t = start;
        DoubleLink p = t;
        while (t!=null&&t.value!=key){
            p = t;
            t=t.next;
        }
        if(t==null){
            System.out.println("key is error!");
        }else {
            if(t.next==null){
                t.next=link;
                link.prev=t;
                last = link;
            }else {
                t.next.prev=link;
                link.next=t.next;
                t.next=link;
                link.prev=t;
            }
        }
    }

    public int deleteByKey(int key){
        DoubleLink t = start;
        DoubleLink p = t;
        while (t!=null&&t.value!=key){
            p = t;
            t = t.next;
        }
        if(t==null){
            System.out.println("key is error!");
            return 0;
        }else {
            p.next=t.next;
            t.next.prev=t.prev;
            return t.value;
        }
    }

    public void displayForward(){
        DoubleLink t = start;
        while (t!=null){
            System.out.println(t.value);
            t=t.next;
        }
    }

    public void displayBackward(){
        DoubleLink t = last;
        while (t!=null){
            System.out.println(t.value);
            t=t.prev;
        }
    }

    public Iterator getIterator(){
        Iterator item = new Iterator(this);
        return item;
    }
}
