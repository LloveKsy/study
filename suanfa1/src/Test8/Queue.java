package Test8;

/**
 * Created by ln on 2017/5/12.
 */
public class Queue {
    public int manSize;
    public int array[];
    public int start;
    public int last;
    public int length;

    public Queue(int manSize) {
        this.manSize = manSize;
        array = new int[manSize];
        start = 0;
        last = -1;
    }

    public void push(int v){
        if(last==-1){
            last=0;
            array[last]=v;
            System.out.println(v);
        }else {
            int i;
            for(i=last;i>=0&&v<array[i];i--){
                array[i+1]=array[i];
            }
            array[i+1]=v;
            System.out.println(v);
            last++;
        }
    }

    public int pop(){
        int v = array[last];
        last--;
        return v;
    }

    public int peek(){
        return array[last];
    }

    public boolean isEmpty(){
        return last==-1;
    }

    public void display(){
        for(int i=0;i<=last;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
    }
}
