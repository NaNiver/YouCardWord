import java.io.*;
/**
 * Write a description of class Noun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Noun extends Word
{   
    public Noun(String ID)
    {
        super.ID=ID;
        super.text = "The "+super.ID;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    public String  fusion(Word other)
    {
        String phrase=null;
        if(other.getClass()==Verb.class)
        {
            phrase=text+" "+other.text;
        }
        else
        {
            phrase=text;
        }
        return phrase;
    }
    
    public void form()
    {
        super.text="the "+super.ID;
    }
}
