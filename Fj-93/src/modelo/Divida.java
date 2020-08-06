package modelo;

import java.util.ArrayList;

public class Divida {

	private double totalDiv;
	private double valorPago;

	private String credor;
	private String cnpjCredor;

	private ArrayList<Pagamento> pagamentos = new ArrayList<>();

	public double getTotalDiv() {
		return totalDiv;
	}

	public void setTotalDiv(double totalDiv) {
		this.totalDiv = totalDiv;
	}

	public double getValorPago() {
		return valorPago;
	}

	public String getCredor() {
		return credor;
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public String getCnpjCredor() {
		return cnpjCredor;
	}

	public void setCnpjCredor(String cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

	public ArrayList<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public void registra(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
		this.paga(pagamento.getValor());
	}

	private void paga(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor inválido para Pagamento");
		}
		if (valor > 100) {
			valor -= 8;
		}
		this.valorPago += valor;
	}
}
