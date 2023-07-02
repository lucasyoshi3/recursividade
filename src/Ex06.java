import java.util.*;
public class Ex06 {
    public static void main(String[] args){
        int i;
        Scanner sc=new Scanner(System.in);
        double n=11;
        while (n>10) {
            System.out.println("N: ");
            n = sc.nextDouble();
        }
        System.out.println(s(n));
    }
    public static double s(double n){
        if(n!=1){
            return 1/fatorial(n) + s(n-1);
        }
        return 1;
    }

    public static double fatorial(double n){
        if(n>1){
            return fatorial(n-1)*n;
        }
        return 1;
    }
}
