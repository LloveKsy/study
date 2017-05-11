package HeapSortTest;

/**
 * Created by ln on 2017/5/11.
 */
public class HeapSortTest2 {
    public static void main(String[] args){
        int a[] = {49,38,65,97,76,13,27,49};
        HeapSort(a);
        HeapSortTest.showArray(a);
    }

    public static void HeapSort(int a[]){
        for (int i=0;i<a.length-1;i++){
            jd(a,a.length-1-i);
            swap(a,0,a.length-1-i);
        }
    }

    public static void jd(int a[],int high){
        int n = (high-1)/2;
        for(int i=n;i>=0;i--){
            love(a,i,high);
        }
    }

    public static void love(int a[],int i,int high){
        int left = i*2+1;
        int right = i*2+2;
        if(right<=high){
            if(a[left]>=a[right]&&a[left]>a[i]){
                swap(a,left,i);
                love(a,left,high);
            }else if(a[right]>=a[left]&&a[right]>a[i]){
                swap(a,right,i);
                love(a,right,high);
            }
        }else if(left<=high){
            if(a[left]>a[i]){
                swap(a,left,i);
                love(a,left,high);
            }
        }
    }

    public static void swap(int a[],int i,int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
