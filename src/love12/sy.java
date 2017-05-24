package love12;

/**
 * Created by ln on 2017/5/24.
 */
public class sy {
    public static void main(String[] args) {
        try {
            K k = new K();
            System.out.println(k.getClass());
            Class c = k.getClass();
            System.out.println(c.getName());
            System.out.println(c.getSimpleName());
//            throw new Exception("love sk");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e);
            e.printStackTrace(System.out);
        }
    }
}
