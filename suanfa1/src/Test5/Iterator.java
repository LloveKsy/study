package Test5;

/**
 * Created by ln on 2017/5/12.
 */
public class Iterator {
    public Link current;
    public Test3 t;

    public Iterator(Link link,Test3 t){
        current = link;
        this.t = t;
    }

    public int getValue(){
        return current.value;
    }

    public void delete(){
        t.delete(current.value);
        next();
    }

    public void next(){
        current = current.next;
    }

    public boolean isOne(){
        return t.start==t.last;
    }
}
