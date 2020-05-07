
package SogutucuDenetleyicisiSistemi;

import java.util.Random;
/**
 *
 * @author Hilal Merve
 */
public class SicaklikBelirleme {
    private int sicaklik;
    private int deger;
    ISubject publisher;
    
    public int SicaklikBelirleme(){
        Random rastgele = new Random();
        sicaklik = rastgele.nextInt((60 - 0) + 1);
        return sicaklik;
    }
     
    public SicaklikBelirleme(ISubject publisher, int deger){
        this.deger = deger;
        this.publisher = publisher;
    }
    
    public int getDeger() {
		return deger;
	}
    public void setDeger(int eskiDeger) {
		this.deger = eskiDeger;
		publisher.notify("{\"Sıcaklık\":" + " " + eskiDeger + "°C yapıldı."+"}");
	}
}
