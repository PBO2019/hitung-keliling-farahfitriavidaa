public class Lingkaran {
    private double phi = 3.14;
    private double keliling;
    private int jari_jari;

    public void setJariJari(int jari_jari){
        this.jari_jari = jari_jari;
    }
    public void rumus(){
        keliling = 2 * phi * jari_jari;
    }

    public double getKeliling(){
        return keliling;
    }

}


