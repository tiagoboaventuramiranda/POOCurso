package modelo;

import java.util.Calendar;

public class Pagamento {

	private double valor;

	private String pagador;
	private String cnpjPagador;

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

	public String getCnpjPagador() {
		return cnpjPagador;
	}

	public void setCnpjPagador(String cnpjPagador) {
		this.cnpjPagador = cnpjPagador;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
