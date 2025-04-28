package Ders_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class not_While {
    public static void main(String[] args) {

        // Kullanıcıdan 5 adet not alarak bir ArrayList oluşturun.
        // Bu notların ortalamasını hesaplayarak ekrana yazdırın.

        // Örnek çıktı:
        // Notların ortalaması: 78.5

        Scanner scanner = new Scanner(System.in);
        List<Double> notlar = new ArrayList<>();

        int sayac = 0;
        while (sayac <= 4) {
            System.out.println((sayac + 1) + ". ort alınacak sayıyı giriniz:");
            double not = scanner.nextDouble();
            sayac++;
        }
        double ortalama = 0;
        int i = 0;


        while (i < notlar.size()) {
            ortalama = (notlar.get(i)) / i;
            i++;
        }
        System.out.println(ortalama);

        scanner.close();

    }
}
