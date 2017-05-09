package radixSortTest;

/**
 * Created by ln on 2017/5/9.
 */
public class radixSortTest1 {
    public static void main(String[] args){
        int a[] = {7333, 22, 93, 43, 55, 14, 28666, 65, 39, 81};
        Queue q[] = new Queue[10];
        for (int i =0;i<10;i++){
            q[i]=new Queue(a.length);
        }
        int n = getLength(a);
        for(int i=1;i<=n;i++){
            for(int j=0;j<a.length;j++){
               int t = getValue(a[j],i);
               q[t].push(a[j]);
            }
            int k=0;
            for (int s=0;s<10;s++){
                while (!q[s].isEmpty()){
                    a[k] = q[s].pop();
                    k++;
                }
            }
        }
        radixSortTest.showArray(a);

    }
    public static int getValue(int v,int j){
        int k=1;
        for (int s = 1;s<j;s++){
            k=k*10;
        }
        System.out.println(k);
        v = v/k;
        v=v%10;

        return v;
    }


    //得到位数
    public static int getLength(int a[]){
        int max = a[0];
        for (int i=1;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        int j = 0;
        while (max!=0){
            max = max/10;
            j++;
        }
        return j;
    }
}
