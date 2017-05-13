package Test5;

/**
 * Created by ln on 2017/5/12.
 */
public class Test {
    public static void main(String[] args){
//        Test1 q = new Test1();
//        q.push(3);
//        q.push(4);
//        q.push(2);
//        q.push(1);
//        q.push(5);
//        System.out.println(q.pop());
//        System.out.println(q.pop());
//        System.out.println(q.pop());
//        System.out.println(q.pop());
//        System.out.println(q.pop());

        Test2 d = new Test2();
        d.pushInStart(1);
        d.pushInStart(2);
        d.pushInStart(3);
        d.pushInLast(10);
        System.out.println(d.popInStart());
//        System.out.println(d.popInLast());
    }
}
