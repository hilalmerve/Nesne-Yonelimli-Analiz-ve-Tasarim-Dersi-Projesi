
package SogutucuDenetleyicisiSistemi;
/**
 *
 * @author Hilal Merve
 */
public class Kullanici{
    private int kullaniciTuru;
    private String kullaniciAdi;
    private int kullaniciNumarasi;
    private int sifre;
    private IEkran ekran;
    
    public Kullanici(String kullaniciAdi){
        this.kullaniciAdi = kullaniciAdi;
    }
    public Kullanici(int kullaniciTuru,String kullaniciAdi,int kullaniciNumarasi,int sifre){
        this.kullaniciTuru = kullaniciTuru;
        this.kullaniciAdi = kullaniciAdi;
        this.kullaniciNumarasi = kullaniciNumarasi;
        this.sifre = sifre;
    }
    public Kullanici(String kullaniciAdi,int kullaniciTuru,int sifre){
        this.kullaniciAdi = kullaniciAdi;
        this.kullaniciTuru = kullaniciTuru;
        this.sifre = sifre;
    }
    public int getKullaniciNumarasi(){
        return kullaniciNumarasi;
    }
    public String getKullaniciAdi(){
        return kullaniciAdi;
    }
    public int getKullaniciTuru(){
        return kullaniciTuru;
    }
    public int getSifre(){
        return sifre;
    }
    
    @Override
    public String toString(){
        return "Kullanici Bilgileri {" +
                "kullaniciAdi:'" + kullaniciAdi + '\'' +
                 ", kullaniciTuru:" + kullaniciTuru + '}';
    }
    
}
