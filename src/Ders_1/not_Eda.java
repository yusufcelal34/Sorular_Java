package Ders_1;

import java.util.ArrayList;
import java.util.Scanner;

public class not_Eda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 5 adet not giriniz");
        double notTop = 0;
        ArrayList<Integer> notlar = new ArrayList<>();
        for (int i = 0 ; i < 5; i++) {
            int not = scan.nextInt();
            notlar.add(not);
            notTop += not;
        }
        System.out.println("Girilen notlar: " + notlar);
        System.out.println("Girilen notların ortalaması: " + notTop/5);
    }
}
