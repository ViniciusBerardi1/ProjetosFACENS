public class teste {
    // Classe para teste
public class locadora {
    public static void main(String[] args) {
        // Exemplo
        Moto moto = new Moto("CG 125", "ABC-1234", "Honda", 125);
        Carro carro = new Carro("Civic", "XYZ-5678", "Honda", 4, 150);
        Caminhao caminhao = new Caminhao("Volvo FH", "DEF-9012", "Volvo", 6, 20000);

        // Exibindo informações e calculando o valor do aluguel
        System.out.println("Informações da moto:");
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Placa: " + moto.getPlaca());
        System.out.println("Montadora: " + moto.getMontadora());
        System.out.println("Cilindradas: " + moto.getCilindradas());
        System.out.println("Valor do aluguel: R$" + moto.calcularAluguel());

        System.out.println("\nInformações do carro:");
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Montadora: " + carro.getMontadora());
        System.out.println("Quantidade de portas: " + carro.getQuantidadePortas());
        System.out.println("Potência: " + carro.getPotencia());
        System.out.println("Valor do aluguel: R$" + carro.calcularAluguel());

        System.out.println("\nInformações do caminhão:");
        System.out.println("Modelo: " + caminhao.getModelo());
        System.out.println("Placa: " + caminhao.getPlaca());
        System.out.println("Montadora: " + caminhao.getMontadora());
        System.out.println("Quantidade de eixos: " + caminhao.getQuantidadeEixos());
        System.out.println("Carga máxima: " + caminhao.getCargaMaxima() + " Kg");
        System.out.println("Valor do aluguel: R$" + caminhao.calcularAluguel());
    }
}
}
