import java.util.*;

public class queuell{

    public class Node{
        int data;
        Node next;
    }

    Node front;
    Node rear;

    public void insert(int val){
        Node temp = new Node();
        temp.data = val;
        if(front == null && rear == null){
            front = temp;
            rear = temp;
            front.next = null;
            rear.next = null;
        } else {
            rear.next = temp;
            rear = temp;
            rear.next = null;
        }
    }

    public void delete(){
        if(front == null){
            System.out.println("Underflow");
            return;
        } else {
            Node temp = new Node();
            temp = front.next;
            front = temp;
        }
    }

    public void peek(){
        if(front == null){
            System.out.println("underflow");
        } else {
            System.out.println("front element is "+ front.data);
        }
    }

    public void display(){
        Node temp = new Node();
        temp = front;
        System.out.println("elements in queue are \n");
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}