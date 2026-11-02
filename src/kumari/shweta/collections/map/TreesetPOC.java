package kumari.shweta.collections.map;

import java.util.Comparator;
import java.util.TreeSet;

public class TreesetPOC {
    public static void main(String[] args) {

        TreeSet<Integer> set=new TreeSet<>();

        set.add(10);
        set.add(1);
       // set.add(null);
        set.add(0);
        set.add(6);
        set.add(5);

        TreeSet<Integer> set1=new TreeSet<>(Comparator.nullsFirst(Comparator.naturalOrder()));

        set1.add(0);
        set1.add(6);
        set1.add(5);
        set1.add(null);
        System.out.println(set1);

        System.out.println(set);

    }
}
