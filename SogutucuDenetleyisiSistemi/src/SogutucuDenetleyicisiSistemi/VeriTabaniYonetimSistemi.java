package SogutucuDenetleyicisiSistemi;
import java.sql.*;
/**
 *
 * @author Hilal Merve
 */
public class VeriTabaniYonetimSistemi {
    
    
    private Connection baglan(){

        Connection conn=null;

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/KullanniciDogrulama",
                    "postgres", "sifre");
            if (conn != null){
                System.out.println("Veritabanına bağlandı. Kullanıcı bilgileri doğrulanıyor..");
                Bekleme.bekle(2000);
            }
            else
                System.out.println("Bağlantı girişimi başarısız.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    
    
    public Kullanici kullaniciKontrol(int kullaniciNo, int girilenSifre){
        
        System.out.println("Kullanıcı numarası kontrol ediliyor...");
        Bekleme.bekle(2000);
        Kullanici kullanici=null;

        String sql= "SELECT *  FROM \"Kullanici\" WHERE \"kullaniciNumarasi\"="+kullaniciNo + "AND sifre=" +girilenSifre ;

        Connection conn=this.baglan();
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            //***** Bağlantı sonlandırma *****
            conn.close();

           int kullaniciTuru;
           String kullaniciAdi;
           int kullaniciNumarasi;

            while(rs.next())
            {
                kullaniciAdi = rs.getString("kullaniciAdi");
                kullaniciNumarasi = rs.getInt("kullaniciNumarasi");
                kullaniciTuru  = rs.getInt("kullaniciTuru");

                kullanici = new Kullanici(kullaniciAdi ,kullaniciNumarasi, kullaniciTuru );
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return kullanici;
    }
    
}
