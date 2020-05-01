import java.util.*;

public class reversell{

    public static void main(String args[]){

        LinkedList obj = new LinkedList();
        for(int i =0; i<5 ;i++ ){
            obj.insert(i,i);
        }

        LinkedList.Node prev;
        LinkedList.Node top;
        LinkedList.Node current = obj.head;
        prev  = null;

       while (current!=null){
           top = current.next;
           current.next = prev;
           prev = current;
           current = top;
       }

       obj.head = prev;
       obj.show();
    }
}