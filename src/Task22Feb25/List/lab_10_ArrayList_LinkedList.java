package Task22Feb25.List;

import com.sun.source.tree.ArrayAccessTree;

import java.util.*;

public class lab_10_ArrayList_LinkedList {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Node 1");
        l.add("Node 2");
        l.add("Node 3");
        l.add("Node 4");
        System.out.println(l);

        ArrayList l2 = new ArrayList();
        l2.add("Node 1");
        l2.add("Node 2");
        l2.add("Node 3");
        l2.add("Node 4");
        System.out.println(l2);
    }
}
