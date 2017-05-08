package StackAndQueue;

import java.util.Scanner;

/**
 * Created by ln on 2017/5/7.
 */
//Postfix:后缀
public class Postfix {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String R = inverse_L(str);
        System.out.println(R);
        int value = getValue(R);
        System.out.println(value);
    }

    //求后缀表达式的值
    public static int getValue(String s){
        Stack stack = new Stack(s.length());
        char c ='1';
        String s_v = "";
        int v  = 0;
        int v1 = 0;
        int v2 = 0;
        for (int i=0;i<s.length();i++){
            c = s.charAt(i);
            if(c>='1'&&c<='9'){
                s_v = c+"";
                stack.push(Integer.parseInt(s_v));
            }else {
                v1 = stack.pop();
                v2 = stack.pop();

                v = calculate(v2,v1,c);
                stack.push(v);
            }
        }
        return stack.pop();
    }

    //算术式转换为后缀表达式
    public static String inverse_L(String s){
        int this_v = 0;
        char top = 0;
        int top_v = 0;
        String r = "";
        Stack stack = new Stack(s.length());
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='1'&&c<='9'){
                r=r+c;
            }else {
                this_v = getL(c);
                if(stack.isEmpty()){
                    stack.push(c);
                }else {
                    top =(char)stack.pop();
                    top_v = getL(top);
                    if(top_v>=this_v){
                        if(top=='('){
                            stack.push(top);
                            stack.push(c);
                        }else {
                            r=r+top;
                            while (true) {
                                if(stack.isEmpty()){
                                    break;
                                }
                                top = (char) stack.pop();
                                top_v = getL(top);
                                if(top_v==3){
                                    stack.push(top);
                                    break;
                                }
                                if (top_v < this_v ) {
                                    break;
                                }
                                r=r+top;

                            }
                            stack.push(c);
                        }
                    }else {
                        if(c=='('){
                            stack.push(top);
                            stack.push(c);
                        }else if(c==')'){

                            r=r+top;

                            if(stack.isEmpty()){
                            }else {
                                while (true) {
                                    top = (char) stack.pop();
                                    if (top == '(') {
                                        break;
                                    }
                                    r = r + top;
                                }
                            }
                        }else {
                            stack.push(top);
                            stack.push(c);
                        }
                    }
                }
            }
        }
        while (!stack.isEmpty()){
            top = (char)stack.pop();
            r=r+top;

        }
        return r;
    }

    public static int getL(char c){
        int value = 0;
        switch (c){
            case '+':
            case '-':value=1;break;
            case '*':
            case '/':value=2;break;
            case '(':
            case ')':value=3;break;
        }
        return value;
    }

    public static int calculate(int i,int j,int o){
        int value = 0;
        switch (o){
            case '+':value=i+j;break;
            case '-':value=i-j;break;
            case '*':value=i*j;break;
            case '/':value=i/j;break;
        }
        return value;
    }
}
