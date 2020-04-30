import java.util.*;

public class multiStack{

    int max = 20;
    int arr[] = new int[max];
    int topA = -1;
    int topB = max -1;

    public void insertA(int num){
        if(topA == topB ){
            System.out.println("overflow");
            return;
        } else {
            topA++;
            arr[topA] = num;
        }
    }

    public void popA(){
        if(topA <= -1){
            System.out.println("underflow");
            return;
        } else {
            System.out.println(arr[topA]);
            topA--;
        }
    }

    public void showA(){
        if(topA == -1){
            System.out.println("Underflow");
            return;
        } else {
            for(int i=topA; i>=0; i--){
                System.out.println(arr[i]);
            }
        }
    }


    public void insertB(int num){
        if(topB == topA){
            System.out.println("overflow");
            return;
        } else {
            arr[topB] = num;
            topB--;
        }
    }

    public void popB(){
        if(topB == max){
            System.out.println("underflow");
            return;
        } else {
            System.out.println(arr[topB]);
            topB++;
        }
    }

    public void showB(){
        if(topB == max){
            System.out.println("Underflow");
            return;
        } else {
        for(int i=topB; i<max; i++){
            System.out.println(arr[i]);
            }
        }
    }

}
