package behavioral.strategy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        Person p1 = new Person(99, "Zack", "3214093");
        Person p2 = new Person(15, "Hillton", "3214093");
        Person p3 = new Person(40, "Amber", "3214093");
        List<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);

        System.out.println("=== Not sorted ===");
        printListContent(people);
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.age() > o2.age()) {
                    return 1;
                }
                if (o1.age() < o2.age()) {
                    return -1;
                }
                return 0;
            }
        });

        System.out.println("=== Sorted by age ===");
        printListContent(people);

        System.out.println("=== Sorted by name ===");
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name().compareTo(o2.name());
            }
        });
        printListContent(people);

    }

    static void printListContent(List<Person> list) {
        list.forEach(e -> System.out.println(e.name()));
    }
}
