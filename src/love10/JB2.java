package love10;

/**
 * Created by ln on 2017/5/22.
 */
public class JB2 {
    public static void main(String[] args){
        JB2 j = new JB2();
        String love = j.show(2,20);
        System.out.println(love);
    }

    public String show(int i,int age){
        if(i==1){
            class love{
                private int age;

                public love(int age) {
                    this.age = age;
                }

                public String like(){
                    System.out.println("like:"+age);
                    return "ksy";
                }
            }
            love l = new love(age);
            return l.like();
        }else {
            return "error";
        }
    }
}
