package LinkTest;

/**
 * Created by ln on 2017/5/10.
 */
public class LinkList {
    public Link first;

    public LinkList(Link first) {
        this.first = first;
    }

    public void insertFirst(Link t){
        t.next=first;
        first = t;
    }

    public Link delete(){
        Link t = first;
        first = first.next;
        return t;
    }

    public void display(){
        Link t = first;
        while (t!=null){
            System.out.println(t.value);
            t=t.next;
        }
    }

    //findByKey
    public Link findByKey(int v){
        Link t = first;
        while (t!=null&&t.value!=v){
            t=t.next;
        }
        if(t!=null){
            return t;
        }else {
            System.out.println("sy:key为"+v+"的link不存在");
            return null;
        }
    }

    //deleteByKey
    public Link deleteByKey(int v){
        Link t = first;
        Link p = first;
        while (t!=null&&t.value!=v){
            p=t;
            t=t.next;
        }
        if(t!=null){
            if(t.next==null){
                p.next=null;
            }else{
                p.next=t.next;
            }
            return t;
        }
        return null;
    }
}
