import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class polarbear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class polarbear extends Actor
{
   
    private SimpleTimer animTimer;
    private int delay = 0;
    private boolean isFacingRight = true;
    
    
    
    int curIndex = 0;
   
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("a")){
            isFacingRight = false;
            move(-2);
        }
        if(Greenfoot.isKeyDown("d")){
            isFacingRight = true;
            move(2);
        }
        
        eat();
        
    }
    
    public void eat()
    {
        if(isTouching(Apple.class)){
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            world.spawnApple();
        }
    }
}

