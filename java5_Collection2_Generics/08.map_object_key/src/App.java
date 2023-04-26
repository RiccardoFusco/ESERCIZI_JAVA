import java.util.HashMap;
import java.util.Map;
import java.util.jar.Attributes.Name;

public class App {
    public static void main(String[] args) throws Exception {
       
        Map<RubricaKey, Person> rubrica = new HashMap<RubricaKey, Person>();

        Person andrea = new Person(name: "Andrea", surname: "Mininni", cf: "MNNNDR94L26");
        Person andrea2 = new Person(name: "Andrea", surname: "Mininni", cf: "MNNNDR94L26");

        // RubricaKey key1 = new RubricaKey(andrea.cf, progressivo: 20);
        // rubrica.put(key1, andrea);
       
        // RubricaKey key2 = new RubricaKey(andrea.cf, progressivo: 20);
        // rubrica.put(key2, andrea);


        RubricaKey key1 = new RubricaKey(andrea.cf, 20);
        RubricaKey key2 = new RubricaKey(andrea2.cf, 20);
        rubrica.put(key1, andrea);
        rubrica.put(key2, andrea2);

        for(RubricaKey key : rubrica.keySet()){
            System.out.println(rubrica.get(key).name);
        }
    }
}
