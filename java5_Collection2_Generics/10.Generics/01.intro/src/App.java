public class App {
    public static void main(String[] args) throws Exception {
        Generic<String> gen = new Generic<String>("Not so generic");
        Generic<Integer> gen2 = new Generic<Integer>(5);
        System.out.println(gen.getData());
    }
}
