/**
 * Write a description of class LifePoints here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifePoints  
{
    // instance variables - replace the example below with your own
    private int points;    
    LifePoints(int amount)
    {
        points = amount;
    }
    public int minusPoints(int minus)
    {
        points = points-minus;
        return points;
    }
    
    public int points()
    {
        return points;
    }
}