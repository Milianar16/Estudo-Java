package exercicio;

/**
 * Crie uma classe Circulo que possui:
 *     * Atributos: raio, cor.
 *     * Construtores:
 *         - Cria circulos com base no parâmetro raio do construtor;
 *         - Cria círculos de raio 1;
 *     * Métodos:
 *         - calcularArea() => deve retornar double (PI * RAIO * RAIO)
 *         - calcularCircunferencia => deve retornar double (2 * PI * RAIO)
 *         - mudarRaio(double novoRaio) => deve alterar o valor do raio
 */
public class Raio {

    double raio;

    String cor;

    double pi;

    Raio (double raio){
        this.raio =raio;

    }
    Raio(double raio, String cor, double PI){
        this.raio =1;
        this.cor=cor;
        this.pi=3.14;
    }

    double calcularArea(double raio){
        double pi=3.14;
        return (pi*raio*raio);
    }

    double calcularCircunferencia(){
        double circunferencia= (2 * this.pi * this.raio);
        return circunferencia;
    }
}
