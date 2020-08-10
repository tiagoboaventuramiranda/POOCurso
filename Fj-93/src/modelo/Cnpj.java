package modelo;

public class Cnpj implements Documento {

	private String valor;

	public Cnpj(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	public int hashCode() {
		return this.valor.hashCode();
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Cnpj)) {
			return false;
		}
		Cnpj other = (Cnpj) obj;
		return this.valor.equals(other.valor);
	}

	public boolean ehValido() {
		return primeiroDigitoVerificador() == primeiroDigitoCorreto() && segundoDigitoVerificador() == segundoDigitoCorreto();
	}

	private int segundoDigitoCorreto() {
		// TODO Auto-generated method stub
		return 2;
	}

	private int segundoDigitoVerificador() {
		// TODO Auto-generated method stub
		return 2;
	}

	private int primeiroDigitoCorreto() {
		// TODO Auto-generated method stub
		return 1;
	}

	private int primeiroDigitoVerificador() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String toString() {
		return this.valor;
	}
}
