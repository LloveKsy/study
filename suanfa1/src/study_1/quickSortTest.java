package study_1;

/**
 * Created by ln on 2017/4/30.
 */
public class quickSortTest {
    public static void main(String[] args){
        int a[] = {3,2,12,1,6,5,4,9,8,7,2,2,3,4,5,6,7,1,66,2};
        quickSort(a,0,a.length-1);
        showArray(a);
    }

    private static void quickSort(int a[],int low,int high){
        if(low<high){
            int base = partition(a,low,high);
            quickSort(a,low,base-1);
            quickSort(a,base+1,high);
        }
    }

    private static int partition(int a[],int low,int high){
        int pivotKey = a[low];        //pivot:中心点
        while (low<high){
            while (low<high&&a[high]>=pivotKey)high--;
            swap(a,low,high);
            while (low<high&&a[low]<=pivotKey)low++;
            swap(a,low,high);
        }
        showArray(a);
        return low;
    }

    private static void swap(int a[],int i,int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void showArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
}
