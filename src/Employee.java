/**
 * Created by kevin_000 on 2/17/2016.
 */
public class Employee
{
    private String name;
    private int num1;
    private int num2;
    private int num3;
    private String letter;
    private int hireDate;

    public Employee(String name, int num1, int num2, int num3, String letter, int hireDate)
    {
        this.name = name;
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.letter = letter;
        this.hireDate = hireDate;

    }


    public String getName()
    {

        return name;
    }

    public int getNum1()
    {

        return num1;
    }

    public int getNum2()
    {

        return num2;
    }

    public int getNum3()
    {

        return num3;
    }

    public String getLetter()
    {

        return letter;
    }

    public int getHireDate()
    {

        return hireDate;
    }
}
