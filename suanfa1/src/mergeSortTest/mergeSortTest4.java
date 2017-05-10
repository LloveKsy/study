package mergeSortTest;

/**
 * Created by ln on 2017/5/10.
 */
public class mergeSortTest4 {
    public static void main(String[] args){
        int a[] = {3,2,12,1,6,5,4,9,8,7,5,22,31,4,5,6,7,1,66,2};
        mergeSort(a,0,a.length-1);
        mergeSortTest.showArray(a);
    }

    public static void mergeSort(int a[],int low,int high){
        if(low<high){
            int base = (low+high)/2;
            mergeSort(a,low,base);
            mergeSort(a,base+1,high);
            merge(a,low,base+1,high);
        }
    }
    public static void merge(int a[],int low,int base,int high){
        int t[] = new int[a.length];
        int r = base;
        int k = low;
        int start = low;
        while (low<base&&r<=high){
            if(a[low]<a[r]){
                t[k]=a[low];
                low++;
            }else {
                t[k]=a[r];
                r++;
            }
            k++;
        }
        while (low<base){
            t[k]=a[low];
            low++;
            k++;
        }
        while (r<=high){
            t[k]=a[r];
            r++;
            k++;
        }
        for(;start<=high;start++){
            a[start]=t[start];
        }
    }
}
