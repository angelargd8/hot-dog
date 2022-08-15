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
    boolean fall1 = false;
    public void act()
    {
        // gif
        setImage(myGif.getCurrentImage());
        moveAround();
        checkFalling();
        collect();
        //if (getX() == 0) getWorld().removeObject(this);
        //checkPiso();
        if (isOffScreen()==true)
         {
          //getWorld().removeObject(this);
          Greenfoot.setWorld(new Final_malo());
         }
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
        if(Greenfoot.isKeyDown("space")&&(enPiso2()==true)){
            vSpeed= jumpHeight;
            fall();
        }
        if(Greenfoot.isKeyDown("space")&&(enPiso3()==true)){
            vSpeed= jumpHeight;
            fall();
        }
        /*if(Greenfoot.isKeyDown("space")&&(enPiso()==false || enPiso2()==false ||enPiso3()==false)){
            Greenfoot.setWorld(new Final_malo());
        }
        if(Greenfoot.isKeyDown("left")&&(enPiso()==false || enPiso2()==false ||enPiso3()==false)){
            Greenfoot.setWorld(new Final_malo());
        }
        if(Greenfoot.isKeyDown("right")&&(enPiso()==false || enPiso2()==false ||enPiso3()==false)){
            Greenfoot.setWorld(new Final_malo());
        }*/
        //return fall1 = true;
    }
    boolean enPiso(){
        Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2, Piso.class);
        return under != null;
    }
    boolean enPiso2(){
        Actor under2 = getOneObjectAtOffset(0,getImage().getHeight()/2, PisoMid.class);
        return under2 != null;
    }
    boolean enPiso3(){
        Actor under3 = getOneObjectAtOffset(0,getImage().getHeight()/2, PisoHigh.class);
        return under3 != null;
    }
    public void checkFalling()
    {
        if(enPiso()==false || enPiso2()==false ||enPiso3()==false){
            fall();
        }
        if(enPiso()==true || enPiso2()==true || enPiso3()==true){
            vSpeed =0;
        }
    }
    /*public void checkPiso()
    {
        if(enPiso()==false  && fall1==false|| enPiso2()==false  && fall1==false ||enPiso3()==false && fall1==false){
            Greenfoot.setWorld(new Final_malo());
        }
    }*/
    public boolean isOffScreen()
    {
         if (getY() == 599) 
         {
              return true;
         }
         return false;
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
