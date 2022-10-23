package atividade03;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int contar = ler.nextInt(); 
        int multi = 0 ;

        for (int x = 0; x < 10; x++) {
           int total = contar * ++multi;
            System.out.println(contar + " x " + multi + " = " + total);
        }
        ler.close();
    }
}
