package otherTopic;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add(1,"c");
        linkedList.add("d");
        linkedList.add("1");
        linkedList.add("5");
        linkedList.addFirst("f");
        linkedList.addLast("g");

//        while(linkedList.descendingIterator().hasNext()){
//          //  System.out.println(linkedList.descendingIterator().next());
//        }

        System.out.println(linkedList);
        System.out.println(linkedList.indexOf("a"));
        System.out.println(linkedList.offer("b")); // we are giving to another
        System.out.println(linkedList.remove("5"));
        System.out.println(linkedList.offer("b"));
        System.out.println(linkedList.offer("b"));


        System.out.println(linkedList);

    }





}
