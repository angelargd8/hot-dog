import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escenario_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escenario_2 extends World
{
    Es4 es4 = new Es4();
    /**
     * Constructor for objects of class Escenario_2.
     * 
     */
    public Escenario_2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(es4,300,200);
    }
    public void act(){//permite que el jugador pueda seleccionar las opciones del menu
        if(Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER")){
            Greenfoot.delay(10); //para esperar tiempo       
            Greenfoot.setWorld(new Escenario_3());

            }
        }
}
