import java.util.Scanner;

public class KdvCalculator {
    public static void main(String[] args) {
        double urunFiyati, kdvOrani, kdvliFiyat;
        boolean kdvOraniBelirleme;
        Scanner inp = new Scanner(System.in);

        System.out.print("Ürünün Fiyatı (tl): ");
        urunFiyati = inp.nextDouble();

        kdvOraniBelirleme = (urunFiyati > 0) && (urunFiyati < 1000);
        kdvOrani = kdvOraniBelirleme ? 0.18d : 0.08d;
        System.out.println("KDV Oranı: " + kdvOrani);

        kdvliFiyat = (urunFiyati * kdvOrani) + urunFiyati;
        System.out.print("Ürünün KDV'li Fiyatı: " + kdvliFiyat);

    }
}
