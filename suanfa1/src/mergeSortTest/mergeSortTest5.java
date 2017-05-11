package mergeSortTest;

/**
 * Created by ln on 2017/5/11.
 */
public class mergeSortTest5 {

    public static void main(String[] args){
        int a[] = {3,2,12,1,6,5,4,9,8,7,5,22,31,4,5,6,7,1,66,2};
        mergeSort(a,0,a.length-1);
        mergeSortTest.showArray(a);
    }

    public static void mergeSort(int a[],int low,int high){
        if(low<high){
            int m = (low+high)/2;
            mergeSort(a,low,m);
            mergeSort(a,m+1,high);
            merge(a,low,m,high);
        }
    }

    public static void merge(int a[],int low,int m,int high){
        int t[] = new int[a.length];
        int r = m+1;
        int k=low;
        int start = low;
        while (low<=m&&r<=high){
            if(a[low]<a[r]){
                t[k]=a[low];
                low++;
            }else {
                t[k]=a[r];
                r++;
            }
            k++;
        }
        while (low<=m){
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
