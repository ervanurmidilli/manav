import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double armut = 2.14;
        double elma  = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;
        double n_armut,n_elma,n_domates,n_muz,n_patlican;

        System.out.println("Armut kaç kilo : ");
        n_armut = scan.nextDouble();

        System.out.println("Elma kaç kilo : ");
        n_elma = scan.nextDouble();

        System.out.println("Domates kaç kilo : ");
        n_domates = scan.nextDouble();

        System.out.println("Muz kaç kilo : ");
        n_muz = scan.nextDouble();

        System.out.println("Patlican kaç kilo : ");
        n_patlican = scan.nextDouble();

        double tutar = (n_armut*armut) + (n_domates*domates) + (n_elma*elma) + (n_muz*muz) + (n_patlican*patlican);
        System.out.println("ödemeniz gereken tutar : "+tutar);


    }
}