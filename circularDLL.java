import java.util.*;

public class circularDLL <T> {

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
        if(this.head == null){
            temp.next = temp;
            temp.previous = temp;
            this.head = temp;
            return;
        }
        Node ptr = this.head.previous;
        ptr.next = temp;
        temp.previous = ptr;
        temp.next = this.head;
        this.head.previous = temp;
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
        if(this.head == null){
            temp.next = temp;
            temp.previous = temp;
            this.head = temp;
            return;
        }
        Node var = this.head.previous;
        var.next = temp;
        temp.next = this.head;
        temp.previous = var;
        this.head.previous = temp;
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
        Node temp = this.head;
        temp.previous.next = temp.next;
        temp.next.previous = temp.previous;
        this.head = temp.next;
    }

    public void deleteEnd(){

        Node temp = this.head.previous;
        temp.previous.next = temp.next;
        temp.next.previous = temp.previous;
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
        while(temp.next!= this.head){
            deleteBeginning();
            temp = temp.next;
        }
        temp.next = null;
        this.head = null;
        System.out.println("List has been deleted");
    }

    public void display(){
        if(this.head == null){
            System.out.println("Empty Doubly Linked List");
            return;
        }
        Node temp = this.head;
        while (temp.next != this.head){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

}