import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Actor
{
    /**
     * Act - do whatever the Exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Exit()
    {
      GreenfootImage myImage = getImage(); //para obtener la imagen 
      int nueva_altura= (int)myImage.getHeight()/2; //para obtener la altura y cambiarla
      int nuevo_ancho= (int)myImage.getWidth()/2; //para obtener el ancho y cambiarla
      //para ponerle las nuevas medidas
      myImage.scale(nuevo_ancho, nueva_altura);
    }
    public void act()
    {
        // Add your action code here.
    }
}
