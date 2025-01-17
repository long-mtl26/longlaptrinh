
package btvn;
import java.util.Scanner;
public class excercise3 {
    public static void main(String[] args){
        Scanner tl = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen:");
        int n = tl.nextInt(); 
        int a=1;
        for(int i=1;i<=n;i++){
            a*=i;
            
        }
        System.out.println("tong giai thua la:" + a);
    }
}
