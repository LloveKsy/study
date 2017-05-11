package Test;

/**
 * Created by ln on 2017/5/11.
 */
public class digui {
    public static void main(String[] args){
        System.out.println(jc(4));
    }

    public static int jc(int n){
        if(n==1){
            return 1;
        }else {
            return n*jc(n-1);
        }
    }
}
