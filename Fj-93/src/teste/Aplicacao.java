package teste;

import java.util.Calendar;

import modelo.BalancoEmpresa;
import modelo.BancoDeDados;
import modelo.Cnpj;
import modelo.Cpf;
import modelo.Divida;
import modelo.Documento;
import modelo.Pagamento;

public class Aplicacao {

	public static void main(String[] args) {

		BancoDeDados bd = new BancoDeDados("localhost", "root", "1234");
		BalancoEmpresa balanco = new BalancoEmpresa(bd);

		Divida divida = new Divida();
		Documento cnpjEmpresa = new Cnpj("00.000.001/0001-01");

		divida.setDocumentoCredor(cnpjEmpresa);
		divida.setCredor("Uma empresa");
		divida.setTotalDiv(100);
		balanco.registrarDivida(divida);

		Pagamento pagamento = new Pagamento();
		pagamento.setPagador("Ranger");
		pagamento.setDocumentoPagador(new Cpf("000.000.000-01"));
		pagamento.setValor(20);
		pagamento.setData(Calendar.getInstance());

		balanco.pagaDivida(cnpjEmpresa, pagamento);

		bd.desconectar();
	}
}
