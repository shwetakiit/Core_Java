package kumari.shweta.collections.map;

import java.util.IdentityHashMap;

public class IdentityMap {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> identityHashMap= new IdentityHashMap<>();
        identityHashMap.put("A",1);
        identityHashMap.put(new String("A"),2);
        System.out.println(identityHashMap);
        identityHashMap.remove("A");
        System.out.println(identityHashMap);
    }
}
