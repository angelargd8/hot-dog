import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Final_bueno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Final_bueno extends World
{

    /**
     * Constructor for objects of class Final_bueno.
     * 
     */
    public Final_bueno()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    public void act(){//permite que el jugador pueda seleccionar las opciones del menu
        if(Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER")){
            Greenfoot.delay(10); //para esperar tiempo       
            Greenfoot.setWorld(new menu1());

            }
        }
}
