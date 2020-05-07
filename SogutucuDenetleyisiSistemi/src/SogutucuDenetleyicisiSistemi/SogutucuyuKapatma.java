
package SogutucuDenetleyicisiSistemi;
/**
 *
 * @author Hilal Merve
 */
public class SogutucuyuKapatma implements IIslem{
    private IEkran ekran;
    private ITusTakimi tusTakimi;
    private Kullanici kullanici;
    
    public SogutucuyuKapatma(IEkran ekran,ITusTakimi tusTakimi,Kullanici kullanici )
    {
        this.ekran = ekran;
        this.kullanici = kullanici;
        this.tusTakimi = tusTakimi;
    }
    
    @Override
    public void islemYap(){
        ekran.mesajGoruntule("Soğutucuyu Kapatma İşlemini Seçtiniz.");
        ekran.mesajGoruntule("Soğutucu kapatılıyor...");
        Bekleme.bekle(1000);
    }
}
