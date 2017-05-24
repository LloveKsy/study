package love12;

/**
 * Created by ln on 2017/5/24.
 */
public class ji {
    public void f1()throws ee1,ee2{
        System.out.println("f1");
    }

    public static void main(String[] args) {
        ji j = new ji2();
        try {
            j.f1();
        }catch (Exception e){
            System.out.println("ok");
        }
    }
}

class ji2 extends ji{
    public void f1()throws ee2{
        System.out.println("love.f1");
    }
}

class ee1 extends Exception{

}

class ee2 extends Exception{

}

class ee3 extends Exception{

}