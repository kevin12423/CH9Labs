import java.text.DecimalFormat;

/**
 * Created by kevin_000 on 2/17/2016.
 */
public class Supervisor extends Employee
{
    private double annualSalary;
    private double bonus;

    public double getAnnualSalary()
    {

        return annualSalary;
    }
    public double getBonus()
    {

        return bonus;
    }
    public Supervisor(String name, int num1, int num2, int num3, String letter, int hireDate, double annualSalary, double bonus)
    {
        super(name,num1,num2,num3,letter,hireDate);
        this.annualSalary = annualSalary;
        this.bonus = bonus;
    }


    public void supervisorInfo()
    {
        DecimalFormat decFormat = new DecimalFormat("$#,##0.00");
        System.out.println("Name: " + getName());
        System.out.println("Employee number: " + getNum1() + getNum2() + getNum3() + getLetter());
        System.out.println("Hire Date: October " + getHireDate() + " 2007");
        System.out.println("Annual salary: " + decFormat.format(getAnnualSalary()));
        System.out.println("Annual bonus: " + decFormat.format(getBonus()) );
        System.out.println("Salary after bonus: " + decFormat.format((getAnnualSalary() + getBonus())));
        System.out.println("-------------------------------------------");
    }
}
