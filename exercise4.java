package btvn;
import java.util.Scanner;
public class exercise4 {
    public static void main(String[] args){
        Scanner tl = new Scanner(System.in);
        System.out.print("nhap vao so nguyen:");
        int a = tl.nextInt();
        int b=0;
        while (a!=0){
            int c=a%10;
            b=b*10+c;
            a/=10;
        }
        System.out.println("dao nguoc la:" + b);
}
}

