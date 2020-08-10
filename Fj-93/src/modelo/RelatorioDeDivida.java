package modelo;

import java.text.NumberFormat;
import java.util.Locale;

public class RelatorioDeDivida {

	private final Divida divida;

	public RelatorioDeDivida(Divida divida) {
		this.divida = divida;
	}

	public void geraRelatorio(NumberFormat formatador) {
		String msg = "Cnpj credor: " + divida.getDocumentoCredor() + "\nCredor: " + divida
				.getCredor() + "\nValor da divida: " + formatador
						.format(divida.getTotalDiv()) + "\nValor Pago: " + formatador.format(divida.getValorPago());
		System.out.println(msg);
	}

	public static void main(String[] args) {
		Divida divida = new Divida();
		Cnpj cnpjCredor = new Cnpj("00.000.001/0001-01");
		divida.setDocumentoCredor(cnpjCredor);
		divida.setCredor("Uma empresa");
		divida.setTotalDiv(100);

		Pagamento pagamento = new Pagamento();
		pagamento.setDocumentoPagador(new Cnpj("00.000.002/0002-02"));
		pagamento.setPagador("Outro pagador");
		pagamento.setValor(20);

		divida.registra(pagamento);

		RelatorioDeDivida relatorio = new RelatorioDeDivida(divida);
		NumberFormat formatadorBrasileiro = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		relatorio.geraRelatorio(formatadorBrasileiro);
		System.out.println();
		NumberFormat formatadorAmericano = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
		relatorio.geraRelatorio(formatadorAmericano);
	}
}
