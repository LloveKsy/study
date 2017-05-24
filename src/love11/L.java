package love11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by ln on 2017/5/23.
 */
public class L {
    public static void main(String[] args) {
        Random r = new Random(40);
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Iterator it = list.iterator();
        System.out.println(it.next());
    }
}
