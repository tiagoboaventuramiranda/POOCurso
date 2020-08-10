package modelo;

import java.util.Calendar;

public class Pagamento {

	private double valor;

	private String pagador;
	private Documento documentoPagador;

	private Calendar data;

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getPagador() {
		return pagador;
	}

	public void setPagador(String pagador) {
		this.pagador = pagador;
	}

	public Documento getDocumentoPagador() {
		return documentoPagador;
	}

	public void setDocumentoPagador(Documento documentoPagador) {
		this.documentoPagador = documentoPagador;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
