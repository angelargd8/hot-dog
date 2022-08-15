import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escenario_8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escenario_8 extends World
{
    public static int collect=0;
    /**
     * Constructor for objects of class Escenario_8.
     * 
     */
    public Escenario_8()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 600, 1); 
        prepare();
    }

    public void act()
    {
        if (Greenfoot.getRandomNumber(100)<=1){
            addObject(new Croqueta(), getWidth()-1,Greenfoot.getRandomNumber(1)+237);
        }
        //addObject(new Casa(), getWidth()-10,237);
        showText("Recoje 6 croquetas!, no.croquetas: "+ collect,250,30);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Canela2 canela2 = new Canela2();
        addObject(canela2,119,460);
        Croqueta croqueta = new Croqueta();
        addObject(croqueta,684,137);
        Croqueta croqueta2 = new Croqueta();
        addObject(croqueta2,991,467);
        Croqueta croqueta3 = new Croqueta();
        addObject(croqueta3,1363,142);
        Croqueta croqueta4 = new Croqueta();
        addObject(croqueta4,1465,475);
        Croqueta croqueta5 = new Croqueta();
        addObject(croqueta5,504,322);
        Piso2 piso2 = new Piso2();
        addObject(piso2,683,555);
        piso2.setLocation(827,567);
        piso2.setLocation(733,548);
        piso2.setLocation(499,541);
        piso2.setLocation(549,537);
        piso2.setLocation(465,532);
        removeObject(croqueta5);
        removeObject(croqueta);
        removeObject(croqueta3);
        piso2.setLocation(1346,511);
        piso2.setLocation(374,578);
        piso2.setLocation(499,513);
        piso2.setLocation(573,526);
        piso2.setLocation(409,535);
        piso2.setLocation(442,534);
        piso2.setLocation(1009,590);
        piso2.setLocation(370,526);
        piso2.setLocation(454,574);
        Piso2 piso22 = new Piso2();
        addObject(piso22,1628,575);
        canela2.setLocation(358,494);
        canela2.setLocation(353,492);
        croqueta2.setLocation(665,486);
        croqueta2.setLocation(666,482);
        Croqueta croqueta6 = new Croqueta();
        addObject(croqueta6,975,411);
        croqueta4.setLocation(1308,474);
        Croqueta croqueta7 = new Croqueta();
        addObject(croqueta7,1604,475);
        croqueta7.setLocation(1646,496);
        //Casa casa = new Casa();
        //addObject(casa,2095,234);
        Croqueta croqueta8 = new Croqueta();
        addObject(croqueta8,2109,479);
        croqueta7.setLocation(1637,475);
        croqueta7.setLocation(1727,427);
        croqueta8.setLocation(2120,468);
        //aquí
        //casa.setLocation(2086,237);

        Nube nube = new Nube();
        addObject(nube,266,93);
        nube.setLocation(248,100);
        Nube nube2 = new Nube();
        addObject(nube2,655,187);
        nube2.setLocation(429,165);
        nube.setLocation(193,79);
        nube.setLocation(166,91);
        Nube nube3 = new Nube();
        addObject(nube3,754,136);
        nube3.setLocation(670,103);
        Nube nube4 = new Nube();
        addObject(nube4,989,184);
        nube4.setLocation(905,166);
        Gato gato2 = new Gato();
        addObject(gato2,86,486);
    }
}
