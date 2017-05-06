package study_1;

/**
 * Created by ln on 2017/4/30.
 */
public class quickSortTest1 {
    public static void main(String args[]){
        int a[] = {3,2,1,4,6,5,8,7,9,12,11,10};
        quickSort(a,0,a.length-1);
        quickSortTest.showArray(a);
    }

    private static int partition(int a[],int low,int high){
        int pivotKey = a[low];
        while (low<high){
            while (low<high&&a[high]>=pivotKey)high--;
            swap(a,low,high);
            while (low<high&&a[low]<=pivotKey)low++;
            swap(a,low,high);
        }
        return low;
    }

    private static void quickSort(int a[],int low,int high){
        if(low<high){
            int pivotKey = partition(a,low,high);
            quickSort(a,low,pivotKey-1);
            quickSort(a,pivotKey+1,high);
        }
    }

    private static void swap(int a[],int i,int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
