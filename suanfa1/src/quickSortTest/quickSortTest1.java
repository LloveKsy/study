package quickSortTest;

/**
 * Created by ln on 2017/5/6.
 */
public class quickSortTest1 {
    public static void main(String[] args){
        int a[] = {3,2,7,5,4,99,54,22,12,17};
        quickSort(a,0,a.length-1);
        quickSortTest.showArray(a);
    }

    private static void quickSort(int a[],int low, int high){
        if(low<high){
            int m = partition(a,low,high);
            quickSort(a,low,m-1);
            quickSort(a,m+1,high);
        }
    }

    private static int partition(int a[],int low,int high){
        int base = a[low];
        while (low<high){
            while (low<high&&base<=a[high])high--;
            a[low] = a[high];
            while (low<high&&base>=a[low])low++;
            a[high] = a[low];
        }
        a[low]=base;
        return low;
    }
}
