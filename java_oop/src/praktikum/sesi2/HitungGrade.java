package praktikum.sesi2;
import java.util.Scanner;
public class HitungGrade {
    public static void main(String[] args) {
        //membuat variable dan scanner
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);
        //mengambil input
        System.out.print("Inputkan Nilai: ");
        nilai = scan.nextInt();
        //menghitung graenya
        if(nilai >= 90){
            grade = "A";
        } else if (nilai >=80){
            grade = "B+";
        } else if (nilai >=75){
            grade = "B";
        } else if (nilai >=70){
            grade = "C+";
        } else if (nilai >=65){
            grade = " C";
        } else if (nilai >=60){
            grade = "D";
        } else {
            grade = "E";
        }
        //cetak hasilnya
        System.out.println("Grade: " + grade);
        scan.close();
    }
}
