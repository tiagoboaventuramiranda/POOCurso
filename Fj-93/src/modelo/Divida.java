package modelo;

public class Divida {

	private double totalDiv;

	private String credor;

	private Documento documentoCredor;

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

	public Documento getDocumentoCredor() {
		return documentoCredor;
	}

	public void setDocumentoCredor(Documento documentoCredor) {
		this.documentoCredor = documentoCredor;
	}

	public void registra(Pagamento pagamento) {
		pagamentos.registra(pagamento);
	}

	public double getValorPago() {
		return pagamentos.getValorPago();
	}
}
