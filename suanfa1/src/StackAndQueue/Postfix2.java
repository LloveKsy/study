package StackAndQueue;

import java.util.Scanner;

/**
 * Created by ln on 2017/5/12.
 */
public class Postfix2 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String value = reverseLast(str);
        System.out.println(value);
        int v = getValue(value);
        System.out.println(v);
    }
    //后缀求值
    public static int getValue(String s){
        Stack stack = new Stack(s.length());
        int z = 0;
        int v1 = 0;
        int v2 = 0;
        int value = 0;
        for(int i=0;i<s.length();i++){
            char v = s.charAt(i);
            if(v>='1'&&v<='9'){
                z = Integer.parseInt(v+"");
                stack.push(z);
            }else {
                v1 = stack.pop();
                v2 = stack.pop();
                value = jisuan(v,v2,v1);
                stack.push(value);
            }
        }
        return stack.pop();
    }

    public static int jisuan(char c,int v1,int v2){
        int v = 0;
        switch (c){
            case '+':v=v1+v2;break;
            case '-':v=v1-v2;break;
            case '*':v=v1*v2;break;
            case '/':v=v1/v2;break;
        }
        return v;
    }

    //中缀转后缀
    public static String reverseLast(String s){
        Stack stack = new Stack(s.length());
        String t = "";
        int v_p = 0;
        char top = 0;
        int top_p = 0;
        for (int i=0;i<s.length();i++){
            char v = s.charAt(i);
            if(v>='1'&&v<='9'){
                t=t+v;
            }else {
                if(stack.isEmpty()){
                    stack.push(v);
                }else {
                    top = (char)stack.pop();
                    v_p = getL(v);
                    top_p = getL(top);
                    if(top_p==3||v=='('||(top_p==1&&v_p==2)){
                        stack.push(top);
                        stack.push(v);
                    }else if(v==')'){
                        t=t+top;
                        top = (char)stack.pop();
                        while (top!='('){
                            t=t+top;
                            top = (char)stack.pop();
                        }
                    }else if(top_p==v_p&&top_p!=3){
                        t=t+top;
                        stack.push(v);
                    }else if(top_p==2&&v_p==1){
                        t=t+top;
                        while (!stack.isEmpty()){
                            top = (char)stack.pop();
                            if(top=='('){
                                stack.push(top);
                            }else {
                                t=t+top;
                            }
                        }
                        stack.push(v);
                    }
                }
            }
        }
        while (!stack.isEmpty()){
            top = (char)stack.pop();
            t=t+top;
        }
        return t;
    }

    public static int getL(char c){
        int v = 0;
        switch (c){
            case '+':
            case '-':v = 1;break;
            case '*':
            case '/':v = 2;break;
            case '(':
            case ')':v = 3;break;
        }
        return v;
    }

}
