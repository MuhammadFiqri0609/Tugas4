package no6;
import java.util.ArrayList;

public class No6 {
    public static void main(String[] args) {
        // Deklarasi ArrayList
        java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>();

        // Menambahkan elemen ke ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Mencetak ArrayList
        System.out.println("Isi ArrayList:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element " + i + ": " + numbers.get(i));
        }
    }
}