package kumari.shweta.coding;

//Find First Non-Repeating Character Using Java 8

public class NonRepeatingFirstCharacter {

    public static void main(String[] args) {
        String str="swiss";
         Character result=str.chars().mapToObj(c->(char)c).filter(ch->str.indexOf(ch)==str.lastIndexOf(ch)).findFirst().orElse(null);
         System.out.println("Result "+result);

    }


}
