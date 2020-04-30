import java.util.*;

public class stackll{
    public class Node{
        int data;
        Node next;
    }

    Node head;

    public void insert(int num){
        if(head == null){
            Node temp = new Node();
            temp.data = num;
            temp.next = null;
            head = temp;
        } else {
            Node temp = new Node();
            temp.data = num;
            temp.next = head;
            head = temp;
        }
    }

    public void pop(){
        if(head == null){
            System.out.println("Stack is empty");
            return;
        } else {
            Node temp = new Node();
            temp = head;
            head = temp.next;
            temp = null;
        }
    }

    public void show(){
        Node node = head;
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }
}