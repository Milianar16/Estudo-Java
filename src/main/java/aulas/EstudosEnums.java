package aulas;// Enums são estruturas com constantes definidas
// Dias da semana , meses do ano, Turnos do dia, Estações
// Niveis (junior,pleno, senior) , Feriados nacionais

public class EstudosEnums {
    public static void main(String[]args){
        enum DiaDaSemana{
            SEGUNDA,
            TERCA,
            QUARTA,
            QUINTA,
            SEXTA,
            SABADO,
            DOMINGO
        }
        DiaDaSemana hoje = DiaDaSemana.QUINTA;
        System.out.println(hoje);

        enum NivelDev{ JUNIOR, PLENO, SENIOR}
        NivelDev nivel =NivelDev.PLENO;

        switch (nivel){
            case JUNIOR:
                System.out.println("Seu nível é JUNIOR");
                break;
            case PLENO:
                System.out.println("Seu nível é PLENO");
                break;
            case SENIOR:
                System.out.println("Seu nível é SENIOR");
                break;
        }

        // VERSÃO ENHANCED // não precisa do break, pois é uma versão melhorada
        switch(nivel) {
            case JUNIOR -> {
                System.out.println("Seu nível é JUNIOR");
            }
            case PLENO -> {
                System.out.println("Seu nível é PLENO");
            }
            case SENIOR -> {
                System.out.println("Seu nível é SENIOR");
            }
            default -> {
                System.out.println("Nunca executa");
            }
        }
        }
    }



