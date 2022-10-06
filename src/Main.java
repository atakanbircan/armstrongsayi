import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,z, y = 10, basmakSayisi = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("sayı giriniz : ");
        x = input.nextInt();
        z=x;
        while (x != 0) {
            x = x / y;
            basmakSayisi++;
        }
        int saglama = 0;
        for (int i = 1; i <= x; i++) {
            int sonBasamak = x % 10;
            saglama = 0;
            int us = (int) Math.pow(sonBasamak, basmakSayisi);
            saglama = saglama + us;
        }
        if (saglama == x) {

            System.out.println(z+" bir armstrong sayıdır!");
        }
        else {
            System.out.println();
        }


    }
}