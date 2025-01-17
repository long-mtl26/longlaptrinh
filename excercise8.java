
package btvn;
import java.util.Scanner;
public class excercise8 {
    public static void Nhap(int[] a){
        Scanner tl = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]=tl.nextInt();        
        }
    }
    public static void Xuat(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static int SLN(int[] a){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
}
    public static void main(String[] args){
        Scanner tl = new Scanner(System.in);
        System.out.print("nhap so phan tu:");
        int n = tl.nextInt();
        System.out.print("nhap so luong phan tu trong mang:");
        int[] n = Nhap(a);
}
}
