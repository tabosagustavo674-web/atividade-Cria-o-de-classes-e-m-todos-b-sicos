public class Main {

    static class Elevador {

        private int andarAtual;
        private int totalAndares;
        private int capacidade;
        private int pessoas;

       
        public void inicializa(int capacidade, int totalAndares) {
            this.capacidade = capacidade;
            this.totalAndares = totalAndares;
            this.andarAtual = 0;
            this.pessoas = 0;
        }

        
        public void entra() {
            if (pessoas < capacidade) {
                pessoas++;
                System.out.println("Uma pessoa entrou.");
            } else {
                System.out.println("Elevador cheio.");
            }
        }

        
        public void sai() {
            if (pessoas > 0) {
                pessoas--;
                System.out.println("Uma pessoa saiu.");
            } else {
                System.out.println("Elevador vazio.");
            }
        }

       
        public void sobe() {
            if (andarAtual < totalAndares) {
                andarAtual++;
                System.out.println("Subiu para o andar " + andarAtual);
            } else {
                System.out.println("Já está no último andar.");
            }
        }

        
        public void desce() {
            if (andarAtual > 0) {
                andarAtual--;
                System.out.println("Desceu para o andar " + andarAtual);
            } else {
                System.out.println("Já está no térreo.");
            }
        }

       
        public int getAndarAtual() {
            return andarAtual;
        }

        public void setAndarAtual(int andarAtual) {
            this.andarAtual = andarAtual;
        }

        public int getTotalAndares() {
            return totalAndares;
        }

        public void setTotalAndares(int totalAndares) {
            this.totalAndares = totalAndares;
        }

        public int getCapacidade() {
            return capacidade;
        }

        public void setCapacidade(int capacidade) {
            this.capacidade = capacidade;
        }

        public int getPessoas() {
            return pessoas;
        }

        public void setPessoas(int pessoas) {
            this.pessoas = pessoas;
        }
    }

    public static void main(String[] args) {

        Elevador elevador = new Elevador();

        elevador.inicializa(5, 10);

        elevador.entra();
        elevador.entra();

        elevador.sobe();
        elevador.sobe();

        elevador.sai();

        elevador.desce();

        System.out.println("Andar atual: " + elevador.getAndarAtual());
        System.out.println("Pessoas no elevador: " + elevador.getPessoas());
    }
}