public class Developer extends Employer{
    String[]langauges;

    public Developer(String name, String code, int salary, String[] langauges) {
        super(name, code, salary);
        this.langauges = langauges;
    }


    protected String stampaSalario() {
        return "Il mio salario è " + this.salary + " e, dato che sono un programmatore mi sogno i bonus la notte";
        
    }
}
