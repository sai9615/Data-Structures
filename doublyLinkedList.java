import java.util.*;

public class doublyLinkedList <T> {

    public class Node{
        T data;
        Node previous;
        Node next;

        Node(T d){
            data = d;
        }
    }

    Node head;

    public void insertAtbeg(T data){
        Node temp = new Node(data);
        temp.next = head;
        temp.previous = null;
        if(this.head!= null){
            this.head.previous = temp;
        }
        this.head = temp;
    }

    public void insertAfter(Node prev_node, T data){
        Node temp = new Node(data);
        temp.previous = prev_node;
        temp.next = prev_node.next;
        prev_node.next = temp;
        if(temp.next.previous != null){
            temp.next.previous = temp;
        }
    }

    public void insertAtEnd(T data){
        Node temp = new Node(data);
        Node var;
        var = this.head;
        if(this.head == null){
            temp.next = null;
            temp.previous = null;
            this.head = temp;
            return;
        }
        while (var.next != null){
            var = var.next;
        }
        var.next = temp;
        temp.next = null;
        temp.previous = var;
    }

    public void insertBefore(Node curr_node, T data){
        Node temp = new Node(data);
        if(curr_node.previous == null){
            temp.previous = null;
            temp.next = curr_node;
            curr_node.previous = temp;
            this.head = temp;
            return;
        }
        temp.previous = curr_node.previous;
        temp.next = curr_node;
        curr_node.previous.next = temp;
        curr_node.previous = temp;
    }

    public void deleteBeginning(){
        if(this.head.next == null){
            this.head = null;
            return;
        }
        this.head = this.head.next;
        this.head.previous = null;
        return;
    }

    public void deleteEnd(){

        Node temp = this.head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.previous.next = null;
        return;
    }

    public void deleteAfter(Node prev_node){
        if(prev_node.next == null){
            System.out.println("No node present ahead for deletion");
        }
        Node temp = prev_node.next.next;
        prev_node.next = temp;
        temp.previous = prev_node;
        return;
    }

    public void deleteBefore(Node curr_node){
        if(curr_node.previous == null){
            System.out.println("No previous Node present for the current node");
            return;
        }
        if(curr_node.previous.previous == null){
            deleteBeginning();
            return;
        }
        Node temp = curr_node.previous.previous;
        temp.next = curr_node;
        curr_node.previous = temp;
        return;
    }

    public void deleteAll(){
        Node temp = this.head;
        while(temp!= null){
            deleteBeginning();
            temp = this.head;
        }
        System.out.println("List has been deleted");
    }

    public void display(){
        if(this.head == null){
            System.out.println("Empty Doubly Linked List");
            return;
        }
        Node temp = this.head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}