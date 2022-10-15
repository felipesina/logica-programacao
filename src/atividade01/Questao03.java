package atividade01;
import java.util.Scanner;
public class Questao03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o seu nome: "); 
        String nome = scan.nextLine();

        System.out.println("Olá "+nome+", Seja bem-vindo!");
    }
}