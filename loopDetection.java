import java.util.*;

public class loopDetection{

    public static void main(String args[]){

        LinkedList obj = new LinkedList();
        for(int i =0; i<5 ;i++ ){
            obj.insert(i,i);
        }
        obj.insert(0,5);
        obj.head.next.next.next.next = obj.head;
            int flag = 0;
            LinkedList.Node prev = obj.head;
            LinkedList.Node top = obj.head.next;
            while (prev != null) {
                while (top != null) {
                    if (prev == top) {
                        flag = 1;
                        break;
                    }
                    top = top.next;
                }
                if (flag == 1) {
                    break;
                }
                prev = prev.next;
            }
           // obj.show();
            if (flag == 0) {
                System.out.println("No loop present");
            } else {
                System.out.println("Loop detected");
            }
        }
}
