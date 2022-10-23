package exercicio;
/*2)  Crie uma classe Sistema:     * Atributos: notificador
*  * Construtores: Cria objetos com base no notificador (da Interface);
*  * Métodos:  - alertaSistema() => este método invoca o notificador e envia mensagem de alerta;
*  - sobrecargaSistema() => este método invoca o notificador e envia mensagem de sobrecarga;

Obs: O atributo notificador da classe Sistema deve ser do tipo Notificador.
* */

public class Sistema implements Notificador {
    private Notificador notificador;
     @Override
    public void alertaSistema(){

        System.out.println("Mensagem de Alerta!!!");
    }
    @Override
    public void alertaSobrecarga(){

        System.out.println("Mensagem Sobrecarga!!");
    }

    public Sistema() {
        this.notificador = notificador;
    }

    public Notificador getNotificador() {
        return notificador;
    }

    public static void main(String[] args) {
        Sistema objeto = new Sistema();
        objeto.alertaSistema();
        objeto.alertaSobrecarga();




    }
}

