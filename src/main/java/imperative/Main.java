package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Gender.*;

public class Main {
    public static void main (String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

        System.out.println("Imperative Approach");
        //Imperative Approach
        List<Person> femaleList = new ArrayList<>();
        for(Person person : people) {
            if(person.gender.equals(FEMALE)) femaleList.add(person);
        }

        for(Person person : femaleList) System.out.println(person);

        System.out.println("Declarative Approach");
        //Declarative Approach
        people.stream()
                .filter(p -> p.gender.equals(FEMALE))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person (String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString () {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
