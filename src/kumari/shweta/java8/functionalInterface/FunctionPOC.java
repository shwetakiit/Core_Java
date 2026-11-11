package kumari.shweta.java8.functionalInterface;

import java.net.StandardSocketOptions;
import java.util.function.Function;


class Student{
    String name;
    double marks;
    Student(String name, Double marks) {
        this.name=name;
        this.marks=marks;
    }


}

 interface  CustomFunction<Student,String >{
   public String apply(Student student);
}

class CustomFunctionImp implements  CustomFunction<Student,String>{


    @Override
    public String apply(Student s) {
        String grade;
        if(s.marks>=80)
            grade="A[Distinction]";
        else if(s.marks>=60)
            grade="B[First Class]";
        else if(s.marks>=50)
            grade="C[Second class]";
        else if(s.marks>=35)
            grade="D[Third class]";
        else
        grade="[Failed]";
        return grade;
    }
}


public class FunctionPOC {

    public static void main(String[] args) {
        Function<Integer,String> function=(num)-> "Number"+num;
        System.out.println(function.apply(10));

        Function<String,String> upperCase=str->str.toUpperCase();
        System.out.println(upperCase.apply("shweTa"));

        //Compose  First executethe function passed to compose() then execute current function
        Function<Integer,Integer> multiply=n->n*2;
        Function<Integer,Integer> add=n->n+10;
        Function<Integer,Integer> result=multiply.compose(add);
        System.out.println(result.apply(5));

        //addThenn()
        Function result1=multiply.andThen(add);
        System.out.println(result1.apply(5));

        Function<Integer,Integer> identFunction = Function.identity();
        System.out.print( identFunction.apply(100));


        //Custom Function
        Student[] students= {new Student("Priya",90.0),
                new Student("Heena",50.0),
                new Student("Magdalena",25.0)};

        CustomFunction<Student,String> studentGrade=s->{
            String grade;
            if(s.marks>=80)
                grade="A[Distinction]";
            else if(s.marks>=60)
                grade="B[First Class]";
            else if(s.marks>=50)
                grade="C[Second class]";
            else if(s.marks>=35)
                grade="D[Third class]";
            else
                grade="[Failed]";
            return grade;
        };

      for(Student s:students){
          System.out.println("Name  :"+s.name);
          System.out.println("Mark:"+s.marks);
          System.out.println("Grade:"+studentGrade.apply(s));

      }
    }
}
