package exercicio1;
/*
 * Escreva um programa que, dado uma lista de números e uma soma alvo, retorne todas as 
 * combinações de um ou mais itens da lista que a soma seja igual a soma alvo.
 *
 *	Exemplo:
 *	
 *	Entrada: Para soma alvo 6 de lista (1, 2, 3, 4, 6) o resultado é:
 *	
 *	Saida: (1, 2, 3)
 *	
 *	(2, 4)
 *	
 *(6) 
 * 
 */

public class Exercicio1 {

	public static void main(String[] args) {
		
		int [] valoresEntrada = {1,2,3,4,6};
		int soma = 6;
		ArvoreUtil arvoreUtil = new ArvoreUtil(soma);
		No raiz = new No();
		raiz.setSolucao("0");
		
		for (int entrada : valoresEntrada) {
			arvoreUtil.incluir(entrada, raiz);
		}
		
		System.out.print("Folhas : ");
		arvoreUtil.imprimeFolhas(raiz);
		System.out.println("");
		System.out.println("");

		System.out.println("Solução : ");
		arvoreUtil.buscarPorSolucoes(raiz, soma);
	
	
	}
	
}
