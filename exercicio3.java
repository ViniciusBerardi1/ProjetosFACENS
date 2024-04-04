import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        if (ehPalindromo(palavra)) {
            System.out.println("SIM, é um palíndromo.");
        } else {
            System.out.println("NÃO, não é um palíndromo.");
        }

        scanner.close();
    }

    public static boolean ehPalindromo(String palavra) {
        int tamanho = palavra.length();
        
        // comparando as duas metades
        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
