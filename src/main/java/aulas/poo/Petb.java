package aulas.poo;

public class Petb {
    private String nome;
    private int idade;
    protected double peso;

    public Petb(){
        this.nome=nome;
        this.idade=idade;
        this.peso= peso;
    }

    public void fazerSom(){
        System.out.println("Miauuuuuuuuuu");

    }

    public void comer(String comida){
        System.out.println("Estou comendo" + comida);
    }
    public void dormir(){
        System.out.println("zzzzzzzz");
    }
    public void brincar(){
        System.out.println("Estou brincando...");
    }
    //double peso = Petb.getPeso()
    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double novoPeso){
        this.peso = novoPeso;
    }
}


