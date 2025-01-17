
package btvn;
import java.util.Scanner;
public class excercise9 {
    public static void palindrome(int n){
        int a=n;
        int b=0;
        while( n != 0){
            int c=n%10;
            b = b * 10 + c;
            n/=10;
    }
        if(a==b){
            System.out.println("la so palindrome");
        }else{
            System.out.println("khong phai so palindrome ");
        }
    }
    public static void main(String[] args){
        Scanner tl = new Scanner(System.in);
        System.out.print("Nhap mot so");
        int n = tl.nextInt();
        palindrome(n);
    }
}

