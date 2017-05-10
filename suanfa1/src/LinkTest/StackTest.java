package LinkTest;

/**
 * Created by ln on 2017/5/10.
 */
public class StackTest {
    public static void main(String[] args){
        Stack_Link stack = new Stack_Link();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
