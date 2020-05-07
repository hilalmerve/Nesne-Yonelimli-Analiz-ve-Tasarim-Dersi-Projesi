
package SogutucuDenetleyicisiSistemi;

/**
 *
 * @author Hilal Merve
 */
public class Yonetici implements IObserver{
     @Override
    public void update(String uyari){System.out.println("Yöneticiye bildirilen mesaj:" + " " + uyari);}
}
