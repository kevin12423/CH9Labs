/**
 * Created by kevin_000 on 2/18/2016.
 */
public class GradedActivity
{
    private int score;
    public GradedActivity()
    {

    }

    public GradedActivity(int score)
    {
        this.score = score;
    }

    public int getScore()
    {
        return score;
    }


    public String getGrades()
    {
        String letterGrade;
        if(score >= 90)
        {
            letterGrade = "A";
        }
        else if (score >= 80)
        {
            letterGrade = "B";
        }
        else if (score >= 70)
        {
            letterGrade = "C";
        }
        else if (score >= 60)
        {
            letterGrade = "D";
        }
        else
        {
            letterGrade = "F";
        }
        return letterGrade;
    }

    @Override
    public String toString()
    {
        return getGrades();
    }
}
