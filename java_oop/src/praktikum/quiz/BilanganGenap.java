package praktikum.quiz;

public class BilanganGenap {
    public static void main(String[] args) {
        int sum = 0;
        
        // Loop through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                sum += i; // Add to the sum if the number is even
            }
        }
        
        // Output the result
        System.out.println("Jumlah bilangan genap antara 1 hingga 100: " + sum);
    }
}
