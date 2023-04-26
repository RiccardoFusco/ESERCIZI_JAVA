public class App {
    public static void main(String[] args) throws Exception {
        Employer dipendente1 = new Marketing("Pippo", "CSFDB23G", 1500);
        Manager manager1 = new Manager("Pippo", "CSFDB23G", 1500, 200);
        Freelancer freelancer1 = new Freelancer(
            "Ciccio", 
            "BDUWEJ83", 
            500, 
             new String[] {"ESA", "Nike", "Tesla"}, 
            400);


    }
}
