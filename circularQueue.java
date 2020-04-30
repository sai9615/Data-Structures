import java.util.*;

public class circularQueue{
    int max=20;
    int queue[] = new int[max];
    int front = -1;
    int rear = -1;

    public void insert(int num) {

        if ((front == 0 && rear == max - 1) || (rear == front - 1)) {
            System.out.println("overflow");
            return;
        }  else if(front == -1 && rear == -1){
            front =0;
            rear =0;
        } else if(rear == max-1 && front!=0)
            rear = 0;
          else   {
            rear++;
        }
        queue[rear] = num;
    }

    public void delete(){
        int val;
        if(front == -1 ){
            System.out.println("underflow");
            return;
        }
        val = queue[front];
        System.out.println("deleted value is " +val);
        if(front == rear){
            front = rear = -1;
        }
        else if(front == max -1) {
            front = 0;
        } else {
            front++;
        }
    }

    public void peek() {
        int val;
        if (front == -1 && rear ==-1) {
            System.out.println("underflow");
            return;
        } else {
            val = queue[front];
            System.out.println("front element is " +val);
        }
    }

    public void display(){
        if (front == -1 && rear == -1) {
            System.out.println("underflow");
            return ;
        }
        System.out.println("elements of queue are \n");
        if(front < rear){
            for(int i=front; i<=rear; i++){
                System.out.println(queue[i]);
            }
        } else {
            for(int i=front; i<=max-1; i++){
                System.out.println(queue[i]);
            }
            for(int i=0; i<=rear; i++){
                System.out.println(queue[i]);
            }
        }
    }
}