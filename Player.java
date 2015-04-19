import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Player extends Actor
{
    int dy = 0;
    public void act() 
    {
        input();
        movement();
    }    
    
    public void input()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5, getY());
            sideCollide(-5);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5, getY());
            sideCollide(5);
        }
        if(Greenfoot.isKeyDown("up") && onGround() && dy == 0)
        {
            jump();
        }
    }
    
    public boolean topCollide()
    {
        Solid check = (Solid) getOneIntersectingObject(Solid.class);
        if(!onGround() && check!=null && (getX() + getImage().getWidth()/2 > check.getX() - check.getImage().getWidth()/2) && (getX() - getImage().getWidth()/2 < check.getX() + check.getImage().getWidth()/2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void sideCollide(int move)
    {
        Solid check = (Solid) getOneIntersectingObject(Solid.class);
        while(check!=null && (getY() > check.getY() - check.getImage().getHeight()/2) && (getY() < check.getY() + check.getImage().getHeight()/2))
        {
            if(move > 0)
            {
                setLocation(getX() - 1, getY());
            }
            else
            {
                setLocation(getX() + 1, getY());
            }
            check = (Solid) getOneIntersectingObject(Solid.class);
        }
    }
    
    public void jump()
    {
        dy = -20;
    }
    
    public void movement()
    {
        int dyc = dy;
        while(dyc!=0)
        {
            if(dyc > 0)
            {
                setLocation(getX(), getY()+1);
                dyc--;
                if(onGround())
                {
                    dy = 0;
                    dyc = 0;
                }
            }
            else if(dyc < 0)
            {
                setLocation(getX(), getY()-1);
                dyc++;
                if(topCollide())
                {
                    dy = 0;
                    dyc = 0;
                }
            }
        }
        if(!onGround())
        {
            fall();
        }
    }
    
    public boolean onGround()
    {
        List<Platform> platforms = getIntersectingObjects(Platform.class);
        if(getY() > (getWorld().getHeight() - getImage().getHeight()/2))
        {
            return true;
        }
        for (int i = 0; i < platforms.size(); i++)
        {
            if(platforms.get(i)!=null)
            {
                if(platforms.get(i).getY() - (platforms.get(i).getImage().getHeight()/2) + 2 > getY() + getImage().getHeight()/2)
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void fall()
    {
        dy++;
    }
}
