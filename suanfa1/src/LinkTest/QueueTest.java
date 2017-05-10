package LinkTest;

/**
 * Created by ln on 2017/5/10.
 */
public class QueueTest {
    public static void main(String[] args){
        Queue_Link queue = new Queue_Link();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }
}
