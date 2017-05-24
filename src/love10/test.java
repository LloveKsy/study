package love10;

/**
 * Created by ln on 2017/5/22.
 */
public class test {
    public int age =20;
    public String name ="ksy";

    private class ksy{
        public int N;

        public ksy(int n) {
            N = n;
        }

        void love(){
            System.out.println(ksy.this);
            System.out.println("ln love "+name+":"+N+"年");
        }

        @Override
        public String toString() {
            return "ksy{" +
                    "N=" + N +
                    '}';
        }
    }

    public ksy getK(int n){
        return new ksy(n);
    }

    @Override
    public String toString() {
        return "test{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
