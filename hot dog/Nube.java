import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nube here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nube extends Actor
{
    /**
     * Act - do whatever the Nube wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Nube()
    {
      GreenfootImage myImage = getImage(); //para obtener la imagen 
      int nueva_altura= (int)myImage.getHeight()/10; //para obtener la altura y cambiarla
      int nuevo_ancho= (int)myImage.getWidth()/10; //para obtener el ancho y cambiarla
      //para ponerle las nuevas medidas
      myImage.scale(nuevo_ancho, nueva_altura);
    }
    public void act()
    {
        // para q se muevan
        if (Greenfoot.isKeyDown("right")){
            move(-1);
        }
        if (Greenfoot.isKeyDown("left")){
            move(1);
        }
        if (getX()==0){
            setLocation(getWorld().getWidth()-1, Greenfoot.getRandomNumber((133)+30));
        }
    }
}
