package atividade03;
import java.util.Scanner;
public class Questao04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maior = 0;
        int menor = 0;

        for(int i = 1; i<=5;i++){
            System.out.println(String.format("Digite a idade da %sº Pessoa: ", (i)));
            int idade = scan.nextInt();
            if(idade>=18){
                maior++;
            }else{
                menor++;
            }
        }
        System.out.println(String.format("Maior de idade: %s\nMenor de idade: %s", (maior),(menor)));
        scan.close();
    }
}
