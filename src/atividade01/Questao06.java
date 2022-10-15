package atividade01;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Questao06 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.println("Valor da conta: "); 
        float valor = Scan.nextFloat();
        System.out.println("A conta será dividida em quantas partes: ");
        int quant = Scan.nextInt();

        float r = valor/quant;

        Locale local = new Locale("pt","BR");
        NumberFormat Dinheiro = NumberFormat.getCurrencyInstance(local);
        System.out.println("O valor será dividido para "+quant+" pessoas"); 
        System.out.println("O valor individual para cada ficou: "+Dinheiro.format(r));
    }
    
}
