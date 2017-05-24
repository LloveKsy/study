package love10;

/**
 * Created by ln on 2017/5/22.
 */
public class JB {
    public static void main(String[] args){
        JB j = new JB();
        String love = j.show(20);
        System.out.println("my love:"+love);
    }

    public String show(int i){
        class nb{
            private int age;

            public nb(int age) {
                this.age = age;
            }

            public String s(){
                System.out.println("love ksy :她的年龄："+age);
                return "ksy";
            }
        }
        nb nb1 = new nb(i);
        return nb1.s();
    }
}
