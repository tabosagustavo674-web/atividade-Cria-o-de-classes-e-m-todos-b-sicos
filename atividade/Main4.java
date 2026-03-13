import java.time.LocalDate;

public class Main {

    static class Jogador {

        private String nome;
        private String posicao;
        private int anoNascimento;
        private String nacionalidade;
        private double altura;
        private double peso;

        
        public String getNome() { return nome; }
        public void setNome(String nome) { this.nome = nome; }

        public String getPosicao() { return posicao; }
        public void setPosicao(String posicao) { this.posicao = posicao; }

        public int getAnoNascimento() { return anoNascimento; }
        public void setAnoNascimento(int anoNascimento) { this.anoNascimento = anoNascimento; }

        public String getNacionalidade() { return nacionalidade; }
        public void setNacionalidade(String nacionalidade) { this.nacionalidade = nacionalidade; }

        public double getAltura() { return altura; }
        public void setAltura(double altura) { this.altura = altura; }

        public double getPeso() { return peso; }
        public void setPeso(double peso) { this.peso = peso; }

        
        public int calcularIdade() {
            int anoAtual = LocalDate.now().getYear();
            return anoAtual - anoNascimento;
        }

        
        public int tempoAposentadoria() {
            int idade = calcularIdade();
            int idadeAposenta = 0;

            if (posicao.equalsIgnoreCase("defesa")) {
                idadeAposenta = 40;
            } else if (posicao.equalsIgnoreCase("meio-campo")) {
                idadeAposenta = 38;
            } else if (posicao.equalsIgnoreCase("atacante")) {
                idadeAposenta = 35;
            }

            return idadeAposenta - idade;
        }

       
        public void imprimirDados() {
            System.out.println("Nome: " + nome);
            System.out.println("Posição: " + posicao);
            System.out.println("Ano de nascimento: " + anoNascimento);
            System.out.println("Nacionalidade: " + nacionalidade);
            System.out.println("Altura: " + altura);
            System.out.println("Peso: " + peso);
            System.out.println("Idade: " + calcularIdade() + " anos");

            int tempo = tempoAposentadoria();
            if (tempo > 0) {
                System.out.println("Faltam " + tempo + " anos para se aposentar.");
            } else {
                System.out.println("Já pode se aposentar.");
            }
        }
    }

    public static void main(String[] args) {

        Jogador jogador = new Jogador();

        jogador.setNome("Neymar");
        jogador.setPosicao("atacante");
        jogador.setAnoNascimento(1992);
        jogador.setNacionalidade("Brasileiro");
        jogador.setAltura(1.75);
        jogador.setPeso(68);

        jogador.imprimirDados();
    }
}