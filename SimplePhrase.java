
/**
 * Write a description of class SimplePhrase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SimplePhrase extends Phrase
{
    public SimplePhrase(Noun noun, Verb verb)
    {
        super.verb = verb;
        super.noun = noun;
        super.phrase=makePhrase();
    }
    public String makePhrase()
    {
        String maked="Nothing you matter";
        maked =super.noun.text+" "+super.verb.text;
        return maked;
    }
}
