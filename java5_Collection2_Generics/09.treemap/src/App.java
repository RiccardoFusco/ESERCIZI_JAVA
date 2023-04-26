import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.jar.Attributes.Name;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
       

        TreeMap<RubricaKey, Person> rubrica = new TreeMap<RubricaKey, Person>(new RubricaKeyComparator());
        Person andrea = new Person("Andrea", "Mininni", "MNNNDR94L26");
        RubricaKey key1 = new RubricaKey(andrea.cf, 8);

        Person ciccio = new Person("Ciccio", "Ciccio", "CCHGSSD78");
        RubricaKey key2 = new RubricaKey(ciccio.cf, 2);
        rubrica.put(key2, andrea);
        rubrica.put(key2, andrea);

        for(RubricaKey key : rubrica.keySet()){
            System.out.println(rubrica.get(key).name);
        }
    }
}
