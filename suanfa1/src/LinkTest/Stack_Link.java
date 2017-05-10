package LinkTest;

/**
 * Created by ln on 2017/5/10.
 */
public class Stack_Link {

    public Link first;

    public void push(int v){
        Link link = new Link(v);
        link.next=first;
        first=link;
    }

    public int pop(){
        Link t = first;
        first = t.next;
        return t.value;
    }

    public int Peek(){
        return first.value;
    }

    public boolean isEmpty(){
        return first==null;
    }
}
