package praktikum.sesi2;
import java.util.Scanner;
public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan sebuah angka: ");
        int angka = input.nextInt();

        int faktorial = 1;
        int i = angka;
        //looping while untuk menghitung faktorial
        while ( i > 0){
            faktorial *= i;// kalikan faktorial degan nilai saat ini
            i--;           // kurangi nilai
        }

        input.close();

        System.out.println("Faktorial dari " + angka + " adalah " + faktorial);
    }
}
