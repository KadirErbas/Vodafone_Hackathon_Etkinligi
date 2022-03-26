import java.util.ArrayList;
import java.util.Scanner;
public class Patients {

    private String ad;
    private String soyAd;
    private int yas;
    private ArrayList<String> durumlar = new ArrayList<String>();
    private ArrayList<String> alerjiler = new ArrayList<String>();


    Patients(String ad, String soyAd, int yas){
        this.ad = ad;
        this.soyAd = soyAd;
        if (yas < 0){
            this.yas = 0;
        }else {
            this.yas = yas;
        }
    }

    public String getAd() {
        return this.ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return this.soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getYas() {
        return this.yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public ArrayList<String> getAllDurumlar() {
        return this.durumlar;
    }

    public void addDurum(String durum) {
        durumlar.add(durum);
    }

    public void removeDurum(int index){
        durumlar.remove(index);
    }

    public ArrayList<String> getAllAlerjiler() {
        return this.alerjiler;
    }

    public void addAlerji(String alerji) {
        alerjiler.add(alerji);
    }

    public void removeAlerji(int index){
        alerjiler.remove(index);
    }


    public void selectDurumlar(){
        String[] durumDizisi=
                {"1-) Hamilelik",
                        "2-) Karaciğer Yetmezliği",
                        "3-) Böbrek Yetmezliği",
                        "4-) Kalp Yetmezliği",
                        "0-) Çıkış"};
        for (String durum:durumDizisi) {
            System.out.println(durum);
        }

        System.out.println("Size ait durumların numarasını seçiniz: ");
        Scanner input = new Scanner(System.in);
        boolean devamMi = true;

        while (devamMi){
            int giris = input.nextInt();
            switch (giris){
                case 1: durumlar.add("Hamilelik"); break;
                case 2: durumlar.add("Karaciğer Yetmezliği"); break;
                case 3: durumlar.add("Böbrek Yetmezliği"); break;
                case 4: durumlar.add("Kalp Yetmezliği"); break;
                case 0: devamMi = false; break;
            }
        }
    }

    public void selectAlerjenler(){

        String[] alerjenDizisi=
                {"1-) Parasetamol",
                        "2-) Propranolol Hidroklorür",
                        "3-) Metoprolol süksinata",
                        "0-) Çıkış"};
        for (String durum:alerjenDizisi) {
            System.out.println(durum);
        }

        System.out.println("Size ait alerjenlerin numarasını seçiniz: ");
        Scanner input = new Scanner(System.in);
        boolean devamMi = true;

        while (devamMi){
            int giris = input.nextInt();

            switch (giris){
                case 1: alerjiler.add("Parasetamol"); break;
                case 2: alerjiler.add("Propranolol Hidroklorür"); break;
                case 3: alerjiler.add("Metoprolol süksinata"); break;
                case 0: devamMi = false; break;
            }
        }
        input.close();
    }
}