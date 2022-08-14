import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escenario_4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escenario_4 extends World
{
    Es6 es6 = new Es6();
    /**
     * Constructor for objects of class Escenario_4.
     * 
     */
    public Escenario_4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        //addObject(es6,300,200);
        
    }
    public void act(){//permite que el jugador pueda seleccionar las opciones del menu
        if(Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER")){
            Greenfoot.delay(10); //para esperar tiempo       
            Greenfoot.setWorld(new Escenario_5());

            }
        }
}
