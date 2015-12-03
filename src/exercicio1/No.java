package exercicio1;


public class No {
	int valor;
	No inclusaoDireita;
	No exclusaoEsquerda;
	String solucao;

	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public No getInclusaoDireita() {
		return inclusaoDireita;
	}
	public void setInclusaoDireita(No inclusaoDireita) {
		this.inclusaoDireita = inclusaoDireita;
	}
	public No getExclusaoEsquerda() {
		return exclusaoEsquerda;
	}
	public void setExclusaoEsquerda(No exclusaoEsquerda) {
		this.exclusaoEsquerda = exclusaoEsquerda;
	}
	public String getSolucao() {
		return solucao;
	}
	public void setSolucao(String solucao) {
		this.solucao = solucao;
	}
}
