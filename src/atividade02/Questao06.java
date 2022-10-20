package atividade02;
import java.util.Scanner;
public class Questao06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Qual o seu peso?(Em quilogramas)\n KG ");
        float Peso = scan.nextFloat();
        System.out.println("Qual a sua altura?(Em metros)");
        float Altura = scan.nextFloat();
        scan.close();
        float IMC= Peso/(Altura*Altura);
        System.out.println("Seu IMC é de: "+String.format("%.2f", IMC));
        if(IMC<20){
            System.out.println("Seu IMC está abaixo do normal");
        }else if(IMC>=20 && IMC<=25){
            System.out.println("Seu IMC está normal");
        }else if(IMC>25 && IMC<=30){
            System.out.println("Seu IMC está Sobrepeso");
        }else if(IMC>30 && IMC<=35){
            System.out.println("Seu IMC está Obesidade leve");
        }else if(IMC>35 && IMC<=40){
            System.out.println("Seu IMC está Obesidade moderada");
        }else{
            System.out.println("Seu IMC está Obesidade mórbida");
        }
    }
}
