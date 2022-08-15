import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu1 extends World
{
    Flecha Flecha = new Flecha();
    Menu menu = new Menu();
    private int opcion = 0;
    /**
     * Constructor for objects of class menu1.
     * 
     */
    public menu1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(menu,300,200);
        preparar();
        musica();
    }
    private void preparar()
    {
        addObject(new Start(), 480, 250);
        addObject(new Exit(), 480, 320);
        addObject(Flecha, 350, 250);
    }
    public void act(){//permite que el jugador pueda seleccionar las opciones del menu
        if((Greenfoot.isKeyDown("Up")) && opcion!=0){opcion++;}//para  arriba y el otro para abajo
        if(Greenfoot.isKeyDown("Down") && opcion!=1){opcion--;}
        if(opcion >= 2) opcion=0;
        if(opcion<0)opcion=1;
        Flecha.setLocation(350, 250 + (opcion*50)); //permite mover la fecha
        if(Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER")){
            switch(opcion){
            case 0:
                Greenfoot.setWorld(new Escenario_1());
            case 1:
                Greenfoot.stop();
                break;
            }
        }
    }
    private void musica(){//añade musica al juego
        GreenfootSound musica = new GreenfootSound("musica.mp3");
        musica.setVolume(25);
        musica.playLoop();
    
    }
}
