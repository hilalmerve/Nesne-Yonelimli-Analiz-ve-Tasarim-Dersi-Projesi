
package SogutucuDenetleyicisiSistemi;

/**
 *
 * @author Hilal Merve
 */
public class ekranUyari implements IObserver{
   
     @Override
    public void update(String uyari){System.out.println("Ekranda" + uyari + "mesajı gösterildi.");}
}
