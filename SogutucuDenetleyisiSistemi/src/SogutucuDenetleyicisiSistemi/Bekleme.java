
package SogutucuDenetleyicisiSistemi;
/**
 *
 * @author Hilal Merve
 */
public class Bekleme {
    private static final int sure = 100;
    public static void bekle(int sure){
        try
        {
            Thread.sleep(sure);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
     public static void bekle(){
        try
        {
            Thread.sleep(sure);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
