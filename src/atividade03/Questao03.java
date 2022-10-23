package atividade03;
import java.util.Scanner;
public class Questao03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma mensagem: ");
        String msg = scan.nextLine();

        System.out.print("Digite a quantidade de Repetições: ");
        int repet = scan.nextInt();

        for (int i = 0;i<=repet;i++){
            System.out.println(msg);
        }
    }
}
