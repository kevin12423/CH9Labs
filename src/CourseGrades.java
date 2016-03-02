/**
 * Created by kevin_000 on 2/18/2016.
 */
public class CourseGrades extends GradedActivity
{
   private GradedActivity[] grades = new GradedActivity[4];






    public void setLab(GradedActivity activityOne)
    {
        grades[0] = activityOne;
    }
    public void setPassFailExam(PassFailExam exam)
    {
        grades[1] = exam;

    }

    public void setEssayOne(Essay essayOne)
    {
        grades[2] = essayOne;
    }

    public void setFinalExam(FinalExam exam)
    {
        grades[3] = exam;
    }






    @Override
    public String toString()
    {
        return " Lab: " + grades[0] + "\n Exam: " + grades[1] + "\n Essay: " + grades[2] + "\n Final Exam: " + grades[3];

    }
}
