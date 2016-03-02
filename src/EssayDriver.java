/**
 * Created by kevin_000 on 2/18/2016.
 */
public class EssayDriver
{
    public static void main(String[] args)
    {
        Essay roughDraft = new Essay(25,20,20,20);
        System.out.println("First Essay: " + roughDraft.getGrades());
        System.out.println("-----------------------------------------------");


        CourseGrades courseOne = new CourseGrades();
        GradedActivity lab = new GradedActivity(25);
        PassFailExam pfexam = new PassFailExam(75);
        FinalExam fexam = new FinalExam(67);
        courseOne.setLab(lab);
        courseOne.setPassFailExam(pfexam);
        courseOne.setEssayOne(roughDraft);
        courseOne.setFinalExam(fexam);

        System.out.println(courseOne);










    }
}
