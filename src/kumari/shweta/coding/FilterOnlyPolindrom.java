package kumari.shweta.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterOnlyPolindrom {

    public static void main(String[] args) {
        //TC -->O(N) SC ->O(1)
        List<String> list = Arrays.asList("madam", "hello", "level", "java", "radar");
        List<String>  polindromList=  list.stream().filter(str-> IntStream.range(0,str.length()/2).allMatch(i->str.charAt(i)==str.charAt(str.length()-1-i))).collect(Collectors.toList());
        System.out.println(polindromList);
    }
}
