package kumari.shweta.coding;

import java.util.*;
import java.util.stream.Collectors;

public class Anagram {

    //Normal approach without using stream
    private static void printAnagram(String[] str) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            String s1 = str[i];
            char[] ch = s1.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if (map.containsKey(key)) {
                map.get(key).add(s1);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s1);
                map.put(key, list);
            }
        }
        System.out.println(map.values());
    }

    //Using stream
    private static void printAnagramUsingStream(String[] str) {
        Map<String, List<String>> map = Arrays.stream(str).collect(Collectors.groupingBy(s -> {
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            return new String(ch);
        }));
        System.out.println(map.values());
    }

    public static void main(String[] args) {
        String str[] = {"act", "pots", "tops", "cat", "stop", "hat"};
        printAnagram(str);
        printAnagramUsingStream(str);
    }
}
