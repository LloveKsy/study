package quickSortTest;

/**
 * Created by ln on 2017/5/9.
 */
public class quickSortTest2 {
    public static void main(String[] args){
        int a[] = {3,2,12,1,6,5,4,9,8,7,5,22,31,4,5,6,7,1,66,2};
        quickSort(a,0,a.length-1);
        quickSortTest.showArray(a);
    }

    public static int part(int a[],int low,int high){
        int v = a[low];
        while (low<high){
            while (low<high&&a[high]>=v)high--;
            a[low]=a[high];
            while (low<high&&a[low]<=v)low++;
            a[high]=a[low];
        }
        a[low]=v;
        return low;
    }

    public static void quickSort(int a[],int low,int high){
        if(low<high){
            int base = part(a,low,high);
            quickSort(a,low,base-1);
            quickSort(a,base+1,high);
        }
    }
}
