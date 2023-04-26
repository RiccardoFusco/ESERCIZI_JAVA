public class LanciaMissili extends Arm {

    public LanciaMissili(String sideLabel) {
        super(sideLabel);
    }
    

    @Override
    public void attacca(){
        System.out.println("Ti sparo un missile in fronte con il braccio " + this.sideLabel);
    }

}
