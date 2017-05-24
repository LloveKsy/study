package love13;

import java.util.Formatter;

/**
 * Created by ln on 2017/5/24.
 */
public class k {
    public static void main(String[] args) {
        Formatter f = new Formatter(System.err);
//        f.format("%s .the. %d,%d\n","loveksy",1,2);
//        f.format("%3.6s...\n","loveyou");
//        f.format("%-5s...\n","love");
        String s = String.format("love.%d,%d",1,2);
        System.out.println(s);

    }

}
