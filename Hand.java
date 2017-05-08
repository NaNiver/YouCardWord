import java.util.ArrayList;
/**
 * Write a description of class Hand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hand  
{
    protected ArrayList<Card> cards;
    public Hand()
    {
        cards=null;
    }
    
    public void addCard(Card c)
    {
        cards.add(c);
    }
    
    public void playCard(Card c,ArrayList<Card> placeplay)
    {
        
    }
}
