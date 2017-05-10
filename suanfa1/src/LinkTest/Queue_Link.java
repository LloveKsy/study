package LinkTest;

/**
 * Created by ln on 2017/5/10.
 */
public class Queue_Link {
    public Link start;
    public Link last;

    //从last进
    public void push(int v){
        Link link = new Link(v);
        if(start==null){
            start=link;
        }else {
            last.next=link;
        }
        last=link;
    }

    //从first出
    public int pop(){
        Link link = start;
        start=start.next;
        return link.value;
    }
}
