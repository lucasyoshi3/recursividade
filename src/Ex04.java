import java.util.*;
public class Ex04 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Numero de 10 a 999999: ");
        int num1= sc.nextInt();
        System.out.println("Numero repetido: ");
        int num2= sc.nextInt();;
        System.out.println(qtdVezes(num1,num2,0));
    }
    public static int qtdVezes(int num1,int num2,int vezes){
        if(num1!=0){
            if(num2==num1%10){
                return qtdVezes(num1/10,num2,vezes+1);
            }
            return qtdVezes(num1/10,num2,vezes);
        }
        return vezes;
    }
}
