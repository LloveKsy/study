package Test8;

/**
 * Created by ln on 2017/5/13.
 */
public class Test {
    public static void main(String[] args){
        Queue q = new Queue(6);
        q.push(3);
        q.push(4);
        q.push(2);
        q.push(1);
        q.display();
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
    }
}
