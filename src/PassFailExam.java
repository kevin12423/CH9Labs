/**
 * Created by kevin_000 on 2/18/2016.
 */
public class PassFailExam extends GradedActivity
{
    public PassFailExam(int scorein){super(scorein);}
    public String getGrades(){
        if(this.getScore()>=70)
            return "Pass";
        else
            return "Fail";
    }

}
