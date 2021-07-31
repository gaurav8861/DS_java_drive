package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee{
    private Integer id;
    private String empName;
    private String address;
    private Integer age;

    public Employee(Integer id, String empName, String address, Integer age) {
        this.id = id;
        this.empName = empName;
        this.address = address;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Test1 {

    public static void main(String args[]) {

        Map<String, Object> map = new HashMap<>();
        Employee e1 = new Employee(1, "gaurav", "gumla", 25);
        Employee e2 = new Employee(2, "vicky", "ranchi", 21);
        Employee e3 = new Employee(3, "kavya", "puri", 12);
        Employee e4 = new Employee(4, "pihu", "delhi", 5);

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        map.put("status", "ok");
        list.stream().forEach(e -> map.put(e.getId().toString(), e));
        System.out.println(map);

    }










}





