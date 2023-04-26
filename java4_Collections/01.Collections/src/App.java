import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
 

        List<Person> people = new ArrayList<Person>();
        
        people.add(new Person("Andrea", "Mininni", 29));
        people.add(new Person("Luca", "Colaianni", 21));
        people.add(new Person("Tommaso", "Zuffa", 31));
        // for (int i = 0; i < people.size(); i++) {
        //     System.out.println(people.get(i).getName());
        // }

        for(Person p : people){
            System.out.println(p.getName());
        }


        //Modificare un dato già esistente
        people.set(0, new Person("Stefano", "Ercolani", 28));  
        for(Person p : people){
            System.out.println(p.getName());
        }
    }
}
