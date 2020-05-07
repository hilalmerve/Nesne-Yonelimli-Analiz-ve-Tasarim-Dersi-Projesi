
package SogutucuDenetleyicisiSistemi;

import java.time.LocalDateTime;
/**
 *
 * @author Hilal Merve
 */
public class LogUyari implements IObserver{
      @Override
    public void update(String uyari){LogYoneticisi.getInstance("Log.txt").dosyayaYaz(uyari);}
}
