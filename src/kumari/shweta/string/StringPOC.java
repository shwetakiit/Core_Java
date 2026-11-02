package kumari.shweta.string;

public class StringPOC {

    public static void main(String[] args) {
        String str="Hello";  //String literal object ceate in string pool
         System.out.println(str.concat("World"));
         System.out.println(str);
          str=str.concat("Shweta");
          System.out.println(str);


          Thread t= new Thread();
          Object o=new Object();
          String s= new String("GEEKS");
         // System.out.println(t==s);//java: incomparable types: java.lang.Thread and java.lang.String

        System.out.println(t==o); //There should be compatibiliy between argument types (Either child to parent or parent to child or same type) 
        System.out.println(o==s);
    }
}
