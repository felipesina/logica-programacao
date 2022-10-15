package atividade01;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome do Funcionário: ");
        String nome = scan.nextLine();

        System.out.println("Quantas horas o "+nome+" Trabalhou? "); 
        int horas = scan.nextInt();

        System.out.println("Valor da hora de "+nome+": "); 
        float horaValor = scan.nextFloat();

        float Salario = horas*horaValor;

        
        Locale local = new Locale("pt","BR");
        NumberFormat formDinheiro = NumberFormat.getCurrencyInstance(local);
        System.out.println("*************** Ativos mensais  ********************");
        System.out.println("Nome : "+nome);
        System.out.println("Renda por hora: "+(formDinheiro.format(horaValor)));
        System.out.println("Renda por mês: "+(formDinheiro.format(Salario)));
        System.out.println("Renda por Ano: "+(formDinheiro.format(Salario*12)));
        
    }
}
