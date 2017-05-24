package love12;

import java.util.List;

/**
 * Created by ln on 2017/5/24.
 */
public class dle {
    int age;

    public dle(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "_love:"+super.toString();
    }

    public static void main(String[] args) {
        dle d1 = new dle(10);
        dle d2 = new dle(11);
        dle d3 = new dle(12);
        System.out.println(d1);
    }
}
