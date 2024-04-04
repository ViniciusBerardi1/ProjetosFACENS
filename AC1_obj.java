import java.util.regex.Pattern;

//Veiculo
abstract class Veiculo {
    private String modelo;
    private String placa;
    private String montadora;

    public Veiculo(String modelo, String placa, String montadora) {
        this.modelo = modelo;
        if (validarPlaca(placa)) {
            this.placa = placa;
        } else {
            throw new IllegalArgumentException("Formato de placa inválido.");
        }
        this.montadora = montadora;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (validarPlaca(placa)) {
            this.placa = placa;
        } else {
            throw new IllegalArgumentException("Formato de placa inválido.");
        }
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    // Método para validar a placa
    private boolean validarPlaca(String placa) {
        String regex = "[A-Z]{3}-\\d{4}";
        return Pattern.matches(regex, placa);
    }

    //calcular o valor do aluguel
    public abstract double calcularAluguel();
}

// Moto subclasse
class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String modelo, String placa, String montadora, int cilindradas) {
        super(modelo, placa, montadora);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularAluguel() {
        //aluguel de uma moto
        return 100.0;
    }
}

//Carro
class Carro extends Veiculo {
    private int quantidadePortas;
    private int potencia;

    public Carro(String modelo, String placa, String montadora, int quantidadePortas, int potencia) {
        super(modelo, placa, montadora);
        this.quantidadePortas = quantidadePortas;
        this.potencia = potencia;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public double calcularAluguel() {
        //aluguel de um carro
        return 200.0;
    }
}

//Caminhao
class Caminhao extends Veiculo {
    private int quantidadeEixos;
    private int cargaMaxima;

    public Caminhao(String modelo, String placa, String montadora, int quantidadeEixos, int cargaMaxima) {
        super(modelo, placa, montadora);
        this.quantidadeEixos = quantidadeEixos;
        this.cargaMaxima = cargaMaxima;
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public double calcularAluguel() {
        //aluguel de um caminhão
        return 500.0;
    }
}

// precisa ser feito:
//Crie mais 3 atributos que julgar necessário para cada classe
//7 Crie um método chamado descricao() que retorna uma string contendo
//os valores de cada atributo, e também se a placa é válida ou não.
//8 Crie instancias dessas classes e altere seus dados e teste seus métodos.
//9 O método insert() que gera o comando insert para um banco de dados
//relacional. Por exemplo: 'insert into skates (nome, marca, cor)
//values ('Planador do Asfalto', 'Giro Radical', ‘Azul’);