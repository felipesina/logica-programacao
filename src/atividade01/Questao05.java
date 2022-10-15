package atividade01;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class Questao05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o valor do álcool: R$");
        float valor = scan.nextFloat();

        float porcgarc =(valor*10)/100;
        float Total = (porcgarc+valor);
        
        Locale local = new Locale("pt","BR");
        NumberFormat Dinheiro = NumberFormat.getCurrencyInstance(local);

        System.out.println("*************Boteco**************");
        System.out.println("Porcentagem do Garçom: "+Dinheiro.format(porcgarc));
        System.out.println("Valor da Refeição: "+Dinheiro.format(valor));
        System.out.println("Total: "+Dinheiro.format(Total));

    }
}
