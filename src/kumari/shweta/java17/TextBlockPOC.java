package kumari.shweta.java17;

import kumari.shweta.java8.functionalInterface.Interf;

public class TextBlockPOC {
    public static void main(String[] args) {
        String  json = "{\n" +
                "  \"name\": \"Vinoth\",\n" +
                "  \"age\": 25\n" +
                "}";

        String json17= """
        {
          "name": "Vinoth",
          "age": 25
        }
        """;

        System.out.println(json);
        System.out.println(json17);


        //Enhanced Instance of
        Object obj = 10;
       Object var=null;
        if(obj instanceof  Integer num){
            System.out.println(num);

        }
        if(var instanceof String s){  //Print Nothing null instanceof AnyType so It is always false. It wll no go inside if block
         System.out.println("******"+var);
        }


        Object integerVar=10;
        if(integerVar instanceof String s){
         System.out.println("Value of integerVar"+ integerVar);
        }





    }






}
