package array;
public class Array {
     public static void main(String[] args) {
        // Deklarasi dan inisialisasi array
        int[] numbers = new int[5]; // Array dengan panjang 5

        // Mengisi nilai array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Mencetak nilai array
        System.out.println("Isi array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + i + ": " + numbers[i]);
        }
    }
}