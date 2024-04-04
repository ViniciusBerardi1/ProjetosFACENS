import java.util.Stack;

public class exercicio4 {
    private static Stack<Integer>[] pinos = new Stack[3];
    private static int totalMovimentos = 0;

    public static void main(String[] args) {
        inicializarPinos();
        int numDiscos = 5;
        empilharDiscos(numDiscos);
        totalMovimentos = calcularTotalMovimentos(numDiscos);
        resolverTorreDeHanoi(numDiscos, 'A', 'B', 'C');
        exibirTotalMovimentos();
    }

    private static void inicializarPinos() {
        for (int i = 0; i < 3; i++) {
            pinos[i] = new Stack<>();
        }
    }

    private static void empilharDiscos(int numDiscos) {
        for (int i = numDiscos; i > 0; i--) {
            pinos[0].push(i);
        }
    }

    private static int calcularTotalMovimentos(int numDiscos) {
        return (int) Math.pow(2, numDiscos) - 1;
    }

    private static void resolverTorreDeHanoi(int n, char origem, char auxiliar, char destino) {
        if (n > 0) {
            resolverTorreDeHanoi(n - 1, origem, destino, auxiliar);
            int disco = pinos[origem - 'A'].pop();
            pinos[destino - 'A'].push(disco);
            System.out.println("Mova o disco de " + origem + " para " + destino);
            resolverTorreDeHanoi(n - 1, auxiliar, origem, destino);
        }
    }

    private static void exibirTotalMovimentos() {
        System.out.println("Total de movimentos necessários: " + totalMovimentos);
    }
}
