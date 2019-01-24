public class Lingkaran {
    private double phi = 3.14;
    private double luas;

    public void rumus(double jari){
        luas = 2 * phi * jari;
        System.out.println("Keliling lingkaran adalah " + luas + " cm");
    }

    public static void main(String[] test){
        Lingkaran ll = new Lingkaran();
        ll.rumus(7);
    }
}
