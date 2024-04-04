import java.util.Scanner;
import java.util.Stack;

class Carro {
    String modelo;
    int ano;
    String placa;
    String cor;

    public Carro(String modelo, int ano, String placa, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Carro [modelo=" + modelo + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor + "]";
    }
}

class PilhaDeCarros {
    private Stack<Carro> pilha;

    public PilhaDeCarros() {
        pilha = new Stack<>();
    }

    public void inserirCarro(Carro carro) {
        pilha.push(carro);
    }

    public void removerCarros() {
        System.out.println("Removendo os carros da pilha:");
        while (!pilha.isEmpty()) {
            Carro carro = pilha.pop();
            System.out.println("Removendo carro: " + carro);
        }
    }
}

public class exercicio2 {
    public static void main(String[] args) {
        PilhaDeCarros pilhaDeCarros = new PilhaDeCarros();
        Scanner scanner = new Scanner(System.in);

        // Insere 10 carros
        for (int i = 0; i < 10; i++) {
            System.out.println("Insira os detalhes do carro " + (i + 1) + ":");
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Ano: ");
            int ano = scanner.nextInt();
            scanner.nextLine(); // quebra de linha
            System.out.print("Placa: ");
            String placa = scanner.nextLine();
            System.out.print("Cor: ");
            String cor = scanner.nextLine();
            
            Carro carro = new Carro(modelo, ano, placa, cor);
            pilhaDeCarros.inserirCarro(carro);
        }

        // remove e imprime
        pilhaDeCarros.removerCarros();
        
        scanner.close();
    }
}
