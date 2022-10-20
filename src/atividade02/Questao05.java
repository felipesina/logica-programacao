package atividade02;
import java.util.Scanner;
public class Questao05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a dua idade? ");
        int idade = scan.nextInt();
        scan.close();
        if(idade>18){
            System.out.println("Com "+idade+" anos, você já pode votar e pode dirigir");
        }else if(idade<18 && idade>16){
            System.out.println("Com "+idade+" anos, você pode votar, mas não pode dirigir");
        }else{
            System.out.println("Com "+idade+" anos, você não pode nem votar e nem dirigir");
        }
    }
}
