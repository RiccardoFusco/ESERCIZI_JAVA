import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {

        List<Person> people = List.of(
            new Person("Maria", Gender.FEMALE),
            new Person("Marco", Gender.FEMALE),
            new Person("Riccardo", Gender.FEMALE),
            new Person("Laura", Gender.FEMALE),
            new Person("Giulia", Gender.FEMALE)

        );


        people.stream()
            .filter(person -> Gender.FEMALE.equals(person.gender))
            .collect(Collectors.toList())
            .forEach(person -> System.out.println(person.name));




        List<Person> females = people.stream().filter(p -> Gender.FEMALE.equals(p.gender)).toList();
        for(Person p : females){
            System.out.println(p.name);
        }

        
    }
} 
