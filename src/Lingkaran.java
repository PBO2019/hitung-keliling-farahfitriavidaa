import java.util.Scanner;

public class Lingkaran {
    Scanner inp = new Scanner(System.in);
    private double phi = 3.14;
    private double keliling;
    private int jari_jari;


        public void input(){
            System.out.print("Masukan jari-jarinya : ");
            jari_jari = inp.nextInt();
            rumus();
            System.out.println("");
        }
        public void rumus(){
            keliling = 2 * phi * jari_jari;
            System.out.println("Jari-jari lingkaran " + jari_jari + " cm");
            System.out.println("Keliling lingkarannya yaitu " + keliling + " cm");
        }

        public static void main(String[] far){
            Lingkaran ll = new Lingkaran();
            ll.input();

        }
    }

