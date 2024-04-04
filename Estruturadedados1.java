import java.util.Scanner;
import java.util.Stack;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pilha.push(numero);
                pares++;
            } else {
                pilha.push(numero);
                impares++;
            }

            if (numero == 0) {
                if (pares > 0) {
                    System.out.println("Removendo da pilha par: " + pilha.pop());
                    pares--;
                } else {
                    System.out.println("Não foi removido nada da pilha par, pois ela já está vazia");
                }

                if (impares > 0) {
                    System.out.println("Removendo da pilha ímpar: " + pilha.pop());
                    impares--;
                } else {
                    System.out.println("Não foi removido nada da pilha ímpar, pois ela já está vazia");
                }
            }
        }

        System.out.println("Removendo todos os elementos das pilhas:");
        while (!pilha.isEmpty()) {
            System.out.println("Removendo: " + pilha.pop());
        }
        
        scanner.close();
    }
}
