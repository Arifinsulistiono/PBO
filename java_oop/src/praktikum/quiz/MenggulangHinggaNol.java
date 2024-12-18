package praktikum.quiz;
import java.util.Scanner;

public class MenggulangHinggaNol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        
        do {
            System.out.print("Masukkan sebuah angka (masukkan 0 untuk berhenti): ");
            number = input.nextInt();
        } while (number != 0);
        
        System.out.println("Program berhenti.");
        input.close();
    }
}
