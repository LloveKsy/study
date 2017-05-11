package LinkTest;

/**
 * Created by ln on 2017/5/11.
 */
public class DoubleLinkTest {
    public static void main(String[] args){
        DoubleLinkList link = new DoubleLinkList();
        link.insertStart(1);
        link.insertStart(3);
        link.insertStart(5);
        link.insertStart(2);
        link.insertStart(4);
        link.insertAfterKey(3,66);

        Iterator item = link.getIterator();
        item.deleteCurrent();
        do{
            System.out.println(item.getCurrent());
        }while (item.nextLink());
    }
}
