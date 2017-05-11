package Test;

/**
 * Created by ln on 2017/5/11.
 */
public class erfen {

    public static void main(String[] args){
        int a[] = {1,3,4,5,6,7,8};
//        System.out.println(erfen(a,4));
        System.out.println(digui(a,7,0,a.length-1));
    }

    public static int digui(int a[],int v,int low,int hign){
        int m = (low+hign)/2;
        if(a[m]==v){
            return m;
        }else if(low<=hign){
            if(a[m]<v){
                return digui(a,v,m+1,hign);
            }else {
                return digui(a,v,low,m-1);
            }
        }else {
            System.out.println("error");
            return 0;
        }
    }

    public static int erfen(int a[],int value){
        int low = 0;
        int hign = a.length-1;
        int m ;
        while (true) {
            m = (low + hign) / 2;
            System.out.println(m+":"+a[m]);
            if (a[m] == value) {
                return m;
            } else if (low <= hign) {
                if (a[m] > value) {
                    hign = m - 1;
                } else {
                    low = m + 1;
                }

            } else {
                System.out.println("error");
                return 0;
            }
        }
    }
}
