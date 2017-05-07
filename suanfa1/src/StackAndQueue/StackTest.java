package StackAndQueue;

/**
 * Created by ln on 2017/5/6.
 */
public class StackTest {
    public static void main(String[] args){
        Stack s = new Stack(6);
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(4);
        s.push(5);
        s.push(6);
        System.out.println(s.isFull());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
