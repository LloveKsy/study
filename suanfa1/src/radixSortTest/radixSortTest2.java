package radixSortTest;

/**
 * Created by ln on 2017/5/10.
 */
public class radixSortTest2 {
    public static void main(String[] args){
        int[] a = { 49, 38, 65, 197, 76, 213, 27, 50333 };
        Queue q[] = new Queue[10];
        for(int i=0;i<10;i++){
            q[i]=new Queue(a.length);
        }
        for(int i=1;i<=getLength(a);i++){
            for(int j=0;j<a.length;j++){
                int v = getValue(a[j],i);
                q[v].push(a[j]);
            }
            int n = 0;
            for (int k=0;k<10;k++){
                while (!q[k].isEmpty()){
                    a[n]=q[k].pop();
                    n++;
                }
            }
        }
        radixSortTest.showArray(a);
    }

    //1.得到最大位数
    public static int getLength(int a[]){
        int max = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        int k = 0;
        while (max!=0){
            max=max/10;
            k++;
        }
        return k;
    }
    //2.取出指定位置的值
    public static int getValue(int v,int i){
        int k = 1;
        int n = 1;
        while (k<i){
            n=n*10;
            k++;
        }
        v=v/n;
        v=v%10;
        return v;
    }
}
