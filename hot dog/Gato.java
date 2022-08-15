import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gato extends Actor
{
    /**
     * Act - do whatever the Gato wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage myGif = new GifImage("gato1.gif");
    public void act()
    {
        // gif
        
        setImage(myGif.getCurrentImage());
        if (Greenfoot.isKeyDown("right")){
            move(1);
        }
        if (Greenfoot.isKeyDown("left")){
            move(-1);
        }
        /*if (getX()==0){
            getWorld().removeObject(this);
        }*/
        Actor player;
        player = getOneObjectAtOffset(0, 0, Canela2.class);
        if (player != null){
            //World mundo;
            //mundo = getWorld();
            Greenfoot.setWorld(new Final_malo());
        }
    }
}
