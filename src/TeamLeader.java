import java.text.DecimalFormat;

/**
 * Created by kevin_000 on 2/17/2016.
 */
public class TeamLeader extends ProductionWorker
{
    private double monthlyBonus;
    private int training;
    private int minTraining;

    public double getMonthlyBonus()
    {

        return monthlyBonus;
    }

    public int getTraining()
    {

        return training;
    }

    public int getMinTraining()
    {

        return minTraining;
    }
    public TeamLeader(String name, int num1, int num2, int num3, String letter, int hireDate, int shift, double hourlyPay, double monthlyBonus, int training, int minTraining)
    {
        super(name,num1,num2,num3,letter,hireDate,shift,hourlyPay);
        this.monthlyBonus = monthlyBonus;
        this.training = training;
        this.minTraining = minTraining;
    }

    public void getLeaderInfo(int shift, double hourlyPay)
    {
        DecimalFormat decFormat = new DecimalFormat("$#,##0.00");
        System.out.println("Name: " + getName());
        System.out.println("Employee number: " + getNum1() + getNum2() + getNum3() + getLetter());
        System.out.println("Hire Date: November " + getHireDate() + " 2009");
        System.out.println("Shift number: " + shift);
        System.out.println("Min amount of training needed " + getMinTraining() + " hours");
        System.out.println("Training hours you have completed " + getTraining() + " hours");
        System.out.println("Monthly bonus " + decFormat.format(getMonthlyBonus()));
        System.out.println("Hourly pay: " + decFormat.format(hourlyPay));
    }
}
