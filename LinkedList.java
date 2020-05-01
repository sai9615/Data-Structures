import java.util.*;

public class LinkedList{

    public class Node{
        int data;
        Node next;
    }

    public Node head;

    public void insert(int value, int index ){
        Node temp = new Node();
        temp.data = value;
        temp.next = null;
        if(index ==0) {
            if(head == null){
                head = temp;
            } else {
                temp.next = head;
            }
        } else {
            Node n = head;
            for(int i=0; i<index-1; i++){
                  n = n.next;
            }
            if(n.next == null){ //insert at last
                temp.next = null;
                n.next = temp;    
            } else {
                temp.next = n.next;
                n.next = temp;  
            }
        }
    }

    public void deleteAt(int index){
        Node n = head;
        Node temp = new Node();
        if(index ==0){
            temp = head.next;
            head.next = null;
            head = temp;
        }
        for(int i=0; i<index-1; i++){
              n = n.next;
        }
        temp = n.next;
        n.next =  temp.next;
        temp = null;
    }

    public void update(int data, int index){
        Node n = head;
        for(int i=0; i<index; i++){
            n = n.next;
      }
      n.data = data;
    }

    public void show(){
        Node node = head;
        while(node.next!= null)
        {
            System.out.println(node.data);
            node = node.next; 
        } if(node.next == null){
            System.out.println(node.data);
        }
    }
}