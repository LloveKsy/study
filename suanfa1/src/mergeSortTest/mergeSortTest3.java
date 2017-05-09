package mergeSortTest;

/**
 * Created by ln on 2017/5/9.
 */
public class mergeSortTest3 {
    public static void main(String[] args){
        int a[] = {3,2,12,1,6,5,4,9,8,7,5,22,31,4,5,6,7,1,66,2};
        mergeSort(a,0,a.length-1);
        mergeSortTest.showArray(a);
    }

    public static void mergeSort(int a[],int left,int right){
        if(left<right){
            int center = (left+right)/2;
            mergeSort(a,left,center);
            mergeSort(a,center+1,right);
            merge(a,left,center,right);
        }
    }

    public static void merge(int a[],int left,int center,int right){
        int t[] = new int[a.length];
        int i = left;
        int start = left;
        int r = center+1;
        while (left<=center&&r<=right){
            if(a[left]<a[r]){
                t[i]=a[left];
                left++;
            }else{
                t[i]=a[r];
                r++;
            }
            i++;
        }
        while (left<=center){
            t[i]=a[left];
            left++;
            i++;
        }
        while (r<=right){
            t[i]=a[r];
            r++;
            i++;
        }
        for(;start<=right;start++){
            a[start]=t[start];
        }
    }
}
