package atividade02;
import java.util.Scanner;
public class Questao01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um Número");
        int num = scan.nextInt();
        scan.close();
        System.out.print("O número: "+num+" é ");
        if (num>0){
            System.out.println("Maior do que 0");
        }else if(num<0){
            System.out.println("Menor do que 0");
        }else if(num==0){
            System.out.println("Igual à 0");
        }
    }
}
