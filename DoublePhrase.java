/**
 * Write a description of class DoublePhrase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoublePhrase extends Phrase
{
    // instance variables - replace the example below with your own
    protected Verb sVerb;
    protected Noun sNoun;
    protected Conjuntion con;
    /**
     * Constructor for objects of class DoublePhrase
     */
    public DoublePhrase(Noun fN, Verb fV, Conjuntion co, Noun sN, Verb sV)
    {
        super.noun=fN;
        super.verb=fV;
        con=co;
        sVerb=sV;
        sN.form();
        sNoun=sN;
        sVerb=sV;
        super.phrase=makePhrase();
    }
    public String makePhrase()
    {
        String text= null;
        text=super.noun.text+" "+super.verb.text+" "+con.text+" "+sNoun.text+" "+sVerb.text+".";
        return text;
    }
}

