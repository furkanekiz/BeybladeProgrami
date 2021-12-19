package com.mycompany.beybladeprogrami;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        //Polymorphism kullanarak Beyblade Programi
        System.out.println("--Beyblade Programi--");
        System.out.println("Cikis icin q'ya basin");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Hangi Beyblade'i uretmek istiyorsunuz;");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan Cikiliyor...");
                break;
            } else {
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();

                Beyblade beyblade = fabrika.beybladeUret(islem);
                if (beyblade == null) {
                    System.out.println("Lutfen gecerli bir Beyblade ismi girin...");
                } else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }

        }

    }
}
