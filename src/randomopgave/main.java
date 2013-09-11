//opgave 2 i import og brug af klasser 

package randomopgave;

import java.util.Random;

/**
 *
 * @author Kim Vammen
 */
public class main
{
    public static void main(String[] args)
    {
       int terning; 
       int antalTerningSider = 6;
             
       Random ran = new Random();
           
       terning = ran.nextInt(antalTerningSider)+1;
           
       System.out.println("Terningen viser: " + terning);
    }
}


