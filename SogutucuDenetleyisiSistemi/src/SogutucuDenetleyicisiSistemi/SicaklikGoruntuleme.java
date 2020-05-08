
package SogutucuDenetleyicisiSistemi;
/**
 *
 * @author Hilal Merve
 */
public class SicaklikGoruntuleme implements IIslem{
    private IEkran ekran;
    private ITusTakimi tusTakimi;
    private Kullanici kullanici;
    private SicaklikBelirleme sicaklik;
   
    public SicaklikGoruntuleme(IEkran ekran, ITusTakimi tusTakimi, Kullanici kullanici, SicaklikBelirleme sicaklik)
    {
        this.sicaklik = sicaklik;
        this.ekran = ekran;
        this.tusTakimi = tusTakimi;
        this.kullanici = kullanici;
    }
    
    @Override
    public void islemYap(){
        ekran.mesajGoruntule("Sıcaklığı görüntüleme işlemini seçtiniz.");
        ekran.mesajGoruntule("Sıcaklık değeri:..." + " " + sicaklik.SicaklikBelirleme() + "°C" );
    }        
}
