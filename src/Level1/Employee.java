package Level1;

public class Employee {
    public String name;
    public double salary;
    public int id;

    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public void MonthSalary(){
        System.out.println("Employee Name is : "+name);
        System.out.println("Monthly salary is : "+salary);
    }
    public double YearSalary(){
        return 12*salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Hari",1000,10001);
        e.MonthSalary();
        System.out.println("Yearly salary is : "+e.YearSalary());
    }
}
