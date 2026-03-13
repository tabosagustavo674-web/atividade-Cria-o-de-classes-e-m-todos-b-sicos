public class Main {

    static class Carro {
        String nome;
        double peso;
        String fabricante;
        String cor;
        double valor;

       
        void darDesconto(double desconto) {
            valor = valor - desconto;
        }

 
        void pintar(String novaCor) {
            cor = novaCor;
        }
    }

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.nome = "Civic";
        carro1.peso = 1300;
        carro1.fabricante = "Honda";
        carro1.cor = "Preto";
        carro1.valor = 120000;

        System.out.println("ANTES DOS MÉTODOS:");
        System.out.println("Cor: " + carro1.cor);
        System.out.println("Valor: " + carro1.valor);

        carro1.darDesconto(10000);
        carro1.pintar("Vermelho");

        System.out.println("\nDEPOIS DOS MÉTODOS:");
        System.out.println("Cor: " + carro1.cor);
        System.out.println("Valor: " + carro1.valor);
    }
}