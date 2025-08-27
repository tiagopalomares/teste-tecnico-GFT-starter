package br.com.gft;

public class PagamentoCartao extends Pagamento {

    @Override
    public void ProcessarPagamento() {
        System.out.println("Processando pagamento via cartão...");
    }
}