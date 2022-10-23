import java.util.ArrayList;
import java.util.Scanner;

public class KonversiNilai {
    public static void main(String[] args) {
        String nim, prodi;
        int nilai;

        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan NIM = ");
        nim = masukan.nextLine();
        System.out.print("Masukan Nama = ");
        masukan.nextLine();
        System.out.print("Matakuliah = ");
        masukan.nextLine();
        System.out.print("Masukan Nilai Angka = ");
        nilai = masukan.nextInt();
        System.out.println("===== Penentuan Prodi & Nilai =====");

        // get prodi code from nim
        prodi = nim.substring(3,5);

        System.out.print("Program Studi : ");
        switch (prodi) {
            case "52":
                System.out.println("Program Studi = S-1 Teknologi Informasi");
                break;
            case "51":
                System.out.println("Program Studi = S-1 Sistem Informasi");
                break;
            case "39":
                System.out.println("Program Studi = D3 Sistem Informasi");
                break;
            default:
                System.out.println("Program Studi Tidak Ditemukan");
                break;
        }

        if (nilai >= 85) {
            System.out.println("Grade Mahasiswa ini A");
            System.out.println("Sangat Memuaskan");
        } else if (nilai >= 80) {
            System.out.println("Grade Mahasiswa ini A-");
            System.out.println("Sangat Memuaskan");
        }else if (nilai >= 75) {
            System.out.println("Grade Mahasiswa ini B+");
            System.out.println("Memuaskan");
        }else if (nilai >= 70) {
            System.out.println("Grade Mahasiswa ini B");
            System.out.println("Memuaskan");
        }else if (nilai >= 65) {
            System.out.println("Grade Mahasiswa ini B-");
            System.out.println("Memuaskan");
        }else if (nilai >= 60) {
            System.out.println("Grade Mahasiswa ini C+");
            System.out.println("Cukup");
        }else if (nilai >= 55) {
            System.out.println("Grade Mahasiswa ini C");
            System.out.println("Cukup");
        }else if (nilai >= 50) {
            System.out.println("Grade Mahasiswa ini C-");
            System.out.println("Cukup");
        }else if (nilai >= 45) {
            System.out.println("Grade Mahasiswa ini D");
            System.out.println("Kurang");
        }else if (nilai >= 0) {
            System.out.println("Grade Mahasiswa ini E");
            System.out.println("Sangat Kurang");
        } else {
            System.out.println("Input Salah!");
        }
    }
}
