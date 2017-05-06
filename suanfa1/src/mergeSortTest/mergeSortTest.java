package mergeSortTest;

/**
 * Created by ln on 2017/5/1.
 */
public class mergeSortTest {
    public static void main(String[] args){
        int a[] = {3,2,12,1,6,5,4,9,8,7,5,22,31,4,5,6,7,1,66,2};
        mergeSort(a,0,a.length-1);
        showArray(a);
    }

    private static void mergeSort(int a[],int left,int right){
        if(left<right){
            //1.中间index
            int center = (left+right)/2;
            //2.
            mergeSort(a,left,center);
            mergeSort(a,center+1,right);
            //3.合并
            merge(a,left,center,right);
        }
    }

    public static void merge(int a[],int left,int center,int right){
        int temp[] = new int[a.length];
        //右数组的第一个索引
        int r1 = center+1;
        //左数组的第一个索引
        int l1 = left;
        //
        int t = left;
        //1.
        while(l1<=center&&r1<=right){
            if(a[l1]<a[r1]){
                temp[t] = a[l1];
                t++;
                l1++;
            }else {
                temp[t] = a[r1];
                t++;
                r1++;
            }
        }
        //2.
        while (r1<=right){
            temp[t]=a[r1];
            t++;
            r1++;
        }
        while (l1<=center){
            temp[t]=a[l1];
            t++;
            l1++;
        }
        //3 copy
        while (left<=right){
            a[left] = temp[left];
            left++;
        }
    }

    public static void showArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
}
