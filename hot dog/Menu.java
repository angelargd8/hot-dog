import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menuxd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends Actor
{
    GifImage myGif = new GifImage("menu3.gif");
    /**
     * Act - do whatever the menuxd wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //super(600, 400, 1); 
        setImage(myGif.getCurrentImage()); 
    }
    
}
