public class Main {

    static class CartaoCredito {
        double limite;
        double saldoFatura;
        String nomeCliente;

       
        void aumentaLimite(double valor) {
            limite += valor;
        }

        
        void diminuiLimite(double valor) {
            limite -= valor;
        }

       
        void realizaCompra(double valor) {
            if (saldoFatura + valor <= limite) {
                saldoFatura += valor;
                System.out.println("Compra realizada: " + valor);
            } else {
                System.out.println("Compra negada! Limite atingido.");
            }
        }

        
        void imprimeFatura() {
            System.out.println("Fatura atual: " + saldoFatura);
        }
    }

    public static void main(String[] args) {

        CartaoCredito cartao = new CartaoCredito();

        cartao.nomeCliente = "João";
        cartao.limite = 1000;
        cartao.saldoFatura = 0;

        cartao.realizaCompra(200);
        cartao.realizaCompra(500);
        cartao.realizaCompra(400); // deve ultrapassar o limite

        cartao.imprimeFatura();

        cartao.aumentaLimite(500);
        cartao.realizaCompra(400);

        cartao.imprimeFatura();
    }
}