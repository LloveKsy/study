package love10;

/**
 * Created by ln on 2017/5/22.
 */
public interface JKN {

    void love();

    class L implements JKN{
        static {
            System.out.println("hello ...");
        }
        @Override
        public void love() {
            System.out.println("love ksy");
        }

        public static void main(String[] args){
            System.out.println(1);
        }
    }

}
