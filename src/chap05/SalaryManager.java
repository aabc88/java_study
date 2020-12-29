package chap05;

public class SalaryManager {
    public static void main(String[] args) {
        SalaryManager salary = new SalaryManager();

        double month = salary.getMonthlySalary(20000000);
        salary.calculateTax(month);
    }

    public double getMonthlySalary(int yearlySalary)    {
        double monthSalary = yearlySalary/12.0;
        return monthSalary;
    }

    public double calculateTax(double monthSalary)  {
        double tax;
        tax = (monthSalary * 0.125) + (monthSalary * 0.081) + (monthSalary * 0.135);
        System.out.println(tax);
        System.out.println(monthSalary);
        System.out.println(monthSalary-tax);
        return tax;
    }

}
