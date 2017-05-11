package shellSortTest;

/**
 * Created by ln on 2017/5/11.
 */
public class shellSortTest3 {
    public static void main(String[] args){
        int a[] = {3,2,12,1,6,5,4,9,8,7,2,2,3,4,5,6,7,1,66,2};
        shellSort(a);
        shellSortTest.showArray(a);
    }

    public static void shellSort(int a[]){
        int d = a.length;
        while (d!=1){
            d=d/2;
            for(int i=0;i<d;i++){
                for(int j=i+d;j<a.length;j=j+d){
                    int value = a[j];
                    int k;
                    for(k=j;k>=d&&a[k]<a[k-d];k=k-d){
                        a[k]=a[k-d];
                    }
                    a[k]=value;
                }
            }
        }
    }
}
