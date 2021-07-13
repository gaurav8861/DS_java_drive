package LamdaExpression;


import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice1 {

    public static List<Employee> getEmployees(){
        List<Employee> employeeList=new ArrayList<>();

        Employee e1=new Employee("John",21, new Address("India", "Bengaluru"));
        Employee e2=new Employee("Martin",19, new Address("Pakistan", "Karanchi"));
        Employee e3=new Employee("Mary",31, new Address("India", "Mumbai"));
        Employee e4=new Employee("Stephan",18, new Address("USA", "NY"));
        Employee e5=new Employee("Gary",26, new Address("UK", "London"));

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        return employeeList;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = getEmployees();

        /**
         * Given a list of employees, you need to filter all the employee whose age is greater than 20 and print the employee names.(Java 8 APIs only)
         */
        List<String> e1 = employeeList.stream().
                filter(e -> e.getAge() > 20).
                map(Employee :: getName).collect(Collectors.toList());
        System.out.println(e1);

        /**
         * Given the list of employees, count number of employees with age 25
         */

        long count = employeeList.stream().filter(e -> e.getAge() > 25).count();
        System.out.println("count : " + count);


        /**
         * Given the list of employees, find the employee with name “Mary”.
         */
        Optional<Employee> e2 = employeeList.stream().
                filter(e -> e.getName().equalsIgnoreCase("Mary")).findAny();
        if (e2.isPresent()){
            System.out.println(e2.get());
        }
        // Another way

        List<Employee> e3 = employeeList.stream().filter(e -> e.getName().equalsIgnoreCase("Mary")).collect(Collectors.toList());
        System.out.println(e3);


        /**
         * Given a list of employee, find maximum age of employee?
         */
        OptionalInt maxAge = employeeList.stream().mapToInt(Employee::getAge).max();
        if (maxAge.isPresent()){
            System.out.println(maxAge.getAsInt());
        }

        /**
         * Given a list of employees, sort all the employee on the basis of age? Use java 8 APIs only
         */
        employeeList.sort((e11,e12) -> e11.getAge() - e12.getAge());
        employeeList.forEach(System.out :: println);

        /**
         * Join the all employee names with “,” using java 8?
         */
        List<String> e5 = employeeList.stream().map(Employee::getName).collect(Collectors.toList());
        String one = String.join(", ", e5);
        System.out.println(one);

        /**
         * Given the list of employee, group them by employee name?
         */
        Map<String, List<Employee>> map1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getName));
        map1.forEach((name, list) -> System.out.println("name ==> " + name + " : " + "list => " + list));


        /**
         * Given the list of numbers, remove the duplicate elements from the list.
         */

        List<Integer> lst = Arrays.asList(1,2,3,4,5,6,3,7,8,9);
        Set<Integer> lst1 = lst.stream().collect(Collectors.toSet());
        System.out.println(lst1);


        /**
         * Given a list of numbers, square them and filter the numbers which are greater 10000 and then find average of them.( Java 8 APIs only)
         */

        List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,3,7,8,9);
        int sum = 0;
        for (Integer i : l1){
            if((i*i) > 20){
                sum += (i*i);
            }
        }
        System.out.println(sum);
        OptionalDouble l2 = l1.stream().mapToInt(i -> i*i)
                .filter(i -> i>20).average();
        if (l2.isPresent()){
            System.out.println(l2.getAsDouble());
        }

        /**
         * Given the list of employee, filter employee whose country is India?
         */
        List<Employee> lst2 = employeeList.stream().filter(o -> o.getAddress().getCountry().equalsIgnoreCase("India")).collect(Collectors.toList());
        System.out.println(lst2);

        /**
         *
         1.Write a program to print employee details working in each department

         2.Write a program to print employees count working in each department

         3.Write a program to print active and inactive employees in the given collection

         4.Write a program to print Max/Min employee salary from the given collection

         5.Write a program to print the max salary of an employee from each department
         */


    }
}
