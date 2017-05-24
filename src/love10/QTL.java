package love10;

/**
 * Created by ln on 2017/5/22.
 */
public class QTL {
    public int age = 10;
    public String name = "ksy";

    class A{
        int a;
        int b;
        String name = "sy";
        void show(){
            System.out.println(QTL.this.age+":"+name);
        }
    }

    static class B{
        int a = 1;
        static int b = 2;
        void show(){
            System.out.println(a+":"+b);
        }
    }

    public static void main(String[] args){
        QTL q = new QTL();
//        QTL.A k1 = q.new A();
//        k1.show();

        QTL.B b1 = new QTL.B();
        b1.a = 12;
//        b1.b = 12;
        b1.show();
        QTL.B b2 = new QTL.B();
//        b2.a = 17;
        b2.show();
    }
}
