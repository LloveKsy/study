package TreeTest;

/**
 * Created by ln on 2017/5/8.
 */
public class priorityQueue {
    private int maxSize;
    private pTree pArray[];
    private int length;

    public priorityQueue(int maxSize) {
        this.maxSize = maxSize;
        pArray = new pTree[this.maxSize];
        length = 0;
    }

    public void push(pTree v){
        for(int i=length-1;i>=0;i--){
            if(v.root.key>pArray[i].root.key){
                pArray[i+1]=pArray[i];
            }else {
                pArray[i+1]=v;
                break;
            }
        }
        length++;
    }

    public pTree pop(){
        return pArray[--length];
    }

    public boolean isEmpty(){
        return length==0;
    }

    public boolean isFull(){
        return length==maxSize;
    }
}
