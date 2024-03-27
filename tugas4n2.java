package tugas4n2;
import java.util.Scanner;

public class Tugas4N2 {
    public static void main(String[] args) {
        HitungRata hitung = new HitungRata();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Data : ");
        int banyakData = input.nextInt();
        int nilai[] = new int[banyakData];
        System.out.print("Daftar Nilai : ");
        inputOpsi(input, hitung, banyakData, nilai);
        System.out.println("Rata Nilai : "+ hitung.rataNilai(banyakData));
        inputOpsi(input, hitung, banyakData, nilai);
        System.out.print("Daftar Nilai Baru : ");
        hitung.cetakNilaiBaru();
    }

    public static void inputOpsi(Scanner input, HitungRata hitung, int banyakData, int nilai[]) {
        System.out.println("Pilih Opsi:");
        System.out.println("1. Input Nilai");
        System.out.println("2. Input Nilai Baru");
        System.out.print("Masukkan Pilihan: ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                hitung.inputNilai(nilai);
                hitung.cetakNilai(nilai);
                break;
            case 2:
                hitung.inputNilaiBaru(banyakData);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}