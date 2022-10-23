package atividade03;
import java.util.Scanner;
public class Questao06 {
    public static void main(String[] args) {
    
        Scanner ler = new Scanner (System.in); 
            int media = 0;
            int soma = 0;
            int valor[] = new int[5];  
            
            for(int i = 0; i < valor.length; i++){  
                System.out.print("Digite o " +(i+1)+"º valor: ");  
                valor[i] = ler.nextInt();  

                soma = soma + valor[i];
            }  
    
    
            int maior = valor[0];
            for (int i = 1 ; i < valor.length; i++){
                    if ( valor[i] > maior) {
                          maior = valor[i];
                   }
              }
    
            int menor = valor[0];
            for (int i = 1; i < valor.length; i++) {  
                if(valor[i] < menor){  
                    menor = valor[i];  
                }  
            }
            int mediat = media = soma /5;
            System.out.println("Maior valor = "+ maior);  
            System.out.println("Menor valor = "+ menor);  
            System.out.println("a soma é:"+ soma);
            System.out.println("a media é:"+mediat);
            ler.close();
        }  
}