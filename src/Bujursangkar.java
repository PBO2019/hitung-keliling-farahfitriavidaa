import java.util.Scanner;

public class Bujursangkar {
    Scanner inp = new Scanner(System.in);
    private int sisi;
    private int keliling;

    public void input(){
        System.out.print("Masukan sisi nya : ");
        sisi = inp.nextInt();
        System.out.println("");
        rumus();
    }

    public void rumus(){
        keliling = 4 * sisi;
        System.out.println("Sisi bujursangkar " + sisi + " cm");
        System.out.println("Keliling bujursangkarnya yaitu " + keliling + " cm");
    }

    public static void main(String[] far){
        Bujursangkar bs = new Bujursangkar();
        bs.input();
    }
}
