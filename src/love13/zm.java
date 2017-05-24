package love13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ln on 2017/5/24.
 */
public class zm {
    public static void main(String[] args) {
        System.out.println("123".matches("-?\\d+"));
        System.out.println("123".matches("-\\d+"));
//        String s = "lo_ve_k_sy";
//        String[] a = s.split("_");
//        for (String o :a){
//            System.out.println(o);
//        }
//        String s = "love123ksy";
//        String ss = s.replaceFirst("\\d","#");
//        System.out.println(ss);
        Pattern p = Pattern.compile("(-|\\+)?\\d+");
        Matcher m = p.matcher("love-123");
        System.out.println(m.find());
    }
}
