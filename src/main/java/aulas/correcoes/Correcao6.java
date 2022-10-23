package aulas.correcoes;
import java.util.Scanner;

public class Correcao6 {
    /*
     * 6) Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de
     * 	temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus
     * 	Fahrenheit e a variável C representa é a temperatura em graus Celsius.
    */

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
            double Celsius, Fahrenheit;

            System.out.print("Conversor de temperatura: Graus Celsius -> Fahrenheit\n\n");


            System.out.print("Digite a temperatura em Celsius: ");
            Celsius = entrada.nextDouble();

            Fahrenheit = ( 9 * Celsius + 160 ) / 5;

            System.out.print("\n A medida convertida é " + Fahrenheit + "ºF\n");

        }

    }

