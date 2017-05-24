package love12;

/**
 * Created by ln on 2017/5/24.
 */
public class k3 {
    static void f(){
        throw new RuntimeException("love");
    }
    static void g(){
        f();
    }
    public static void main(String[] args) {
        g();
    }
}
