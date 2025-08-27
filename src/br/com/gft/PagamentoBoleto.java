package br.com.gft;

public class PagamentoBoleto extends Pagamento {

    @Override
    public void ProcessarPagamento() {
        System.out.println("Gerando boleto bancário...");
    }
}