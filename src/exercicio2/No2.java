package exercicio2;

import java.util.List;

public class No2 {
 private int valor;
 private List<No2> ligacoes;
 
 public No2(int valor){
	this.valor = valor; 
 }

 
 public int getValor() {
	 return valor;
 }
 public void setValor(int valor) {
	 this.valor = valor;
 }
 public List<No2> getLigacoes() {
	 return ligacoes;
 }
 public void setLigacoes(List<No2> ligacoes) {
	 this.ligacoes = ligacoes;
 }
}
