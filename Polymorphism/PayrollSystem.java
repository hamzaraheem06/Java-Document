// package Polymorphism;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new HourlyEmployee("A", "B", "24324", 3.4, 45);
        employees[1] = new BasePlusCommissionEmployee("AA", "BB", "jadfj2343", 4.23, 55, 3600);
        employees[2] = new SalariedEmployee("AAA", "BBB", "ajfkjsafj", 3400);

        for (Employee employee : employees) {
            System.out.println(employee.earning());
        }
    }
}


abstract class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    
    public Employee (String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    // getters and setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public abstract double earning();
}

class SalariedEmployee extends Employee {
    private double salary;
    // contructor
    public SalariedEmployee(String firstName, String lastName, String ssn, double salary) {
        super(firstName, lastName, ssn);
        if(salary < 0) {
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

    // getters and setters

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double earning() {
        return salary;
    }
}

class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hours;
    // contructor
    public HourlyEmployee(String firstName, String lastName, String ssn, double hourlyRate, int hours) {
        super(firstName, lastName, ssn);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    // getters and setters
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHours() {
        return hours;
    }

    @Override
    public double earning() {
        if (hours <= 40) {
            return hourlyRate * hours;
        } else {
            return (hourlyRate * hours) + (hours - 40) * hourlyRate * 1.5;
        }
    }
}

class CommissionEmployee extends Employee {
    private double commission;
    private int sales;
    // contructor
    public CommissionEmployee(String firstName, String lastName, String ssn, double commission, int sales) {
        super(firstName, lastName, ssn);
        this.commission = commission;
        this.sales = sales;
    }

    // getters and setters
    public void setCommission(double commission) {
        this.commission = commission;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public double getCommission() {
        return commission;
    }

    public int getSales() {
        return sales;
    }

    @Override
    public double earning() {
        return sales * commission;
    }
}

class BasePlusCommissionEmployee extends CommissionEmployee {
    private double base;
    // contructor
    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, double commission, int sales, double base) {
        super(firstName, lastName, ssn, commission, sales);
        this.base = base;
    }

    // getters and setters
    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    @Override
    public double earning() {
        return (getSales() * getCommission() + base);
    }
}