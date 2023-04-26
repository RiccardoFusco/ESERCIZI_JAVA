public class App {
    public static void main(String[] args) throws Exception {

        // LanciaMissili lm = new LanciaMissili("Destro");    
        // Laser laser = new Laser("Sinistro");
        // Legs legs = new Legs();

        
        JeegFactory factory = new JeegFactory();
        LanciaMissili lm = (LanciaMissili) factory.instance("LanciaMissiliDx");
        Laser laser = (Laser) factory.instance("Laser");

        // Jeeg j1 = new Jeeg(lm, laser, legs);
        // j1.muovitiInAvanti();
        // j1.attacca();
        // j1.muovitiIndietro();
    }
}
