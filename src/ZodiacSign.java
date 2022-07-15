import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {
        int day, month;
        String Zodiac = null;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Gününüzü Giriniz: ");
        day = input.nextInt();
        System.out.print("Doğduğunuz Ayı Rakam Sayı Cinsinden Giriniz: ");
        month = input.nextInt();

        if (month == 3 && (day >= 21)) {
            Zodiac = "Koç";
        } else if (month == 4 && (day <= 20)) {
            Zodiac = "Koç";

        } else if (month == 4 && (day >= 21)) {
            Zodiac = "Boğa";
        } else if (month == 5 && day <= 21) {
            Zodiac = "Boğa";

        } else if (month == 5 && (day >= 22)) {
            Zodiac = "İkizler";
        } else if (month == 6 && (day <= 22)) {
            Zodiac = "İkizler";

        } else if (month == 6 && (day >= 23)) {
            Zodiac = "Yengeç";
        } else if (month == 7 && (day <= 22)) {
            Zodiac = "Yengeç";

        } else if (month == 7 && (day >= 23)) {
            Zodiac = "Aslan";
        } else if (month == 8 && (day <= 22)) {
            Zodiac = "Aslan";

        } else if (month == 8 && (day >= 23)) {
            Zodiac = "Başak";
        } else if (month == 9 && (day <= 22)) {
            Zodiac = "Başak";

        } else if (month == 9 && (day >= 23)) {
            Zodiac = "Terazi";
        } else if (month == 10 && (day <= 22)) {
            Zodiac = "Terazi";

        } else if (month == 10 && (day >= 23)) {
            Zodiac = "Akrep";
        } else if (month == 11 && (day <= 21)) {
            Zodiac = "Akrep";

        } else if (month == 11 && (day >= 22)) {
            Zodiac = "Yay";
        } else if (month == 12 && (day <= 21)) {
            Zodiac = "Yay";

        } else if (month == 12 && (day >= 22)) {
            Zodiac = "Oğlak";
        } else if (month == 1 && (day <= 21)) {
            Zodiac = "Oğlak";

        } else if (month == 1 && (day >= 22)) {
            Zodiac = "Kova";
        } else if (month == 2 && (day <= 19)) {
            Zodiac = "Kova";

        } else if (month == 2 && (day >= 20)) {
            Zodiac = "Balık";
        } else if (month == 3 && (day <= 21)) {
            Zodiac = "Balık";

        }if ( day > 31 || day <= 0 || month <= 0 || month > 12 ){
            System.out.print("Hatalı Giriş! ");
        }else {
            System.out.println("Burcunuz: " + Zodiac);
        }


    }
}
