import java.lang.reflect.Field;

import javax.xml.crypto.Data;

public class Person {
    
    String name;
    String surname;


    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;

    }



    public Person clone(){
        for(Field field : this.getClass().getDeclaredFields()){
            Object value = field.get(Data);
            System.out.println(value);
        }
    }



    public void saluta() {

        System.out.println(
            "Ciao, il mio è "
            + this.name + " "
            + this.surname
        );
        
    }

}
