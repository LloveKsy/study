package love10;

/**
 * Created by ln on 2017/5/22.
 */
public class DG {
    private void f1(){
        System.out.println("f1");
    }
    class N1{
        private void f2(){
            System.out.println("f2");
        }
        class N2{
            private void f3(){
                f1();
                f2();
            }
        }
    }

    public static void main(String[] args){
        DG dg = new DG();
        DG.N1 n1 = dg.new N1();
        DG.N1.N2 n2 = n1.new N2();
        n2.f3();
    }
}
