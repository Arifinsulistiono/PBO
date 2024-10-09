package praktikum.sesi2;
import java.util.Scanner;
public class LampuLaluLintas {
    public static void main(String[] args) {
        //membuat Variable dan scanner
        String lampu;
        Scanner scan = new Scanner(System.in);
        //mengambil input
        System.out.println( " Inputkan Nama Warna: ");
        lampu = scan.nextLine();

        switch (lampu){
            case "merah":
                System.out.print("Lampu merah, berhenti!");
                break;
            case "kuning":
                System.out.print("Lampu kuning, harap hati-hati");
                break;
            case "hijau":
                System.out.print("Lampu hijau, Silahkan jalan");
              break;
        default:
            System.out.println("warna Lampu Salah");
        }
        scan.close();
    }
}
