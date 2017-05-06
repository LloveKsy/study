package study_1;

/**
 * Created by ln on 2017/4/30.
 */
public class shellSortTest {
    public static void main(String[] args){
        int a[] = {4,3,2,1,6,5,7,8,9,76,34,23,11,12};
        shellInsertSort(a);
        showArray(a);
    }

    //希尔排序
    private static void shellInsertSort(int a[]){
        int d = a.length;
        while(d!=1){
            d = d/2;
            for(int i=0;i<d;i++){
                for (int j=i+d;j<a.length;j=j+d){
                    int t = a[j];
                    int k;
                    for (k=j-d;k>=0&&a[k]>a[j];k=k-d){
                        a[j] = a[k];
                    }
                    a[k+d] = t;
                }
            }
        }
    }

    private static void showArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
