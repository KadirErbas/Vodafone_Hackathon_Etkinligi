public class Main {
    public static void main(String[] args) {

        Patients patient1 = new Patients("Hasan","Kara",20);
        Patients patient2 = new Patients("Melda","Eğri",21);
        Patients patient3 = new Patients("Ömer Faruk","Karaoğlan",19);
        Patients patient4 = new Patients("Kadir","Erbaş",21);

        Medicines medicine1 = new Medicines("Parol",40,18);
        Medicines medicine2 = new Medicines("Tobrased",50,20);

        MedicineManager manager = new MedicineManager();


        medicine1.addOnerilmeyenDurum("Hamilelik");
        medicine1.addAlerjen("Parasetamol");

        patient1.selectDurumlar();
        patient1.selectAlerjenler();

        System.out.println(
                patient1.getAd()+" "+ patient1.getSoyAd()+
                "\nYasınız : "+patient1.getYas()+
                "\nAlerjiniz : "+patient1.getAllAlerjiler()+
                "\nSağlık durumunuz: "+patient1.getAllDurumlar());


        if (manager.yasUygunMu(patient1.getYas(), medicine1.getMinimumYasSiniri())){
            if (manager.durumUygunMu(patient1.getAllDurumlar(),medicine1.getAllOnerilmeyenDurumlar())){
                if (manager.alerjenUygunMu(patient1.getAllAlerjiler(),medicine1.getAllAlerjenler())){
                    System.out.println(patient1.getAd()+" ilacını alabilirsiniz!");
                } else {
                    System.out.println("Alerjenden dolayı alamazsınız!" +
                            "\nIlacın alerjen maddeleri: "+medicine1.getAllAlerjenler());
                }
            } else {
                System.out.println("Sağlık durumunuzdan dolayı alamazsınız!" +
                        "\nIlaç, "+medicine1.getAllOnerilmeyenDurumlar()+" durumlarından en az birine sahip olan bireyler için uygun değildir.");
            }
        }else {
            System.out.println("Yaş durumunuzdan dolayı alamazsınız!" +
                    "\nminimum yaş "+medicine1.getMinimumYasSiniri()+" olmalı.");
        }

    }
}
