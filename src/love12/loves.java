package love12;

/**
 * Created by ln on 2017/5/24.
 */
public class loves{
    static void f() throws k1{
        System.out.println("f()");
        throw new k1("f is error!");
    }

    static void g() throws k2{
        try {
            f();
        }catch (k1 e){
            System.out.print("g.exception:");
            e.printStackTrace(System.out);
            System.out.println("g is end..............");
            throw new k2("lovesy k2");
//            throw (Exception) e.fillInStackTrace();
        }
    }

    static void h() throws Exception{
        try {
            f();
        }catch (Exception e){
            System.out.print("h.exception:");
            e.printStackTrace(System.out);
            throw e;
//            throw (Exception) e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        try{
            g();
        }catch (k2 e){
            e.printStackTrace(System.out);
        }
        System.out.println("------------------------");
//        try{
//            h();
//        }catch (Exception e){
//            e.printStackTrace(System.out);
//        }


    }
}

class k1 extends Exception{
    public k1() {
    }

    public k1(String message) {
        super(message);
    }
}

class k2 extends Exception{
    public k2() {
    }

    public k2(String message) {
        super(message);
    }
}