package LinkTest;

/**
 * Created by ln on 2017/5/10.
 */
public class linkTest {
    public static void main(String[] args){
        Link link1 = new Link(1);
        LinkList l1 = new LinkList(link1);
        Link link2 = new Link(2);
        Link link3 = new Link(3);
        Link link4 = new Link(4);
        Link link5 = new Link(5);
        l1.insertFirst(link2);
        l1.insertFirst(link3);
        l1.insertFirst(link4);
        l1.insertFirst(link5);
//        System.out.println(l1.delete().value);
//        System.out.println(l1.first.value);
//        l1.display();
        Link temp = l1.findByKey(4);
        if(temp!=null){
            System.out.println(temp.value);
        }
        Link t = l1.deleteByKey(3);
        if(t!=null){
            System.out.println(t.value);
        }
        System.out.println("----------");
        l1.display();
    }
}
