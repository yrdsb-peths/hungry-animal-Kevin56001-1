import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    public static int score = 0;
    public Label scoreLabel = new Label(0,80);
    public MyWorld()
    {    
        super(600, 400, 1, false); 
        polarbear p = new polarbear();
        addObject(p, 300, 350);
        addObject(scoreLabel, 50, 50);
        spawnApple();
    }
    public void spawnApple()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        Apple apple = new Apple();
        addObject(apple, x, y);
    }
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    public void gameOver()
    {
        GameOverWorld world = new GameOverWorld();
        Greenfoot.setWorld(world);
    }
}
