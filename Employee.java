public abstract class Employee {
    protected String name;
    protected int id;
    protected int baseSalary;

    public Employee(String name, int id, int baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;

    }
    public abstract double calculateSalary();
    public void displayEmployeeInfo(){
        System.out.println(name+" "+id+" "+baseSalary);
    }
}

interface Payable {
    double getPaymentAmount(); // Метод для расчета зарплаты
}

class FullTimeEmployee extends Employee implements Payable{
    boolean HealthPaper=true;

    public FullTimeEmployee(String name, int id, int baseSalary) {
        super(name, id, baseSalary);

    }

    @Override
    public double calculateSalary() {
        return baseSalary * 1.2;
    }
    public double getPaymentAmount(){
        return calculateSalary();
    }
    public void displayFullTimeDifferences() {
        if(HealthPaper){
            System.out.println(name + " is eligible for health insurance.");
        }else{
            System.out.println(name+" is NOT eligible for health insurance.");
        }

    }
}

class ContractEmployee extends Employee implements Payable {
    boolean HealthPaper = false;
    private double hourlyRate;
    private int hoursWorked; //отработанные часы

    public ContractEmployee(String name, int id, int baseSalary, double hourlyRate, int hoursWorked) {
        super(name, id, baseSalary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public double getPaymentAmount() {
        return calculateSalary();
    }

    public void setHoursWorked(int hours) {
        this.hoursWorked = hours;
    }

    public void displayContractDifferences() {
        if (HealthPaper) {
            System.out.println(name + " is eligible for health insurance.");
        } else {
            System.out.println(name + " is NOT eligible for health insurance.");
        }

    }
}
class Main{
    public static void main(String[]ars){
        Employee[] employees = new Employee[2];
        employees[0] = new FullTimeEmployee("Alice", 101, 3000);
        employees[1] = new ContractEmployee("Bob", 102, 0, 25, 160); //25$/час, 160 часов

        for (Employee e : employees) {
            e.displayEmployeeInfo();
            System.out.println("Calculated Salary: $" + e.calculateSalary());
            System.out.println("----------------------");

        }
        //ContractEmployee contractEmp = new ContractEmployee("Bob", 102, 0, 25, 160);
        //contractEmp.displayContractDifferences();

    }
}
