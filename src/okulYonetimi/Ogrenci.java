package okulYonetimi;

public class Ogrenci extends Kisi {

    private String numara;
    private String sinif;

    public Ogrenci() {

    }

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String numara, String sinif) {
        super(adSoyad, kimlikNo, yas);
        this.numara = numara;
        this.sinif = sinif;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {

        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" + "ad soyad=" + getAdSoyad() + ", kimlik No=" + getKimlikNo() + ", yas=" + getYas() +
                ", numara='" + numara + '\'' +
                ", sinif='" + sinif + '\'' +
                '}';
    }
}