import java.util.Scanner;

public class KdvCalculator {
    public static void main(String[] args) {
        
        double urunFiyati, kdvOrani, kdvliFiyat;     
        
        Scanner inp = new Scanner(System.in);

        System.out.print("Ürünün Fiyatı (tl): ");
        urunFiyati = inp.nextDouble();

        kdvOrani = (urunFiyati<1000)? 0.18 : 0.08;
        System.out.println("KDV Oranı: " +kdvOrani);

        kdvliFiyat = ((urunFiyati*kdvOrani)+urunFiyati);
        System.out.println("KDV'li Ürün Fiyatı: " +kdvliFiyat);

    }
}
