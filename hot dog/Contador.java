import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Contador extends Actor
{
    int puntaje;
    int score = puntaje;
    
    /**
     * Act - do whatever the Contador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        //setImage(new GreenfootImage("Puntuación: " + score, 42, null, null));
        
        setImage(new GreenfootImage("Croquetas: " + score, 30, null, null));
    }
}
