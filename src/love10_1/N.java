package love10_1;

/**
 * Created by ln on 2017/5/23.
 */
interface Counter{
    int next();
}

public class N {
    int count = 0;
    Counter getC1(final String name){
        class C1 implements Counter{
            public C1() {
                System.out.println("hello"+name);
            }

            @Override
            public int next() {
                System.out.print(name+":");
                return count++;
            }
        }
        return new C1();
    }

    Counter getC2(final String name){
        return new Counter() {
            {
                System.out.println("hello:"+name);
            }
            @Override
            public int next() {
                System.out.print(name+":");
                return count++;
            }
        };
    }

    public static void main(String[] args){
        N n = new N();
        Counter c1 = n.getC1("ksy");
        Counter c2 = n.getC2("SY");
        for (int i=0;i<5;i++){
            System.out.println(c1.next());
        }
        for (int i=0;i<5;i++){
            System.out.println(c2.next());
        }
    }
}
