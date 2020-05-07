
package SogutucuDenetleyicisiSistemi;

import java.util.Scanner;
/**
 *
 * @author Hilal Merve
 */
public class SogutucuDenetleyisi {
    private IEkran ekran;
    private ITusTakimi tusTakimi;
    private ISubject publisher;


    private static final int SICAKLIK_GORUNTULEME = 1;
    private static final int SOGUTUCUYU_ACMA = 2;
    private static final int SOGUTUCUYU_KAPATMA = 3;
    private static final int CIKIS = 4;
    
    public SogutucuDenetleyisi(){
        ekran = new Ekran();
        tusTakimi = new TusTakimi();
    }
    
   
    public void Basla(){
        int kullaniciNumarasi = 0;
        int sifre = 0;
        String kullaniciAdi = null;
        Kullanici kullanici = null;
        Kullanici kullanicci = null;
        
        VeriTabaniYonetimSistemi veritabani = new VeriTabaniYonetimSistemi();
        ekran.mesajGoruntule("Giriş ekranına yönlendiriliyorsunuz..");
        Bekleme.bekle(2000);
        
        ekran.mesajGoruntule("Kullanıcı numaranızı giriniz: ");
        kullaniciNumarasi = tusTakimi.veriAl();
        
        ekran.mesajGoruntule("Şifrenizi giriniz: ");
        sifre = tusTakimi.veriAl();
        kullanici = veritabani.kullaniciKontrol(kullaniciNumarasi,sifre);
        Bekleme.bekle(1000);
        
       
      if(kullanici != null){
          ekran.mesajGoruntule("Kullanıcı doğrulandı." + kullanici);
                ekran.mesajGoruntule("Başarılı bir şekilde giriş yaptınız. Menü açılıyor..");
                Bekleme.bekle(1000);
                islemSecimi(kullanici); 
        }
         else
          ekran.mesajGoruntule("Kullanıcı doğrulanamadı.");
        }
    
    private void islemSecimi(Kullanici kullanici){
            int secim;
            do{
		secim=anaMenuyuGoster();
		switch (secim){
                    case SICAKLIK_GORUNTULEME:
                        LogYoneticisi.getInstance("Log.txt").dosyayaYaz("Sicaklik goruntulendi.");
                        SicaklikBelirleme sicaklik = new SicaklikBelirleme(publisher,0);
                        IIslem sicaklikgoruntuleme = new SicaklikGoruntuleme(ekran, tusTakimi, kullanici, sicaklik);
                        sicaklikgoruntuleme.islemYap();          
                    break;
                    
                    
                    case SOGUTUCUYU_ACMA:
                        LogYoneticisi.getInstance("Log.txt").dosyayaYaz("Sogutucu acildi.");
                        Scanner giris = new Scanner(System.in);
                        
                        ekranUyari uyariEkran = new ekranUyari();
                        Yonetici yonetici = new Yonetici();
                        LogUyari log = new LogUyari();
                        
                        
                        Publisher publisher = new Publisher();
                        publisher.attach(log);
                        publisher.attach(uyariEkran);
                        publisher.attach(yonetici);
                        SicaklikBelirleme degisenSicaklik = new SicaklikBelirleme(publisher,0); 
                        
                        IIslem sogutucuyuAcma = new SogutucuyuAcma(ekran, tusTakimi, kullanici,publisher);
                        sogutucuyuAcma.islemYap();
                        
                        ekran.mesajGoruntule("Soğutucuyu ayarlamak istediğiniz sıcaklığı giriniz:");
                        int deger = tusTakimi.veriAl();
                        
                        ekran.mesajGoruntule("Sıcaklık ayarlanıyor...");
                        Bekleme.bekle(1000);
                        
                        degisenSicaklik.setDeger(deger);
                    break;

                    
                    case SOGUTUCUYU_KAPATMA:
                        LogYoneticisi.getInstance("Log.txt").dosyayaYaz("Sogutucu kapatildi.");
                        IIslem sogutucuyuKapatma = new SogutucuyuKapatma(ekran, tusTakimi, kullanici);
                        sogutucuyuKapatma.islemYap();
                    break;


                    case CIKIS:
                        LogYoneticisi.getInstance("Log.txt").dosyayaYaz("Cikis yapildi.");
                        ekran.mesajGoruntule("Çıkılıyor..");
                        Bekleme.bekle(1000); 
                    break;
                    
                    
                    default:
			ekran.mesajGoruntule("1-4 arasında bir sayı girmelisiniz");
		}
            }while(secim!=4);
    }
    
    
    private int anaMenuyuGoster()
    {
        ekran.mesajGoruntule("**************************");
        ekran.mesajGoruntule("ANA MENÜ");
        ekran.mesajGoruntule("1-Sıcaklığı Görüntüle");
        ekran.mesajGoruntule("2-Soğutucuyu Aç");
        ekran.mesajGoruntule("3-Soğutucuyu Kapat");
        ekran.mesajGoruntule("4-Çıkış");
        ekran.mesajGoruntule("Seçiminiz: ");
        ekran.mesajGoruntule("**************************");
         return tusTakimi.veriAl();
    }
}
