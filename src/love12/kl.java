package love12;

/**
 * Created by ln on 2017/5/24.
 */
public class kl {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<5;i++){
            sb.append(i);
        }
        System.out.println(sb.toString());
        sb.delete(2,4);
        System.out.println(sb.toString());
    }
}
