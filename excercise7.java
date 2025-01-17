package btvn;
import java.util.Scanner;
public class excercise7 {
    public static int fbnc(int n){
        if(n<=1)
            return n;
        return fbnc(n-1) + fbnc(n-2);
           
    }
    public static void main(String[] args){
        Scanner tl = new Scanner(System.in);
        System.out.print("nhap vao so:");
        int n = tl.nextInt();
        for(int i=1 ;i<n; i++){
            System.out.println(fbnc(i) + " ");
        }
    }
}