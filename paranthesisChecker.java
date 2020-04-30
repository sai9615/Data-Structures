import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class paranthesisChecker{

    int max = 20;
    String arr[] = new String[max];
    public static int top = -1;
    public static int flag =1;

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the value");
        String strs = obj.nextLine();
        String [] arrs = strs.split("");
        paranthesisChecker objs = new paranthesisChecker();
        objs.paranthcheck(arrs);
    }

    public void paranthcheck(String []str){
        paranthesisChecker objs = new paranthesisChecker();
        for(int i=0; i<str.length; i++){
//            System.out.println(str[i]);
                if(str[i].equals("{") ||str[i].equals("(") ||str[i].equals("[")){
                    objs.insert(str[i]);
                }
                else if(str[i].equals("}") ||str[i].equals(")") ||str[i].equals("]")){
                    if(top == -1){
                        flag =0;
                    } else {
                        String temp = objs.pop();
                        if(str[i].equals("}") && (temp.equals("[")  || temp.equals("("))){
                            flag = 0;
                        }
                        if(str[i].equals(")") && (temp.equals("[")  || temp.equals("{"))){
                            flag = 0;
                        }
                        if(str[i].equals("]") && (temp.equals("{")  || temp.equals("("))){
                            flag = 0;
                        }
                    }
                }
        }
        if(top >= 0){
            flag = 0;
        }
        if(flag == 0){
            System.out.println("INVALID EXPRESSION");
        } else {
            System.out.println(top);
            System.out.println("VALID EXPRESSION");
        }
    }

    public void insert(String alph){
        if(top >= max){
            System.out.println("overflow");
            return;
        } else {
            top++;
            System.out.println("was here "+top );
            arr[top] = alph;
        }
    }

    public String pop(){
        if(top <= -1){
            System.out.println("underflow");
            return null;
        } else {
            System.out.println("was here abc");
            top--;
            return arr[top];
        }
    }


}