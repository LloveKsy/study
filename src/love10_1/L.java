package love10_1;

/**
 * Created by ln on 2017/5/23.
 */
public class L extends X.Y{
    public L(X x) {
        x.super();
    }
}

class X{
    public String love = "ksy";
    public static void main(String[] args){
        X x = new X();
        L l = new L(x);
        System.out.println(l.age+":"+l.getMyLove());
    }
    class Y{
         public int age = 10;
         String getMyLove(){
             return love;
         }
    }
}