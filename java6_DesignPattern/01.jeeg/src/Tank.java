public class Tank extends Moveable implements CanAttack{
    
    @Override
    public void muovitiInAvanti(){
        System.out.println("Rotolo in avanti");
    }

    @Override
    public void muovitiIndietro(){
        System.out.println("Rotolo indetro");
    }

    @Override
    public void attacca(){
        System.out.println("Ti sparo con il tank");
    }
}
 