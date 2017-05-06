package HeapSortTest;

/**
 * Created by ln on 2017/5/4.
 */
public class HeapSortTest {
    public static void main(String[] args){
        int a[] = {49,38,65,97,76,13,27,49};
        HeapSort(a);
        showArray(a);
    }

    private static void HeapSort(int a[]){
        int n = a.length-1;
        while (n!=0){
            for(int i=(n-1)/2;i>=0;i--){
                jd(a,i,n);
            }
            swap(a,0,n);
            showArray(a);
            n--;
        }
    }

    //n  0 start
    //parent     :(n-1)/2
    //leftChild  :n*2+1
    //rightChild :n*2+2
    private static void jd(int a[],int all,int last) {
        int nodelast = (last - 1) / 2;
        int n = all;

            if (n * 2 + 2 <= last) {
                if (a[n * 2 + 1] <= a[n * 2 + 2] && a[n * 2 + 1]<a[n]) {
                    swap(a, n, n * 2 + 1);
                    if (n * 2 + 1 <= nodelast) {
                        jd(a, n * 2 + 1, last);
                    }
                } else if(a[n * 2 + 1] >= a[n * 2 + 2] && a[n * 2 + 2]<a[n]){
                    swap(a, n, n * 2 + 2);
                    if (n * 2 + 2 <= nodelast) {
                        jd(a, n * 2 + 2, last);
                    }
                }
            } else {
                if (a[n * 2 + 1] < a[n]) {
                    swap(a, n, n * 2 + 1);
                    if (n * 2 + 1 <= nodelast) {
                        jd(a, n * 2 + 1, last);
                    }
                }
            }
        }


    public static void showArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }

    public static void swap(int a[],int i,int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
