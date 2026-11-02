package kumari.shweta.java8.stream;

import java.util.*;
import java.util.stream.Collectors;

public class FilterEmployee {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(1, "Yanksha", 28, 123, "F", "HR", "Blore", 2020));
        empList.add(new Employee(2, "Francesca", 29, 120, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "Ramesh", 30, 115, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "Melanie", 32, 125, "F", "HR", "Chennai", 2013));
        empList.add(new Employee(5, "Padma", 22, 150, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "Milad", 27, 140, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "Uzma", 26, 130, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "Ali", 23, 145, "M", "IT", "Trivandam", 2015));
        empList.add(new Employee(9, "Ram", 25, 160, "M", "IT", "Blore", 2010));

        // group employee by CIty or age
        Map<String, List<Employee>> empByCity = empList.stream().collect(Collectors.groupingBy(Employee::getCity));

        /*
        Classifier function. Each element is passed to Employee::getCity to get its key.
        Bucket lookup. The collector checks the map for that key. If the key is missing, it creates a new container using the downstream collector’s supplier, which is an ArrayList by default.
        Accumulate. The element is added to that key’s container.
        Finish. Once all elements are processed, the map is returned.
         */
        System.out.println(empByCity);

        //Group by age City then age

        Map<String, Map<Integer, List<Employee>>> empByCityandAge = empList.stream().collect(Collectors.groupingBy(Employee::getCity, Collectors.groupingBy(Employee::getAge)));

        System.out.println(empByCityandAge);

        //Count no of male and female employee

        Map<String, Long> noOfMaleAndFemale = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(noOfMaleAndFemale);

        //Find count of male and female present in each department.
        System.out.println("Find no of male and female in each department");
        Map<String, Map<String, Long>> noOfMaleFemaleInDept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.groupingBy(Employee::getGender, Collectors.counting())));
        System.out.println(noOfMaleFemaleInDept);
        // Print the names of all distinct departments in the organization.
        System.out.println("All distinct department");
        empList.stream().map(Employee::getDeptName).distinct().forEach(System.out::println);

        //Print all employee details whose age is greater than 28
        empList.stream().filter(employee -> employee.getAge() > 28).forEach(System.out::println);

        //Find maximum age/oldest of employee in the organisation.
        OptionalInt oldestPersaon = empList.stream().mapToInt(Employee::getAge).max();
        System.out.println("Oldest employee age is " + oldestPersaon.getAsInt());

        //Calculate average age of  male and female
        Map<String, Double> averageAge = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println("Average age is " + averageAge);
    }
}
