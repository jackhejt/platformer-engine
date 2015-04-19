import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class level2 extends World
{

    public level2()
    {    
        super(1400, 800, 1); 
        addObject(new Player(), 50, 700);
        addObject(new Endstage(2), 1345, 40);
        //Begin platforms
        addObject(new Platform(), 283, 755);
        addObject(new Platform(), 499, 661);
        addObject(new Platform(), 345, 464);
        addObject(new Platform(), 372, 270);
        addObject(new Platform(), 732, 377);
        addObject(new Platform(), 919, 460);
        addObject(new Platform(), 1163, 327);
        addObject(new Platform(), 1349, 195);
    }
}
