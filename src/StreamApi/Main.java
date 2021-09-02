package StreamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 1.Write a program to print employee details working in each department

 2.Write a program to print employees count working in each department

 3.Write a program to print active and inactive employees in the given collection

 4.Write a program to print Max/Min employee salary from the given collection

 5.Write a program to print the max salary of an employee from each department

 6.Write a program to print the average salary of an employee

 6.Write a program to convert list of employee to map with name and salary.
 */
class Employee{
    private Integer empId;
    private String empName;
    private String address;
    private Integer age;
    private String dept;
    private Long salary;
    private String status = "active";

    public Employee(Integer empId, String empName, String address, Integer age, String dept, Long salary, String status) {
        this.empId = empId;
        this.empName = empName;
        this.address = address;
        this.age = age;
        this.dept = dept;
        this.salary = salary;
        this.status = status;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", status='" + status + '\'' +
                '}';
    }
}
public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        Employee e1 = new Employee(1, "gaurav", "gumla", 12, "IT", 1000l, "active");
        Employee e2 = new Employee(2, "saurav", "ranchi", 14, "CSE", 2000l, "active");
        Employee e3 = new Employee(3, "raj", "jamshedpur", 22, "ECE", 500l, "active");
        Employee e4 = new Employee(4, "amit", "ranchi", 87, "IT", 1500l, "inactive");
        Employee e5 = new Employee(5, "ajay", "khalari", 24, "CSE", 3000l, "inactive");
        Employee e6 = new Employee(6, "ramesh", "toto", 34, "IT", 2500l, "inactive");
        Employee e7 = new Employee(7, "rakesh", "gumla", 76, "ECE", 1800l, "active");

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);
        employeeList.add(e7);

        Map<String, List<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept));
        System.out.println("Write a program to print employee details working in each department");
        System.out.println(collect);
        System.out.println();

        Map<String, Long> collect6 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
        System.out.println("Write a program to print employees count working in each department");
        System.out.println(collect6);

        Optional<Employee> min = employeeList.stream().min(Comparator.comparing(Employee::getSalary));
        System.out.println("Write a program to print employees with minimum salary");
        System.out.println(min.get());
        System.out.println();

        Map<String, Long> collect1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
        System.out.println("Write a program to print active and inactive employees in the given collection");
        System.out.println(collect1);
        System.out.println();

        List<Employee> collect2 = employeeList.stream().filter(emp -> "active".equals(emp.getStatus())).collect(Collectors.toList());
        System.out.println("Write a program to print active and inactive employees in the given collection");
        System.out.println(collect2);
        System.out.println();

        List<Employee> collect3 = employeeList.stream().filter(emp -> "inactive".equals(emp.getStatus())).collect(Collectors.toList());
        System.out.println("Write a program to print active and inactive employees in the given collection");
        System.out.println(collect3);
        System.out.println();


        Optional<Employee> min1 = employeeList.stream().min(Comparator.comparingLong(Employee::getSalary));
        System.out.println("Write a program to print Max/Min employee salary from the given collection");
        System.out.println(min1);
        System.out.println();

        Optional<Employee> max1 = employeeList.stream().max(Comparator.comparingLong(Employee::getSalary));
        System.out.println("Write a program to print Max/Min employee salary from the given collection");
        System.out.println(max1);
        System.out.println();

        Map<String, Employee> collect4 = employeeList
                .stream()
                .collect(Collectors.groupingBy(Employee::getDept,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingLong(Employee::getSalary)),
                        Optional::get)));
        System.out.println("Write a program to print the max salary of an employee from each department");
        System.out.println(collect4);
        System.out.println();

        System.out.println("Write a program to print the average salary of an employee");
        double asDouble = employeeList.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
        System.out.println(asDouble);

        System.out.println("Write a program to convert list of employee to map with name and salary.");
        Map<String, Long> collect5 = employeeList.stream().collect(Collectors.toMap(Employee::getEmpName, Employee::getSalary));
        System.out.println(collect5);
    }
}
