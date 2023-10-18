import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baackground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baackground extends World
{

    /**
     * Constructor for objects of class Baackground.
     * 
     */
    public Baackground()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 675, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Enemy enemy = new Enemy();
        addObject(enemy,454,621);
        Player player = new Player();
        addObject(player,760,394);
        player.setLocation(542,496);
        enemy.setLocation(1064,611);
        player.setLocation(693,624);
        player.setLocation(712,620);
        ObjectSpecial objectSpesial = new ObjectSpecial();
        addObject(objectSpesial,111,70);
        objectSpesial.setLocation(118,102);
    }
}
