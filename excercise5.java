
package btvn;
import java.util.Scanner;
public class excercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();  
        int dem = 0;  
        if (a == 0) {
            dem = 1;
        } else {
            while (a != 0) {
                a /= 10;  
                dem++;  
            }
        }
        System.out.println("Number of digits: " + dem);
        
    }
}

