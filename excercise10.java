package btvn;
import java.util.Scanner;
public class excercise10 {
    public static void main(String[] args){
        Scanner tl = new Scanner(System.in);
        System.out.print("nhap n:");
        int n = tl.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}