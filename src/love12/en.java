package love12;

/**
 * Created by ln on 2017/5/24.
 */
public class en {
    public static void main(String[] args) {
        try {
            try {
                throw new e1("...");
            } finally {
                throw new e2("2...");
//                System.out.println(123);
//                return;
            }
        } catch (Exception e) {
            System.out.println(11111111);
            e.printStackTrace(System.out);

        }
    }
}


class e1 extends Exception{
    public e1(String message) {
        super(message);
    }
}

class e2 extends Exception{
    public e2(String message) {
        super(message);
    }
}