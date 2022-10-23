import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        int angka;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        angka = masukan.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Bilangan Ganjil");
        }

        if (angka % 2 == 0) {
            if (angka > 10) {
                System.out.print("Bilangan Genap dan ");
                System.out.println("Merupakan Bilangan lebih dari 10");
            }
        }

        System.out.println("Maka : " + (angka % 2 == 0 ? "Bilangan Genap halo angka " + angka : "Bilangan Ganjil"));
    }
}
