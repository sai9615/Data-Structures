import java.util.*;

public class queuearr{

    int max=20;
    int queue[] = new int[max];
    int front = -1;
    int rear = -1;

    public void insert(int num){

        if(rear == max -1){
            System.out.println("overflow");
            return;
        } else if(front == -1 && rear == -1){
            front =0;
            rear =0;
        } else {
            rear++;
        }
        queue[rear] = num;
    }

    public void delete(){
        int val;
        if(front ==-1 || front> rear){
            System.out.println("underflow");
            return;
        }
        else {
            val = queue[front];
            front++;
            System.out.println("deleted value is " +val);
        }
    }

    public void peek() {
        int val;
        if (front == -1 || front > rear) {
            System.out.println("underflow");
            return;
        } else {
            val = queue[front];
            System.out.println("front element is " +val);
        }
    }

    public void display(){
        if (front == -1 || front > rear) {
            System.out.println("underflow");
            return ;
        }
        System.out.println("elements of queue are \n");
        for(int i=front; i<=rear; i++){
            System.out.println(queue[i]);
        }

    }
}