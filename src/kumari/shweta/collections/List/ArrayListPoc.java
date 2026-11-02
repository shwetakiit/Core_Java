package kumari.shweta.collections.List;

import java.util.ArrayList;

public class ArrayListPoc {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
     arrayList.add(10);
     arrayList.add(11);
     arrayList.add(12);
     arrayList.add(1,20);
   // arrayList.remove(10);//Index 10 out of bounds for length 4
        arrayList.add(1,21);
        arrayList.set(4,30); // It doesn't add value .. It update   the element at given index
        arrayList.remove(new Integer(30));// Remove Object
     System.out.println(arrayList);

    }
}
