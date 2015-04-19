import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Endstage extends Actor
{
    int level;
    
    Endstage(int level)
    {
        this.level = level;
    }
    
    public void act() 
    {
        if(getOneIntersectingObject(Player.class)!=null)
        {
            if(level == 1)
            {
                Greenfoot.setWorld(new level2());
            }
            else if(level == 2)
            {
                
            }
        }
    }    
}
