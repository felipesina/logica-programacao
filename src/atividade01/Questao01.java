package atividade01;

import java.util.Scanner;
public class Questao01 {
    public static void main (String [] args) throws Exception {
        Scanner Scan = new Scanner(System.in);

        System.out.println(" Digite a primeira nota:");
        float n1 = Scan.nextFloat();
        System.out.println("Digite a segunda nota:");
        float n2 = Scan.nextFloat();
        float media = (n1 + n2)/2;
        System.out.println("Sua média final foi:" +media);
        if (media>=6){
            System.out.println("Você passou");
        } else {
            System.out.println("Estude mais, que dessa vez não foi possível.");
        }
    }
}