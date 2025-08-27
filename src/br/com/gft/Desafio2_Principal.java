package br.com.gft;
import java.util.ArrayList;
import java.util.List;

public class Desafio2_Principal { // O nome da classe deve ser igual ao nome do arquivo

    public static void main(String[] args) {
        
        // Criando uma lista de objetos do tipo Pagamento
        List<Pagamento> pagamentos = new ArrayList<>();
        
        // Adicionando instâncias de classes filhas na lista
        pagamentos.add(new PagamentoCartao());
        pagamentos.add(new PagamentoBoleto());
        pagamentos.add(new PagamentoCartao());

        // Iterando sobre a lista e chamando o método
        for (Pagamento p : pagamentos) {
            p.ProcessarPagamento();
        }
    }
}