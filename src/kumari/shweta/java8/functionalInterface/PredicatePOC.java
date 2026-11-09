package kumari.shweta.java8.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

interface  CustomPredicate<T>{
    boolean test(T t);
}

class CustomPredicateImp  implements  CustomPredicate<Employee>{

    @Override
    public boolean test( Employee e) {
        if(e.salary>3000){
            return true;
        } else {
            return false;
        }
    }
}

class Employee{
    String name;
    Double salary;
    Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
}
public class PredicatePOC {

    public static void main(String[] args) {
        List<Employee> employeeList= Arrays.asList(new Employee("Ravi",1000),
                new Employee("Durga",2000),new Employee("Adarsh",300000)
                );

        Predicate<Employee> predicate=e->e.salary>3000 ;
        for(Employee employee : employeeList){
            if(predicate.test(employee)){
                System.out.println(employee.name+" "+employee.salary);
            }
        }

        CustomPredicate<Employee> customPredicate=e->e.salary>30000?true:false;
        System.out.println(customPredicate.test(new Employee("Raki",20000)));


    }
}
