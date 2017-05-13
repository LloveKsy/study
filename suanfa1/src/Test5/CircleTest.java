package Test5;

/**
 * Created by ln on 2017/5/12.
 */
public class CircleTest {
    public static void main(String[] args){
        int i = 5;
//        for(int i=1;i<=20;i++){
            Test3 t = new Test3();
            for (int j=7;j>0;j--){
                t.pushInStart(j);
            }
//            t.display();
            Iterator it = t.getIterator();

            while (!it.isOne()){
                for (int k=1;k<i;k++){
                    it.next();
                }
                it.delete();
            }
            System.out.println(it.getValue());
//        }
    }
}
