
package btvn;
public class excercise6 {
    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            boolean n = true;
            for(int j = 2 ; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    n=false;
                    break;
                }
            }
            if(n){
                System.out.println(i);
        }
    }
}
}
