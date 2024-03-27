import java.util.HashMap;
import java.util.Scanner;

public class tes {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan pasangan nilai kunci yang dipisahkan dengan spasi. Masukkan '0' untuk berhenti.");

        while (true) {
            int key = input.nextInt();
            if (key == 0) {
                break;
            }

            String nilai = input.next();

            hashMap.put(key, nilai);
        }

        System.out.println("Konten HashMap: ");

        for (Integer theKey : hashMap.keySet()) {
            System.out.println("Key: " + theKey + " Value: " + hashMap.get(theKey));
        }
    }
}