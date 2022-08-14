import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flecha extends Actor
{
    /**
     * Act - do whatever the Flecha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Flecha()
    {
      GreenfootImage myImage = getImage(); //para obtener la imagen 
      int nueva_altura= (int)myImage.getHeight()/6; //para obtener la altura y cambiarla
      int nuevo_ancho= (int)myImage.getWidth()/6; //para obtener el ancho y cambiarla
      //para ponerle las nuevas medidas
      myImage.scale(nuevo_ancho, nueva_altura);
    }
    public void act()
    {
        // Add your action code here.
    }
}
