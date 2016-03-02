/**
 * Created by kevin_000 on 2/18/2016.
 */
public class Essay extends GradedActivity
{
    private int grammar;
    private int spelling;
    private int correctLength;
    private int content;



    public Essay(int grammar,int spelling,int correctLength,int content)
    {

        super(grammar + spelling + content + correctLength);
    }

    public void setGrammar(int grammar)
    {
        this.grammar = grammar;
    }

    public void setSpelling(int spelling)
    {
        this.spelling = spelling;
    }

    public void setCorrectLenght(int correctLenght)
    {
        this.correctLength = correctLenght;
    }

    public void setContent(int content)
    {
        this.content = content;
    }


    public int getCorrectLenght()
    {
        return correctLength;
    }

    public int getContent()
    {
        return content;
    }

    public int getGrammar()
    {
        return grammar;
    }

    public int getSpelling()
    {
        return spelling;
    }








}
