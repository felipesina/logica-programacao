package atividade01;
import java.util.Scanner;
public class Questao02 {

public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Escreva um número:");
        int num = scan.nextInt();
        System.out.println("O número Digitado é "+(num));
        System.out.println("O número Antecessor é "+(num-1));
        System.out.println("O número Sucessor é "+(num+1));
    } 
}

