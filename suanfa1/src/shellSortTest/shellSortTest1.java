package shellSortTest;

/**
 * Created by ln on 2017/5/1.
 */
public class shellSortTest1 {
    public static void main(String[] args){
        int a1[] = {3,2,12,1,6,5,4,9,8,7,2,2,3,4,5,6,7,1,66,2};
        shellSort(a1);
        shellSortTest.showArray(a1);

    }

    private static void shellSort(int a[]){
        int d = a.length;
        while (d!=1){
            d=d/2;
            for(int i=0;i<d;i++){
                for(int j=i+d;j<a.length;j=j+d){
                    int value = a[j];
                    int k;
                    for(k=j;k>=d&&value<a[k-d];k=k-d){
                        a[k] = a[k-d];
                    }
                    a[k]=value;
                }
            }

        }
    }
}
