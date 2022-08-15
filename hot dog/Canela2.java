import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Canela2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Canela2 extends Actor
{
    /**
     * Act - do whatever the Canela2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int vSpeed= 0; //velocidad vertical
    private int aceleracion= 1;
    private int jumpHeight = -23;
    GifImage myGif = new GifImage("canela.gif");
    Escenario_8 thisGame;
    public void act()
    {
        setImage(myGif.getCurrentImage());
        moveAround();
        collect();
        checkFalling();
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
    private void fall()
    {
        setLocation(getX(), getY()+vSpeed);
        vSpeed= vSpeed + aceleracion;
    }
    boolean enPiso(){
        Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2, Piso2.class);
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
        if (thisGame.collect == 5){
            Greenfoot.setWorld(new Final_bueno());
        }
    }
}
