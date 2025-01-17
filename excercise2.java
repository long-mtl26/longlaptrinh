
package btvn;
import java.util.Scanner;
public class excercise2 {
    public static void main(String[] args){
        Scanner tl = new Scanner(System.in);
        System.out.print("Nhap vao 1 so nguyen:");
        int n = tl.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.println("tong cong la:" + sum);
    
}
}
