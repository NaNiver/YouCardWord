/**
 * Write a description of class Conjuntion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Conjuntion extends Word
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Conjuntion
     */
    public Conjuntion(String con)
    {
        super.ID=con;
        super.text=" "+ID;
    }
    
    public String  fusion(Word other)
    {
        String aux=super.text;
        if(other.getClass()==Noun.class)
        {
            aux= super.text+" "+other.text;
        }
        return aux;
    }
}