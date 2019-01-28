public class Main {

    public static void main(String[] args) {

        Bujursangkar bj = new Bujursangkar();
        Lingkaran ll = new Lingkaran();

        bj.setSisi(8);
        bj.rumus();
        System.out.println("Keliling bujursangkarnya yaitu " + bj.getKeliling() + " cm");

        ll.setJariJari(7);
        ll.rumus();
        System.out.println("Keliling lingkarannya yaitu " + ll.getKeliling() + " cm");
    }
}
