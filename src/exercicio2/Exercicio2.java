package exercicio2;

import java.util.ArrayList;
import java.util.List;

import exercicio1.ArvoreUtil;
/*
 *Fazer um programa que encontra um caminho a partir de uma origem até o destino navegando entre os nós. 
 *Cada nó é representado por um número inteiro. Cada possibilidade de caminho é representado 
 *por um dicionário no formato (Inteiro -> Lista( Inteiros)),
 *onde a chave é o número do nó, e a lista são as ligações unidirecional daquele nó. 
 *O resultado é uma lista de inteiros representando o caminho pelos nós.
 *
 *Exemplo:
 *
 *Entrada: origem: 1, destino: 4,
 *
 *caminhos: ( 1 -> (2, 3), 2 -> (4), 3->(5) )
 *
 *Saída: (1, 2, 4) 
 */
public class Exercicio2 {
	
	public static void main(String[] args) {
		No2 no1 = new No2(1);
		No2 no2 = new No2(2);
		No2 no3 = new No2(3);
		No2 no4 = new No2(4);
		No2 no5 = new No2(5);
		
		List<No2> ligacaoComElemento5 = new ArrayList<No2>();
		List<No2> ligacaoElemento4 = new ArrayList<No2>();
		List<No2> ligacaoComElemetos2e3 = new ArrayList<No2>();
		
		ligacaoComElemento5.add(no5);
		ligacaoElemento4.add(no4);
		
		ligacaoComElemetos2e3.add(no2);
		ligacaoComElemetos2e3.add(no3);
		
		no1.setLigacoes(ligacaoComElemetos2e3);
		no2.setLigacoes(ligacaoElemento4);
		no3.setLigacoes(ligacaoComElemento5);
		
		ArvoreUtil arvoreUtil = new ArvoreUtil();
		arvoreUtil.mostrarCaminho(no1, no4);
		
		
		
		
		

		
	}
}
