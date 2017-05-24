package love11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by ln on 2017/5/23.
 */
public class T {
    public static void main(String[] args){
       Collection list = new ArrayList(Arrays.asList(1,2,3,4,5));
       for (Object i:list){
           System.out.println(i);
       }
        System.out.println("---");
       List list2 = Arrays.asList(6,7,8,9);
       list.addAll(list2);
//       list.addAll(list2);
       for(Object o : list){
           System.out.println(o);
       }
    }
}
