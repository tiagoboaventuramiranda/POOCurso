package modelo;

public class BalancoEmpresa {

	private ArmazenadorDeDividas dividas;

	public BalancoEmpresa(ArmazenadorDeDividas dividas) {
		this.dividas = dividas;
	}

	public ArmazenadorDeDividas getDividas() {
		return dividas;
	}

	public void setDividas(ArmazenadorDeDividas dividas) {
		this.dividas = dividas;
	}

	public void registrarDivida(Divida divida) {
		dividas.salva(divida);
	}

	public void pagaDivida(Documento documentoCredor, Pagamento pagamento) {
		Divida divida = dividas.carrega(documentoCredor);
		if (divida != null) {
			divida.registra(pagamento);
		}
		dividas.salva(divida);
	}
}
