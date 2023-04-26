import java.util.List;
import java.util.LinkedList;

 
public class App {
    public static void main(String[] args) throws Exception {

        List<Person> people = new LinkedList<Person>(
            List.of(
                new Person("Andrea", "Mininni", 29),
                new Person("Cosimo", "Di Lorenzo", 26),
                new Person("Riccardo", "Fusco", 19)

            )

        );

        for(Person p : people){
            System.out.println(p.getName());
        }  
 
    }
}
