package praktikum.quiz;

import java.util.Scanner;

public class ChecknNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah angka: ");
        int number = input.nextInt();
        
        if (number > 0) {
            System.out.println("Angka tersebut positif.");
        } else if (number < 0) {
            System.out.println("Angka tersebut negatif.");
        } else {
            System.out.println("Angka tersebut nol.");
        }
        
        input.close();
    }
}
