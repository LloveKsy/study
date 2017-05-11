package LinkTest;

/**
 * Created by ln on 2017/5/11.
 */
public class OrderLinkTest {
    public static void main(String[] args){
        OrderLink ol = new OrderLink();
        ol.push(1);
        ol.push(4);
        ol.push(2);
        ol.push(6);
        ol.push(3);
//        System.out.println(ol.pop());
//        System.out.println(ol.pop());
//        System.out.println(ol.pop());
//        System.out.println(ol.pop());
//        System.out.println(ol.pop());
        System.out.println(ol.find(3));

    }
}
