import java.util.*;

public class removeDupLL{

    public static void main(String args[]){

        LinkedList obj = new LinkedList();
        for(int i =0; i<5 ;i++ ){
            obj.insert(i,i);
        }
        obj.insert(0,5);
        obj.insert(1,6);
        LinkedList.Node prev = obj.head;
        LinkedList.Node top = obj.head.next;
        LinkedList.Node temp = prev;
        LinkedList.Node delete = top;

        while (prev != null) {
            while (delete != null) {
                if (prev.data == delete.data) {
                    temp.next = delete.next;
                    delete.next = null;
                    delete = temp.next;
                } else {
                    temp = delete;
                    delete = delete.next;
                }
            }
            if(prev.next == null){
                break;
            }
            prev = prev.next;
            delete = prev.next;
        }
        obj.show();

    }
}