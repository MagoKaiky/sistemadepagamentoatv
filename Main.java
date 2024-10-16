package sistemadepagamento;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamentoDinheiro = new PagamentoDinheiro(75.00);
        pagamentoDinheiro.processarPagamento();

        Pagamento pagamentoCartao = new PagamentoCartaoCredito(250.00, "1432-5766-9012-3455", "Kaiky Ramon");
        pagamentoCartao.processarPagamento();
    }
}

