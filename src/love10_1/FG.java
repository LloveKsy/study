package love10_1;

/**
 * Created by ln on 2017/5/23.
 */
public class FG {
    F1 f = new F1();
    class F1{
        void f(){
            System.out.println("FG-F1-f()");
        }
    }
    void show(){
        f.f();
    }
    public static void main(String[] args){
        FG f = new FG2();
        f.show();
    }
}

class FG2 extends FG{
    public FG2() {
//        super.f = new FG2.F1();
    }

    class F1 extends FG.F1{
        void f(){
            System.out.println("FG2-F1-f()");
        }
    }
}