package atividade02;
import java.util.Scanner;
public class Questao02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        for(int i=0;i<3;i++){
            System.out.println("Digite o "+i+"º Número: ");
            int num = scan.nextInt();
            if(i==0){
                maior = num;
                menor = num;
            }else if(num>maior){
                maior = num;
            }else if(num<menor){
                menor = num;
            }
        }
        scan.close();
        System.out.println("O maior número digitado foi: "+maior);
        System.out.println("O menor número digitado foi: "+menor);
    }
}
