public class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee(){

    }

    public Employee(String name, String address, double salary, String job){
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = job;
    }

    public double calculateBonus(){
        return salary;
    }

    public void generatePerformanceReport() {
        System.out.println("Performance Report for " + name + ":");
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
    }

    public static void main(String[] args) {
        Employee manager = new Manager("John", "123 Main St", 80000, 5);
        Employee developer = new Developer("Doe", "456 Cross St", 60000);
        Employee programmer = new Programmer("Tom", "789 Main St", 70000, "Java");
        manager.generatePerformanceReport();
        System.out.println();
        developer.generatePerformanceReport();
        System.out.println();
        programmer.generatePerformanceReport();
        System.out.println();
    }

}

class Developer extends Employee{
    public Developer(String name, String address, double salary){
        super(name, address, salary, "Developer");
    }

    @Override
    public double calculateBonus(){
        return salary * 0.25;
    }
}

class Programmer extends Employee{
    private String Language;

    public Programmer(String name, String address, double salary, String Language){
        super(name, address, salary, "Developer");
        this.Language = Language;
    }

    public String getLanguage(){
        return Language;
    }

    @Override
    public double calculateBonus(){
        return salary * 0.20;
    }
}

class Manager extends Employee{
    private int projects;

    public Manager(String name, String address, double salary, int projects){
        super(name, address, salary, "Developer");
    }

    public int getProjects(){
        return projects;
    }

    @Override
    public double calculateBonus(){
        return salary * 0.25;
    }
}