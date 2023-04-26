public class RubricaKey {
    String cf;
    int progressivo;
   
    public RubricaKey(String cf, int progressivo) {
        this.cf = cf;
        this.progressivo = progressivo;
    }


@Override
public int hashCode(){
    final int prime = 31;
    int result = 1;
    result = prime * result + ((cf == null) ? 0 : cf.hashCode());
}


@Override
public boolean equals(Object obj){
    if(this == obj) return true;
    if(obj == null) return false;
    if(getClass() != obj.getClass()) return false;
    RubricaKey other = (RubricaKey) obj;
    if(cf == null){
        if(other.cf != null) return false;
    } else if(!cf.equals(other.cf)) return false;
    if (progressivo != other.progressivo) return false;

    return true;
}
}