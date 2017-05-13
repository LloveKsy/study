package Test5;

/**
 * Created by ln on 2017/5/12.
 */
public class Test2 {
    public DoubleLink start;
    public DoubleLink last;

    public void pushInStart(int key){
        DoubleLink link = new DoubleLink(key);
        if(start==null){
            start=link;
            last=link;
        }else {
            link.next=start;
            start.prev=link;
            start=link;
        }
    }

    public void pushInLast(int key){
        DoubleLink link = new DoubleLink(key);
        if(last==null){
            start=link;
            last=link;
        }else {
            last.next=link;
            link.prev=last;
            last=link;
        }
    }

    public int popInStart(){
        int v = start.value;
        start=start.next;
        start.prev.next=null;
        start.prev=null;
        return v;
    }

    public int popInLast(){
        int v = last.value;
        last=last.prev;
        last.next.prev=null;
        last.next=null;
        return v;
    }

    public boolean isEmpty(){
        return start==null;
    }
}
