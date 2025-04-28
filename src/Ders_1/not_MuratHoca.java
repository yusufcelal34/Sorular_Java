package Ders_1;

import java.util.ArrayList;
import java.util.Scanner;

public class not_MuratHoca {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sizden istenen 5 adet notu giriniz:");
        ArrayList<Integer> notlar = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println(i+1+". notu giriniz");
            double not = scanner.nextDouble();
            notlar.add((int) not);

        }
        double toplam = 0;
        //for (double a : notlar) {

        }
    }

