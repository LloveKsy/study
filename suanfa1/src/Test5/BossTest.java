package Test5;

/**
 * Created by ln on 2017/5/12.
 */
public class BossTest {
    public static void main(String[] args){
        Test6 t = new Test6(4,4);
        t.display();
        System.out.println(t.getByX_Y(3,3));
        t.setByX_Y(3,3,666);
        t.display();
        System.out.println(t.getByX_Y(3,3));
    }
}
