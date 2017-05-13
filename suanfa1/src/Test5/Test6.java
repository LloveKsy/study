package Test5;

/**
 * Created by ln on 2017/5/12.
 */
public class Test6 {
    public Link2 start;

    public Test6(int x,int y) {
//        System.out.println(x+":"+y);
        for(int i=1;i<=x;i++){
//            System.out.println(i);
            push_r(i);
            for (int j=1;j<y;j++){
//                System.out.println(j);
                push_l(i*j,i);
            }
        }
//        System.out.println("init over");
    }

    public void push_r(int value){
        Link2 link2 = new Link2(value);
        if(start==null){
            start=link2;
        }else {
            Link2 t = start;
            while (t.next_R!=null){
                t=t.next_R;
            }
            t.next_R = link2;
        }
    }

    public void push_l(int value,int r){
        Link2 link2 = new Link2(value);
        Link2 t = start;
        for (int i=1;i<r;i++){
            t=t.next_R;
        }

        while (t.next_L!=null){
            t = t.next_L;
        }
        t.next_L=link2;

    }

    public void display(){

        Link2 t = start;
        while (t!=null){
            System.out.print(t.value+" ");
            Link2 tt = t.next_L;
            while (tt!=null){
                System.out.print(tt.value+" ");
                tt=tt.next_L;
            }
            System.out.println("");
            t=t.next_R;
        }
    }

    public int getByX_Y(int x,int y){
        Link2 t = start;
        for (int i=1;i<x;i++){
            t=t.next_R;
        }
        for (int j=1;j<y;j++){
            t=t.next_L;
        }
        return t.value;
    }

    public void setByX_Y(int x,int y,int value){
        Link2 t = start;
        for (int i=1;i<x;i++){
            t=t.next_R;
        }
        for (int j=1;j<y;j++){
            t=t.next_L;
        }
        t.value = value;
    }
}
