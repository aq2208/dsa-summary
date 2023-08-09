package src.DataStructures;

import java.util.Iterator;
import java.util.LinkedList;

public class DSA_LinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> linky = new LinkedList<>();

        linky.add(6);
        linky.add(78);
        linky.add(1);

        System.out.println(linky);
        System.out.println(linky.get(1));

        linky.remove();
        linky.clear();

        System.out.println(linky.getFirst());

        Iterator it = linky.iterator();
        while (it.hasNext()) {
            if((int)it.next() == 78) {
                System.out.println("Found 78");
            }
        }
    }

}
