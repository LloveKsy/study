package quickSortTest;

/**
 * Created by ln on 2017/5/1.
 */
public class quickSortTest {
    public static void main(String[] args){
        int a[] = {3,2,12,1,6,5,4,9,8,7,5,22,31,4,5,6,7,1,66,2};
        quickSort(a,0,a.length-1);
        showArray(a);
    }

    private static int partition(int a[],int low,int high){
        int base = a[low];
        while (low<high){
            while (low<high&&a[high]>=base)high--;
            swap(a,low,high);
            while (low<high&&a[low]<=base)low++;
            swap(a,low,high);
        }
        //a[low]=base;
        return low;
    }

    private static void quickSort(int a[],int low,int high){
        if(low<high){
            int base = partition(a,low,high);
            quickSort(a,low,base-1);
            quickSort(a,base+1,high);
        }
    }

    public static void showArray(int a[]){
        for (int i=0;i<a.length;i++){
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
