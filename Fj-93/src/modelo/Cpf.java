package modelo;

public class Cpf implements Documento {

	private String valor;

	public Cpf(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	public boolean ehValido() {
		return true;
	}
}
