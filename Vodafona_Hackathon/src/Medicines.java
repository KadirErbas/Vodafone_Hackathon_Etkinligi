import java.util.ArrayList;

public class Medicines {

    private String isim;
    private int fiyat, minimumYasSiniri;
    private ArrayList<String> onerilmeyenDurumlar = new ArrayList<String>();
    private ArrayList<String> alerjenler = new ArrayList<String>();


    Medicines(String isim, int fiyat, int minimumYasSiniri){

        this.isim = isim;
        if (fiyat < 0) {
            this.fiyat = 0;
        }else {
            this.fiyat = fiyat;
        }

        if (minimumYasSiniri < 0){
            this.minimumYasSiniri = 0;
        }else {
            this.minimumYasSiniri = minimumYasSiniri;
        }
    }

    public String getIsim() {
        return this.isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMinimumYasSiniri() {
        return this.minimumYasSiniri;
    }

    public void setMinimumYasSiniri(int minimumYasSiniri) {
        this.minimumYasSiniri = minimumYasSiniri;
    }

    public int getFiyat() {
        return this.fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public ArrayList<String> getAllOnerilmeyenDurumlar() {
        return this.onerilmeyenDurumlar;
    }

    public void addOnerilmeyenDurum(String onerilmeyenDurum){
        this.onerilmeyenDurumlar.add(onerilmeyenDurum);
    }

    public void removeOnerilmeyenDurum(int index){
        this.onerilmeyenDurumlar.remove(index);
    }

    public ArrayList<String> getAllAlerjenler() {
        return this.alerjenler;
    }

    public void addAlerjen(String alerjen){
        this.alerjenler.add(alerjen);
    }

    public void removeAlerjen(int index){
        this.onerilmeyenDurumlar.remove(index);
    }
}