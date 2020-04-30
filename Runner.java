import java.util.*;

public class Runner{

    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list.insert(2, 0);
//        list.insert(3, 1);
//        list.insert(4, 2);
//        list.insert(5, 3);
//        list.insert(8, 2);
//        list.deleteAt(2);
//        list.insert(8, 2);
//        list.update(10, 0);
//        list.show();

//        stackArray obj = new stackArray();
//        obj.insert(1);
//        obj.insert(2);
//        obj.pop();
//        obj.pop();
//        obj.pop();
//        obj.show();

//        stackll obj2 = new stackll();
//        for(int i=0; i<5; i++){
//            obj2.insert(i);
//        }
//        obj2.pop();
//        obj2.show();

//        queuearr obj3 = new queuearr();
//        for(int i=0; i<10; i++){
//            obj3.insert(i);
//        }
//        obj3.delete();
//        obj3.delete();
//        obj3.delete();
//        obj3.peek();
//        obj3.display();
//    }

//    queuell obj4 = new queuell();
//        for(int i=0; i<10; i++){
//        obj4.insert(i);
//    }
//        obj4.delete();
//        obj4.delete();
//        obj4.delete();
//        obj4.peek();
//        obj4.display();
//}

//    circularQueue obj5 = new circularQueue();
//        for(int i=0; i<20; i++){
//        obj5.insert(i);
//    }
//        obj5.delete();
//        obj5.delete();
//        obj5.delete();
//        obj5.insert(1);
//        obj5.peek();
//        obj5.display();

        doublyLinkedList<Integer> obj6 = new doublyLinkedList<Integer>();
        for(int i=0; i<5; i++){
        obj6.insertAtEnd(i);
        }
        obj6.insertAfter(obj5.head.next, 10);
        obj6.insertBefore(obj5.head, 20);
        obj6.deleteBefore(obj5.head.next);
        obj6.deleteAfter(obj5.head.next);
        obj6.deleteAll();
        obj6.display();
    }

}