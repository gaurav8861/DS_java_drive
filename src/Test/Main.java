package Test;


import java.util.*;
import java.util.stream.Collectors;

class Person {
    String name;
    Integer age;

    // standard constructors, getters and setters

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Main {


    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(10,9,8,1,3,6);
        int max = lst.stream().max((a,b) -> a.compareTo(b)).get();
        System.out.println("MAX : " + max);

        int min1 = lst.stream().mapToInt(a -> a).min().getAsInt();
        System.out.println("MIN : " + min1);

        Person alex = new Person("Alex", 23);
        Person john = new Person("John", 40);
        Person peter = new Person("Peter", 32);
        List<Person> people = Arrays.asList(alex, john, peter);

        Optional<Person> min = people.stream().min(Comparator.comparing(Person::getAge));
        System.out.println(min.get());

        List<Integer> lsts = Arrays.asList(1,2,3,5,3,4,3,2,8,9,10,11,10,5,6,7);
        Map<Integer, Long> collect = lsts.stream().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
        System.out.println(collect);


    }
}
