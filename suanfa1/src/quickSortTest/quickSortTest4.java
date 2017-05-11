package quickSortTest;

/**
 * Created by ln on 2017/5/11.
 */
public class quickSortTest4 {
    public static void main(String[] args){
        int a[] = {3,2,12,1,6,5,4,9,8,7,5,22,31,4,5,6,7,1,66,2};
        quickSort(a,0,a.length-1);
        quickSortTest.showArray(a);
    }

    public static void quickSort(int a[],int low,int high) {
        if (low < high) {
            int base = part(a,low,high);
            quickSort(a,low,base-1);
            quickSort(a,base+1,high);
        }
    }

    public static int part(int a[],int low,int high){
        int value = a[low];
        while (low<high){
            while (low<high&&a[high]>=value)high--;
            a[low]=a[high];
            while (low<high&&a[low]<=value)low++;
            a[high]=a[low];
        }
        a[low]=value;
        System.out.println(low+"--"+high);
        return low;
    }
}
