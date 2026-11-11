package kumari.shweta.java17;

import java.util.ArrayList;
import java.util.List;

record Emp(int id, List<String> skills) {
}

record Department(int id, String name) {
    Department {   //Compact constructor
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid Id");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }
        name = name.toUpperCase();
    }
}

record Designation(int id, String name) {
    public Designation(int id, String name) {   // Additional Constructors
        this.id = id;
        this.name = name;
    }
}

record Student(int rollNo, String name) {
    public Student() {  //Default constructor
        this(1, "Shweta"); //Passing data here
    }
}

public record Employee(int id, String name) {  // I kept deafult not public beacuse file name is Employee
    public static void main(String[] args) {
        Employee employees1 = new Employee(1, "Shweta");
        Employee employees2 = new Employee(1, "Shweta");
        System.out.println(employees1);
        System.out.println(employees2);
        // employees.id = 101; java: cannot assign a value to final variable id

        System.out.println(employees1.hashCode() + " " + employees2.hashCode());
        System.out.println(employees1.equals(employees2));

        List<String> skill = new ArrayList<>();
        skill.add("Java");
        Emp emp = new Emp(101, skill);
        skill.add("C++");
        System.out.println(emp);

        Department department = new Department(11, "Computer Scient");
        System.out.println(department);

        Student student = new Student(100, "Shweta");
        System.out.println(student);

    }
}

