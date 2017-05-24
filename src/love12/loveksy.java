package love12;

import java.util.Scanner;

/**
 * Created by ln on 2017/5/23.
 */
public class loveksy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        if(i>5){
            throw new NullPointerException("loveksy");
        }
        System.out.println("loveksyforever!");
    }
}
