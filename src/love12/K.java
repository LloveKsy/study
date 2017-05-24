package love12;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by ln on 2017/5/23.
 */
public class K {
    public void f() throws GB {
        System.out.println("123");
        throw new GB();
    }
}

class GB extends Exception{
    public static void main(String[] args) {
        K k = new K();
        try {
            k.f();
        } catch (Exception gb) {
            System.out.println("haha");
//            gb.printStackTrace();
        }
    }
}
