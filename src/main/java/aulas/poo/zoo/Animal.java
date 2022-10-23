package aulas.poo.zoo;

import java.sql.SQLOutput;

// mudou o nome class para interface //
// Na interface você define um conjunto de métodos
// E a classe que "herda" deve implementar estes métomos
public interface Animal {
     void dormir();
     void fazerSom();
     void comer(String comida);

}

class Gato implements Animal{
     @Override
     public void dormir(){
          System.out.println("zzzzzz Miau");
     }
     @Override
     public void fazerSom(){
          System.out.println("Miau");
     }
     @Override
     public void comer(String comida){
          if(comida.equals("Peixe")){
               System.out.println("Hummmm gosto de peixe");
          }else{
               System.out.println("Só como peixe");
          }
     }
}

class Galinha implements Animal{

     @Override
     public void dormir() {
          System.out.println("Cô côrico zzzzzzzz");
     }

     @Override
     public void fazerSom() {
          System.out.println("Cô cô cô");
     }

     @Override
     public void comer(String comida) {
          System.out.println("Hummm cô cô" + comida);
     }

     public static void main(String[] args){
          Galinha galinha =new Galinha();
          Gato gato =new Gato();


     galinha.fazerSom();
     galinha.dormir();
     galinha.comer("Milho");

     gato.fazerSom();
     gato.dormir();
     gato.comer("Peixe");

     // Interface não consigo criar um objeto
          //Animal novoAnimal = new Animal(); // não consigo criar pois é Interface

          Animal animalGalinha = galinha;
          Animal animalGatinho = gato;
          System.out.println("====POLIMORFISMO=====");

          animalGatinho.fazerSom();
          animalGalinha.fazerSom();

   }
}