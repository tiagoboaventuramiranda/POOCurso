package teste;

import java.text.NumberFormat;
import java.util.Locale;

import modelo.Cnpj;
import modelo.Divida;
import modelo.Pagamento;
import modelo.RelatorioDeDivida;

public class TestePagamentos {

	public static void main(String[] args) {
		Divida divida = new Divida();
		Cnpj cnpjCredor = new Cnpj("00.000.001/0001-01");
		divida.setCnpjCredor(cnpjCredor);
		divida.setCredor("Uma empresa");
		divida.setTotalDiv(100);

		Pagamento pagamento = new Pagamento();
		pagamento.setCnpjPagador("00.000.002/0002-02");
		pagamento.setPagador("Outro pagador");
		pagamento.setValor(20);

		divida.registra(pagamento);

		RelatorioDeDivida relatorio = new RelatorioDeDivida(divida);
		NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

		relatorio.geraRelatorio(formatador);
	}
}
