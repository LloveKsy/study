package love14;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ln on 2017/5/24.
 */
public class mmj {
    public static void main(String[] args) {
//        List<A> list = Arrays.asList(new B(),new C(),new D());
//        for (A a : list){
//            a.show();
//        }
        A a = new B();
        E e = new A();
        Class c = a.getClass();
        Class cc = e.getClass();
        System.out.println(c.getSimpleName());
        System.out.println(c.getName());
        System.out.println(c.getCanonicalName());
        System.out.println(c.isInterface());
        System.out.println(cc.isInterface());
        System.out.println("-----------------");
        Class ccc = c.getSuperclass();
        System.out.println(ccc.getName());
        System.out.println("-------------");
        System.out.println(A.class.getName());
        try {
            B b = (B)c.newInstance();
            b.show();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}
interface E{

}
class O{

}
class A extends O implements E{
    void show(){
        System.out.println(this+"love:ksy");
    }
    @Override
    public String toString() {
        return "A";
    }
}

class B extends A{
    void show(){
        System.out.println(this+"love:ksy");
    }
    @Override
    public String toString() {
        return "B";
    }
}

class C extends A{
    void show(){
        System.out.println(this+"love:ksy");
    }
    @Override
    public String toString() {
        return "C";
    }
}

class D extends A{
    void show(){
        System.out.println(this+"love:ksy");
    }
    @Override
    public String toString() {
        return "D";
    }
}
