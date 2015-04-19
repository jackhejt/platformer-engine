import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class test extends World
{

    public test()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1400, 800, 1); 
        addObject(new Player(), 50, 700);
        addObject(new Endstage(1), 1345, 40);
        //Begin platforms
        addObject(new Platform(), 283, 755);
        addObject(new Platform(), 499, 661);
        addObject(new Platform(), 345, 464);
        addObject(new Platform(), 372, 270);
        addObject(new Platform(), 732, 377);
        addObject(new Platform(), 919, 460);
        addObject(new Platform(), 1163, 327);
        addObject(new Platform(), 1349, 195);
        //End platforms
    }
}
