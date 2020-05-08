
package SogutucuDenetleyicisiSistemi;
/**
 *
 * @author Hilal Merve
 */
public class SogutucuyuAcma implements IIslem{
    private IEkran ekran;
    private ITusTakimi tusTakimi;
    private Kullanici kullanici;
    private ISubject publisher;
    private int deger;
    
    public SogutucuyuAcma(IEkran ekran,ITusTakimi tusTakimi,Kullanici kullanici,ISubject publisher )
    {
        this.ekran = ekran;
        this.kullanici = kullanici;
        this.tusTakimi = tusTakimi;
        this.publisher = publisher;
    }
    
    public int getDeger()
    {
        return deger;
    }
    
    public void setDeger(int deger)
    {
        this.deger = deger;
        publisher.notify("Sıcaklık" + " " + deger + "°C'ye ayarlandı.");
    }
    
    @Override
    public void islemYap(){
        ekran.mesajGoruntule("Soğutucuyu Açma İşlemini Seçtiniz.");
    } 
}
