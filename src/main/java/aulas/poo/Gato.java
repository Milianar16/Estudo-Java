package aulas.poo;

public class Gato extends Petb{
    public Gato(String bolinha, int i, int i1, String peixe, String poold) {
        super();


    }

        private String comidaFavorita;
        private String raca;

        public Gato(String nome, int idade, double peso, String comidaFavorita, String raca) {
            // representa a classe Petb
            super(); // chamando o construtor da classe pai/superclasse
            this.comidaFavorita = comidaFavorita;
            this.raca = raca;
        }

        @Override // vamos sobrescrever a ação de fazer som
        public void fazerSom() {
            System.out.println("Miauuuuuuuuuuuuu");
        }

        @Override
        public void brincar() { // o gato na hora de brincar
            this.fazerSom(); // chama o fazerSom do gato, foi sobrescrito
            super.brincar(); // está chamando o brincar() de Pet
            this.dormir(); // chama o dormir do petb, pois não foi sobrescrito
        }

        @Override
        public void comer(String comida) { // customizando a forma de comer
            // verifica se é a comida favorita
            if (comida.equals(this.comidaFavorita)) {
                super.comer(comida); // chama o comer() do Petb
                this.peso += 0.2; // this.peso = this.peso + 0.2
//            this.setPeso(this.getPeso() + 0.2);
            } else {
                System.out.println("Quero " + comida + " não!");
            }
        }

        public void pularNoTelhado() { // método especifico do gato
            this.fazerSom();
            super.fazerSom(); // ...
            System.out.println("Pulando no telhado");
        }

        public static void main(String[] args) {
            // Testar a herança
            Petb pet2 = new Petb();
            pet2.dormir();
            pet2.comer( "Peixe");
            pet2.fazerSom();

            System.out.println(" ================== ");

            aulas.poo.Petb batata = new aulas.poo.Gato("Bolinha", 6, 30, "Arroz", "Poold");
            batata.dormir();
            batata.fazerSom();
            batata.comer("Sorvete");
            batata.setPeso(30);
            batata.brincar();
            batata.comer("Arroz");

        }


}



