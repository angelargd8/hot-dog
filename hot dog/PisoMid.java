import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PisoMid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PisoMid extends Actor
{
    /**
     * Act - do whatever the PisoMid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PisoMid()
    {
        // Add your action code here.
        getImage().scale(getImage().getWidth()*6,getImage().getHeight()*2);
    }
    public void act()
    {
        // para q se muevan
        if (Greenfoot.isKeyDown("right")){
            move(-5);
        }
        if (Greenfoot.isKeyDown("left")){
            move(5);
        }
        if (getX()==0){
            setLocation(getWorld().getWidth()-1, Greenfoot.getRandomNumber((300)+400));
        }
        
    }
}
