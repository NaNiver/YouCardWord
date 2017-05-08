import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class Card
{
    Word type;
    /**
     * Act - do whatever the Card wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void Cardimi(String ID,int num)
    {
        switch(num)
        {
            case 1 : type=new Noun(ID);
                      break;
            case 2 : type=new Verb(ID);
                      break;
            case 3 : type=new Conjuntion(ID);
                      break;
        }
    }
    abstract public boolean summmon();
}
