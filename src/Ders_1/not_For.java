package Ders_1;

import java.util.ArrayList;
import java.util.Scanner;

public class not_For {
    public static void main(String[] args) {

        // Kullanıcıdan 5 adet not alarak bir ArrayList oluşturun.
        // Bu notların ortalamasını hesaplayarak ekrana yazdırın.

        // Örnek çıktı:
        // Notların ortalaması: 78.5

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> notlar = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". notu giriniz: ");
            int not = scanner.nextInt();
            notlar.add(not);
        }


        int toplam = 0;
        for (int not : notlar) {
            toplam += not;
        }
        double ortalama = (double) toplam / notlar.size();


        System.out.println("Notların ortalaması: " + ortalama);

        scanner.close();

    }
}
