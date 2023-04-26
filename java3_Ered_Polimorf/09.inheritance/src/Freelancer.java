public class Freelancer extends Employer {
    public String[] projects;
    public int commission;
    
    
    public Freelancer(String name, String code, int salary, String[] projects, int commission) {
        super(name, code, salary);
        this.projects = projects;
        this.commission = commission;
        setSalary();
    }

    
    public void setSalary(){
        int sum = 0;
        for (int i = 0; i < projects.length; i++) {

            sum += this.commission;
            
        }

        this.salary = this.salary + sum;
    }


    @Override
    public String stampaSalario(){
        return "Il mio salario è " + (this.salary - (this.commission * this.projects.length)) + " con " + this.commission + " di commissioni";
    }
        
    }

