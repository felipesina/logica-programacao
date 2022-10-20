package atividade02;
import java.util.Scanner;
public class Questao03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a dua idade? ");
        int idade = scan.nextInt();
        scan.close();
        if(idade>16){
            System.out.println("Com "+idade+" anos, você já pode votar.");
        }else{
            System.out.println("Com "+idade+" anos, você não pode votar.");
        }
    }
}
