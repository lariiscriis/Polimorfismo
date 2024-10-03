package br.edu.fatecpg.pagamento.view;
import br.edu.fatecpg.pagamento.model.PagamentoCartao;
import br.edu.fatecpg.pagamento.model.Pagamento;
import br.edu.fatecpg.pagamento.model.PagamentoBoleto;
public class Main {

	public static void main(String[] args) {
		Pagamento pag = new Pagamento();
		PagamentoCartao cartao = new PagamentoCartao();
		PagamentoBoleto boleto = new PagamentoBoleto();
		
		pag.processarPagamento();
		cartao.processarPagamento();
		boleto.processarPagamento();
		
		

	}

}
