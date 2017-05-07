package StackAndQueue;

/**
 * Created by ln on 2017/5/6.
 */
public class Stack {
    private int maxSize;
    private int stackArray[];
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int i){
        top++;
        stackArray[top]=i;
    }

    public int pop(){
        return stackArray[top--];
    }

    public int peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==maxSize-1;
    }
    public void show(){
        for(int i=0;i<=top;i++){
            System.out.print((char)stackArray[i]+" ");
        }
        System.out.println("");
    }
}
