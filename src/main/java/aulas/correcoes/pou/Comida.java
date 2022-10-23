package aulas.correcoes.pou;
/**
 * Crie uma classe Comida:
 * Atributos: nome, peso;
 * Construtores: cria a comida com
 */

public class Comida {
    private String nome;
    private double peso;

    public Comida(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

}
