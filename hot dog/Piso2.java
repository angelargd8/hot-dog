import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Piso2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piso2 extends Actor
{
    /**
     * Act - do whatever the Piso2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Piso2()
    {
        // Add your action code here.
        getImage().scale(getImage().getWidth(),getImage().getHeight()/7);
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("right")){
            move(-5);
        }
        if (Greenfoot.isKeyDown("left")){
            move(5);
        }
        if (getX()==0){
            setLocation(getWorld().getWidth()-1,571);
        }
    }
}
