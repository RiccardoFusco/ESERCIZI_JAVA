public class JeegFactory {
    public Object instance(String componentName){
        Object component = null;
        switch(component){
            case "Legs":
            component = new Legs();
            break;
           
            case "Tank":
            component = new Tank();
            break;

            case "LanciaMissiliDx":
            component = new LanciaMissili("Destro");
            break;

            case "LanciaMissiliSx":
            component = new LanciaMissili("Sinistro");
            break;
            
            case "LaserSx":
            component = new Laser("Sinistro");
            break;

            case "LaserDx":
            component = new Laser("Destro");
            break;


        return component;
    }
}
}