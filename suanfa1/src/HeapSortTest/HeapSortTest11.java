package HeapSortTest;

/**
 * Created by ln on 2017/5/2.
 */
public class HeapSortTest11 {
    public static void main(String[] args){
        int a[] = {3,2,4,1,8,5,23,12,43,22,7};
        heapSort(a);
        showArray(a);
    }

    private static void jd(int a[],int n){
        boolean flag =false;
        for(int i=n;i>0;i--){
            if(a[i]<a[(i-1)/2]){
                swap(a,i,(i-1)/2);
                flag =true;
                break;
            }
        }
        if(flag){
            jd(a,n);
            return;
        }
    }

    private static void heapSort(int a[]){
        int t[] = new int[a.length];
        int n = a.length;
        int i = 0;
        do {
            n--;
            jd(a,n);
            t[i]=a[0];
            a[0]=a[n];
            i++;
        }while(n>1);
        t[i]=a[0];
        for(int j=0;j<a.length;j++){
            a[j]=t[j];
        }
    }

    public static void showArray(int a[]){
        for(int i=0;i<a.length;i++){
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
