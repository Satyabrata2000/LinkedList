package LinkedList;

import java.util.LinkedList;

public class Example1 {

    public static void main(String[] args) {

        //Adding elements in a linked list
        LinkedList ll = new LinkedList();
        ll.add("Object 1");
        ll.add("Object 2");
        ll.add("Object 3");
        ll.addFirst("Object 0");
        ll.addLast("Object 10");
        System.out.println("Original content of ll is " + ll);

        //deleting elements in a linked list
        ll.remove(2);
        System.out.println("After deletion, the content of ll is " + ll);

        //get and set a value
        Object val = ll.get(3);
        ll.set(2, (String) val + " changed");
        System.out.println("After changed " + ll);

    }
}
