import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Canela here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Canela extends Actor
{
    private int vSpeed= 0; //velocidad vertical
    private int aceleracion= 1;
    private int jumpHeight = -23;
    //private int collect=0;
    GifImage myGif = new GifImage("canela.gif");
    /**
     * Act - do whatever the Canela wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //para el contador q se va a ver
    Escenario_5 thisGame;
    public void act()
    {
        // gif
        setImage(myGif.getCurrentImage());
        moveAround();
        checkFalling();
        collect();
        //setImage(new GreenfootImage("Croquetas: " + score, 30, null, null));
    }
    private void fall()
    {
        setLocation(getX(), getY()+vSpeed);
        vSpeed= vSpeed + aceleracion;
    }
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("right")){
            move(1);
        }
        if(Greenfoot.isKeyDown("left")){
            move(-1);
        }
        if(Greenfoot.isKeyDown("space")&&(enPiso()==true)){
            vSpeed= jumpHeight;
            fall();
        }
    }
    boolean enPiso(){
        Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2, Piso.class);
        return under != null;
    }
    public void checkFalling()
    {
        if(enPiso()==false){
            fall();
        }
        if(enPiso()==true){
            vSpeed =0;
        }
    }
    public void collect(){
        Actor croqueta = getOneIntersectingObject(Croqueta.class);
        if (croqueta != null){
            getWorld().removeObject(croqueta);   
            //collect++;
            thisGame.collect++;
        }
        if (thisGame.collect == 10){
            Greenfoot.setWorld(new Escenario_6());
            
        }
    }
    
}
