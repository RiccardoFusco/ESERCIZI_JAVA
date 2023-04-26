/**
 * 
 * App
 */
public class App {

    public static void main(String[] args) {
        String name = "James";
        String surname = "Bond";
        saluta(name, surname);

        name = "Pippo";
        surname = "Pluto";
        saluta(name, surname);


    }



    public static void saluta(String name, String surname) {
        System.out.println("il mio nome è " + surname + ", " + name + " " + surname);
    }
}