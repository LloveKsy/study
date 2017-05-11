package LinkTest;

/**
 * Created by ln on 2017/5/11.
 */
public class Iterator {
    public DoubleLinkList outList;
    public DoubleLink current;

    public Iterator(DoubleLinkList list) {
        outList = list;
        reset();
    }

    public void reset(){
        current = outList.start;
    }

    public boolean nextLink(){
        current = current.next;
        if(current!=null){
            return true;
        }else {
            return false;
        }
    }

    public int getCurrent(){
        return current.value;
    }

    public boolean atEnd(){
        return current.next==null;
    }

    public void insertBefore(int v){
        DoubleLink link = new DoubleLink(v);
        DoubleLink t = outList.start;
        DoubleLink p = t;
        while (t!=current){
            p = t;
            t=t.next;
        }
        p.next = link;
        link.next = t;
    }

    public void insertAfter(int v){
        DoubleLink link = new DoubleLink(v);
        link.next = current.next;
        current.next = link;
    }

    public void deleteCurrent(){
        DoubleLink t = outList.start;
        DoubleLink p = t;
        while (t!=current){
            p = t;
            t=t.next;
        }
        p.next = current.next;
        current = p.next;
    }
}
