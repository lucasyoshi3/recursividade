import java.util.*;
public class Ex05 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("N: ");
        int n=sc.nextInt();
        if(n>20){
            n=20;
        }
        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int n){
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}