package modelo;

public class Divida {

	private double totalDiv;

	private String credor;

	private Cnpj cnpjCredor;

	private Pagamentos pagamentos = new Pagamentos();

	public double getTotalDiv() {
		return totalDiv;
	}

	public void setTotalDiv(double totalDiv) {
		this.totalDiv = totalDiv;
	}

	public String getCredor() {
		return credor;
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public Cnpj getCnpjCredor() {
		return cnpjCredor;
	}

	public void setCnpjCredor(Cnpj cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

	public void registra(Pagamento pagamento) {
		pagamentos.registra(pagamento);
	}

	public double getValorPago() {
		return pagamentos.getValorPago();
	}
}
