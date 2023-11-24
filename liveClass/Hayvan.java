package liveClass;

public class Hayvan {
private static int hayvansayisi=0;
    private boolean koşabiliyormu;


    public Hayvan(boolean koşabiliyormu) {
        hayvansayisi++;
        this.koşabiliyormu = koşabiliyormu;
    }
    public Hayvan() {
        hayvansayisi++;
    }

    public static void hayvansayisi() {
                System.out.println(hayvansayisi);
    }



    public boolean isKoşabiliyormu() {
        return koşabiliyormu;
    }

    public void setKoşabiliyormu(boolean koşabiliyormu) {
        this.koşabiliyormu = koşabiliyormu;
    }

    @Override
    public String toString() {
     return    "Merhaba ben hayvan";

    }
}
