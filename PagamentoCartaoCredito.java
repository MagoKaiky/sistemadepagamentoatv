package sistemadepagamento;


public class PagamentoCartaoCredito extends Pagamento {
    private String numeroCartao;
    private String nomeTitular;

    public PagamentoCartaoCredito(double valor, String numeroCartao, String nomeTitular) {
        super(valor);
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$ " + valor + " realizado com cartão de crédito.");
        System.out.println("Número do cartão: " + numeroCartao);
        System.out.println("Nome do titular: " + nomeTitular);
    }
}

