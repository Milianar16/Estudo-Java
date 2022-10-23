package aulas.correcoes.biblioteca;

import java.util.ArrayList;

public class Livro {
    private String nome;
    private Autor autor; // informações do autor
    private double preco;

    public Livro(String nome, Autor autor, double preco){
        this.nome=nome;
        this.autor=autor;
        this.preco=preco;
    }

    public static void main(String[]args) {
        Autor jk = new Autor("jk", "jk@gmail.com");
        Livro pedraFilosofal = new Livro("Harry Potter e a Pedra Filosofal", jk, 24.9);

        System.out.println(pedraFilosofal.autor.getNome());
        System.out.println(pedraFilosofal.autor.getEmail());

        Livro camaraSecreta = jk.escreverLivro("Harry Potter e a camara secreta", 30.0);

        Livro prisioneiroAzk = jk.escreverLivro("Harry Potter e o prisioneiro de azkaban", 40.0);

        jk.setNome("BATATA");

        System.out.println(pedraFilosofal.autor.getNome());
        System.out.println(camaraSecreta.autor.getNome());
        System.out.println(prisioneiroAzk.autor.getNome());

        ArrayList<Livro> livrosJk = new ArrayList<>();
        livrosJk.add(pedraFilosofal);
        livrosJk.add(camaraSecreta);
        livrosJk.add(prisioneiroAzk);


        System.out.println(livrosJk);
    }
    }
