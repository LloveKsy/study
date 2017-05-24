package love12;

/**
 * Created by ln on 2017/5/24.
 */
public class ha {
    public static void main(String[] args) {
        try {
//            int i = 10/0;
            int i =4;
            if(i>1){
                return;
            }
            throw new RuntimeException("run...");
        }catch (Exception e){
            System.out.println("...");
        }finally {
            System.out.println("finally...");
        }
    }
}
