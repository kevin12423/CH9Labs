import java.text.DecimalFormat;

/**
 * Created by kevin_000 on 2/17/2016.
 */
public class ProductionWorker extends Employee
{
        private int shift;
        private double hourlyPay;
        private Employee emp1;

    public ProductionWorker(String name, int num1, int num2, int num3, String letter, int hireDate, int shift, double hourlyPay)
    {
        super(name,num1,num2,num3,letter,hireDate);
        this.shift = shift;
        this.hourlyPay = hourlyPay;

    }

    public void getInfo(int shift, double hourlyPay)
    {
        DecimalFormat decFormat = new DecimalFormat("$#,##0.00");
        this.shift = shift;
        this.hourlyPay = hourlyPay;
        System.out.println("Name: " + getName());
        System.out.println("Employee number: " + getNum1() + getNum2() + getNum3() + getLetter());
        System.out.println("Hire Date: October " + getHireDate() + " 2007");
        System.out.println("Shift number: " + shift);
        System.out.println("Hourly pay: " + decFormat.format(hourlyPay));
        System.out.println("-------------------------------------------");

    }


}
