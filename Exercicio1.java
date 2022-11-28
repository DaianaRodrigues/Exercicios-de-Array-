import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //entrada de dados
        Scanner ler = new Scanner(System.in);
        int numeros[] = new int[6];
        int maior = 0;
        int menor = 0;
        System.out.println("Digite aqui 6 números aleatórios: ");
        //Laço para achar o menor e maior numero
        for(int i = 0;i < numeros.length; i++){
            numeros[i] = ler.nextInt();
            if(numeros[i] > maior){
                maior = numeros[i];
            }
        }
        for(int j = 0; j < numeros.length; j++){
            if(numeros[j] < menor){
                menor = numeros[j];
            }
        }
        System.out.printf("O número maior foi: %d, e o menor número foi: %d.", maior, menor);
    }
}
