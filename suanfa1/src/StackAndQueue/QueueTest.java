package StackAndQueue;

/**
 * Created by ln on 2017/5/7.
 */
public class QueueTest {
    public static void main(String[] args){
        Queue q = new Queue(5);
        q.push(3);
        q.push(5);
        q.push(1);
        q.push(4);
        q.push(6);
        //q.remove();
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        q.push(1);
        q.push(4);
        q.push(6);
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
