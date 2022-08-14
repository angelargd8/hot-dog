import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escenario_5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escenario_5 extends World
{
    public static int collect=0;
    /**
     * Constructor for objects of class Escenario_5.
     * 
     */
    public Escenario_5()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 600, 1); 
        prepare();
    }
    public void act()
    {
        if (Greenfoot.getRandomNumber(100)<=1){
            addObject(new Croqueta(), getWidth()-1,Greenfoot.getRandomNumber(350)+200);
        }
        showText("Croquetas: "+ collect,70,30);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Piso piso = new Piso();
        addObject(piso,85,454);
        Piso piso2 = new Piso();
        addObject(piso2,375,139);
        piso.setLocation(137,535);
        Piso piso3 = new Piso();
        addObject(piso3,440,358);
        piso3.setLocation(403,359);
        piso2.setLocation(781,132);
        piso2.setLocation(613,116);
        piso2.setLocation(608,136);
        Piso piso4 = new Piso();
        addObject(piso4,800,468);
        piso4.setLocation(777,474);
        Canela canela = new Canela();
        addObject(canela,153,440);
        canela.setLocation(160,481);
        canela.setLocation(146,493);
        piso.setLocation(189,447);
        piso.setLocation(143,535);
        canela.setLocation(72,489);
        piso.setLocation(101,531);
        canela.setLocation(97,470);
        canela.getX();
        piso3.setLocation(387,412);
        piso2.setLocation(645,289);
        piso4.setLocation(714,502);
        Piso piso5 = new Piso();
        addObject(piso5,246,248);
        piso5.setLocation(196,260);
        Nube nube = new Nube();
        addObject(nube,874,153);
        Nube nube2 = new Nube();
        addObject(nube2,709,64);
        Nube nube3 = new Nube();
        addObject(nube3,501,118);
        nube2.setLocation(743,104);
        nube3.setLocation(544,129);
        Nube nube4 = new Nube();
        addObject(nube4,358,45);
        Nube nube5 = new Nube();
        addObject(nube5,195,112);
        nube5.setLocation(187,117);
        nube5.setLocation(224,123);
        Nube nube6 = new Nube();
        addObject(nube6,91,57);
        nube5.setLocation(124,71);
        nube5.setLocation(131,59);
        nube5.setLocation(205,98);
        nube5.setLocation(106,51);
        nube5.setLocation(159,75);
        nube2.setLocation(744,63);
        nube3.setLocation(564,91);
        nube.setLocation(842,118);
        nube.setLocation(934,133);
        nube3.setLocation(547,97);
        nube2.setLocation(792,86);
        nube5.setLocation(233,112);
        Arbol arbol = new Arbol();
        addObject(arbol,930,567);
        Arbol arbol2 = new Arbol();
        addObject(arbol2,253,578);
        Arbol arbol3 = new Arbol();
        addObject(arbol3,559,227);
        Arbol arbol4 = new Arbol();
        addObject(arbol4,948,293);
        Arbol arbol5 = new Arbol();
        addObject(arbol5,839,267);
        Arbol arbol6 = new Arbol();
        addObject(arbol6,59,304);
        arbol6.setLocation(60,331);
        Arbol arbol7 = new Arbol();
        addObject(arbol7,265,202);
        Arbol arbol8 = new Arbol();
        addObject(arbol8,848,437);
        Arbol arbol9 = new Arbol();
        addObject(arbol9,578,452);
        arbol9.setLocation(538,493);
        Arbol arbol10 = new Arbol();
        addObject(arbol10,396,312);
        arbol10.setLocation(389,343);
        arbol9.setLocation(419,549);
        Arbol arbol11 = new Arbol();
        addObject(arbol11,576,540);
        arbol11.setLocation(589,576);
        arbol11.setLocation(640,545);
        arbol2.setLocation(226,547);
        Piso piso6 = new Piso();
        addObject(piso6,1043,435);
        Piso piso7 = new Piso();
        addObject(piso7,1278,531);
        Piso piso8 = new Piso();
        addObject(piso8,1513,576);
        piso7.setLocation(1204,309);
        piso7.setLocation(1457,328);
        piso7.setLocation(1272,299);
        piso7.setLocation(1265,323);
        piso8.setLocation(1425,571);
        Piso piso9 = new Piso();
        addObject(piso9,1688,466);
        Piso piso10 = new Piso();
        addObject(piso10,1872,341);
        piso10.setLocation(1885,348);
        arbol.setLocation(719,607);
        arbol.setLocation(828,587);
        arbol4.setLocation(857,192);
        piso10.setLocation(327,288);
        piso10.setLocation(18,332);
        piso10.setLocation(64,182);
        piso10.setLocation(29,148);
        piso10.setLocation(63,168);
        piso6.setLocation(440,365);
        piso6.setLocation(-90,340);
        piso6.setLocation(251,344);
        piso6.setLocation(48,347);
        arbol6.setLocation(51,364);
        piso6.setLocation(43,361);
        arbol6.setLocation(34,359);
        arbol6.setLocation(59,353);
        piso5.setLocation(204,256);
        piso5.setLocation(279,267);
        arbol7.setLocation(249,229);
        piso5.setLocation(239,269);
        piso8.setLocation(869,584);
        nube.setLocation(848,182);
        arbol4.setLocation(901,231);
        arbol11.setLocation(628,553);
        canela.setLocation(109,476);
        removeObject(canela);
        Canela canela2 = new Canela();
        addObject(canela2,97,469);
        canela2.setLocation(49,468);
        Nube nube7 = new Nube();
        addObject(nube7,1226,159);
        nube7.setLocation(1050,103);
        Nube nube8 = new Nube();
        addObject(nube8,1371,180);
        Nube nube9 = new Nube();
        addObject(nube9,1368,95);
        Piso piso11 = new Piso();
        addObject(piso11,1163,545);
        piso11.setLocation(1198,544);
        removeObject(piso11);
        Arbol arbol12 = new Arbol();
        addObject(arbol12,1114,549);
        Arbol arbol13 = new Arbol();
        addObject(arbol13,1075,305);
        Arbol arbol14 = new Arbol();
        addObject(arbol14,1425,566);
        Piso piso12 = new Piso();
        addObject(piso12,1447,260);
        Piso piso13 = new Piso();
        addObject(piso13,974,357);
        arbol9.setLocation(410,583);
        Piso piso14 = new Piso();
        addObject(piso14,410,583);
        arbol9.setLocation(409,593);
        arbol12.setLocation(1138,586);
        Piso piso15 = new Piso();
        addObject(piso15,1138,586);
        piso3.setLocation(377,407);
        Croqueta croqueta = new Croqueta();
        addObject(croqueta,952,296);
        croqueta.setLocation(973,331);
        nube6.setLocation(86,107);
        Croqueta croqueta2 = new Croqueta();
        addObject(croqueta2,86,107);
        nube6.setLocation(61,134);
        Croqueta croqueta3 = new Croqueta();
        addObject(croqueta3,710,456);
    }
}
