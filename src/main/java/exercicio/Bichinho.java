package exercicio;

import java.util.ArrayList;

public class Bichinho<Comida> {

   private String nome;

   private int idade;

   private double peso;

   private boolean estaDormindo;

   private int horas;

   ArrayList<Comida> bucho = new ArrayList<>();

   Bichinho(String nome,int idade, double peso){

      this.nome = nome;
      this.idade = idade;
      this.peso = peso;
      this.estaDormindo = false;
      this.horas=horas;
   }

   public void comer(Comida comida){
    bucho.add(comida);
     if(!bucho.contains(comida) && estaDormindo == false){
        //this.peso += comida.peso;
     }
   }

   public double dormir(int horas){
      double bichinhoEmagrece = (horas * this.peso * 0.1);
      return bichinhoEmagrece;
   }
   //acordar
   public boolean acorda (Bichinho acorda){
         if(!this.estaDormindo){
            System.out.println("Bichinho está acordado");

         }
         return estaDormindo;
      }
}
