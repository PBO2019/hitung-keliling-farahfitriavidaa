public class Bujursangkar{

    private int keliling;

    public void rumus(int sisi){
        keliling = 4 * sisi;
        System.out.println("Keliling dari bujursangkar adalah " + keliling + " cm");
    }

    public static void main(String[] far){
        Bujursangkar bs = new Bujursangkar();
        bs.rumus(6);
    }
}
