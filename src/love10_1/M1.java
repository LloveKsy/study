package love10_1;

/**
 * Created by ln on 2017/5/23.
 */
public class M1 {
    public M1() {
        System.out.println("M1");
    }

    class M2{
        public M2() {
            System.out.println("M2");
        }
    }
    public static void main(String[] args){
        M1 m1 = new M1();
        M3 m3 = new M3(m1);
    }
}

class M3 extends M1.M2{
    public M3(M1 m1) {
        m1.super();
        System.out.println("M3");
    }
}
