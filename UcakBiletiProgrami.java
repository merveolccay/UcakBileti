package java101;

import java.util.Scanner;

public class UcakBiletiProgrami {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;
        double tutar, indTutar;
        Scanner inp = new Scanner(System.in);
        System.out.println("Mesafeyi km cinsinden giriniz: ");
        mesafe = inp.nextInt();
        System.out.println("Yaşınızı giriniz: ");
        yas = inp.nextInt();
        System.out.println("1=>Tek yön/2=>Gidiş-Dönüş olacak şekilde seçiminizi giriniz: ");
        yolculukTipi = inp.nextInt();
        double normalTutar = mesafe * (0.10);

        if(mesafe<0){
            System.out.println("Hatalı veri girdiniz.");
        }


        if(yolculukTipi == 2) {
            if (yas > 0 && yas < 12) {
            double indirim1 = normalTutar * (0.5);
            tutar = normalTutar - indirim1;
            indTutar = normalTutar*(0.20);
            System.out.println("Gidiş dönüş indirimli fiyat: "+ 2*(tutar - indTutar));
            } else if (yas >= 12 && yas < 25) {
            double indirim2 = normalTutar * (0.10);
            tutar = normalTutar - indirim2;
            indTutar = normalTutar*(0.20);
            System.out.println("%10 indirimli fiyat: " + 2*(tutar-indTutar));
            } else if (yas >= 25 && yas < 65) {
            indTutar = normalTutar*(0.20);
            System.out.println("%50 indirimli fiyat: " + 2*(normalTutar-indTutar));
            } else if (yas >= 65) {
            double indirim3 = normalTutar * (0.30);
            tutar = normalTutar - indirim3;
            indTutar = tutar*(0.20);
            System.out.println("%30 indirimli fiyat: " + 2*(tutar-indTutar));
            } else {
            System.out.println("Hatalı veri girdiniz.");
            }

        }else if(yolculukTipi == 1){
            if (yas > 0 && yas < 12) {
            double indirim1 = normalTutar * (0.5);
            tutar = normalTutar - indirim1;
            System.out.println("Gidiş dönüş indirimli fiyat: "+ tutar);
            } else if (yas >= 12 && yas < 25) {
            double indirim2 = normalTutar * (0.10);
            tutar = normalTutar - indirim2;
            System.out.println("%10 indirimli fiyat: " + tutar);
            } else if (yas >= 25 && yas < 65) {
            System.out.println("%50 indirimli fiyat: " + normalTutar);
            } else if (yas >= 65) {
            double indirim3 = normalTutar * (0.30);
            tutar = normalTutar - indirim3;
            System.out.println("%30 indirimli fiyat: " + tutar);
            } else {
            System.out.println("Hatalı veri girdiniz.");
            }
        }else{
            System.out.println("Hatalı veri girdiniz.");
        }



    }
}
