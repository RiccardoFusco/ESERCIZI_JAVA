public class Manager extends Employer{
    int bonus;

    public Manager(String name, String code, int salary, int bonus) {
        super(name, code, salary);
        this.bonus = bonus;
    }

    @Override
    public String stampaSalario() {
        return "Il mio stipendio è di " + this.salary + " con un bonus di " + this.bonus;
        
    }
}
