package modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

public class Pagamentos implements Iterable<Pagamento> {

	private double valorPago;

	private Collection<Pagamento> pagamentos = new ArrayList<>();

	public double getValorPago() {
		return valorPago;
	}

	public Collection<Pagamento> pagamentosAntesDe(Calendar data) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<>();
		for (Pagamento pagamento : this) {
			if (pagamento.getData().before(data)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public Collection<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<>();
		for (Pagamento pagamento : this) {
			if (pagamento.getValor() > valorMinimo) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public Collection<Pagamento> pagamentosDo(Documento documentoPagador) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<>();
		for (Pagamento pagamento : this) {
			if (pagamento.getDocumentoPagador().equals(documentoPagador)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
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

	public boolean foiRealizado(Pagamento pagamento) {
		return pagamentos.contains(pagamento);
	}

	@Override
	public Iterator<Pagamento> iterator() {
		return pagamentos.iterator();
	}
}
