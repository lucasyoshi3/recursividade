import java.util.*;
public class Ex02 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Num: ");
        int decimal=sc.nextInt();
        System.out.println(binario(decimal, ""));
    }

    public static String binario(int decimal, String str){
        if(decimal!=0){
            str=binario(decimal/2, str)+String.valueOf(decimal%2);
            return str;
        }
        return str;
    }
}
