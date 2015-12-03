package exercicio1;

import exercicio2.No2;

/*
 * Classe responsável por Gerenciar a arvore
 * 
 */

public class ArvoreUtil {
	/*
	 * Valor que guarda o limite da soma 
	 */		
	private int valorLimite;
	private String caminho = "";

	
	/*
	 * Construtor 
	 * 
	 */		
	public ArvoreUtil(int valorLimite){
		this.valorLimite = valorLimite;
	}
	
	public ArvoreUtil(){
		super();
	}
	
	
	/*
	 * Metodo que inclui um novo valor na arvore
	 * 
	 */		
	public void incluir(int valor , No no){
		No novoNo = null;
		
		if(valor<=valorLimite){
			if(no.getExclusaoEsquerda()==null){
				novoNo = new No();
				novoNo.setValor(no.getValor());
				novoNo.setSolucao(String.valueOf(no.getSolucao()));
				no.setExclusaoEsquerda(novoNo);
			}else{
				incluir(valor, no.getExclusaoEsquerda());
			}
			if(no.getInclusaoDireita()==null){
				novoNo = new No();
				novoNo.setValor(valor+no.getValor());
				novoNo.setSolucao(no.getSolucao()+","+valor);
				no.setInclusaoDireita(novoNo);
			}else{
				incluir(valor, no.getInclusaoDireita());
			}
		}
	}
	
	
	/*
	 * Metodo que imprime todos os Nodes
	 *
	 */	
	public void imprimeNos(No no){
		if(no==null){
			return;
		}
		System.out.print(no.getValor()+",");
		imprimeNos(no.getExclusaoEsquerda());
		imprimeNos(no.getInclusaoDireita());
	}
	
	/*
	 * Metodo que imprime as folhas, que nesse caso são as possiveis solucoes.
	 * 
	 */
	public void imprimeFolhas(No no){
		
		if(no==null){
			return;
		}
		
		if(no.getExclusaoEsquerda()==null && no.getInclusaoDireita()==null){
				System.out.print(no.getValor()+",");
		}
		
		imprimeFolhas(no.getExclusaoEsquerda());
		imprimeFolhas(no.getInclusaoDireita());
		
	}

	/*
	 * Metodo que busca o resultado escolhido para o valor da SOMA.
	 *  As folhas sao as possiveis SOMAS(possiveis solucoes).
	 * 
	 */	
	public void buscarPorSolucoes(No no , int valor){
		
		if(no==null){
			return;
		}
		
		if(no.getExclusaoEsquerda()==null && no.getInclusaoDireita()==null && no.getValor()==valor){
			System.out.println("("+no.getSolucao().replace("0", "").replaceFirst("[,]", "")+")");
		}
		
		buscarPorSolucoes(no.getExclusaoEsquerda(),valor);
		buscarPorSolucoes(no.getInclusaoDireita(),valor);
		
	}
	
	/*
	 * Metodo responsavel por verificar se existem ligacoes
	 * 	
	 */	
	public void mostrarCaminho(No2 origem , No2 destino  ){
		percorrerArvore(origem, destino);
	}
	
	/*
	 * Metodo responsavel por percorrer a Arvore
	 * 	
	 */	
	private void percorrerArvore(No2 origem , No2 destino){

		if(isDestinoProcurado(origem, destino)){
				imprimirCaminho(origem);
				return;
		}
		if(existemLigacoes(origem)){
			buscarDestinoNasLigacoes(origem, destino);
		}else{
			limparCaminho();
		}
		
		
		
	}

	/*
	 * Metodo responsavel por buscar nas ligacoes o destino,
	 *  apartir de chamadas recursivas. 
	 * 	
	 */
	private void buscarDestinoNasLigacoes(No2 origem, No2 destino) {
		for (No2 no : origem.getLigacoes()) {
				this.caminho = this.caminho+" , "+origem.getValor();
				percorrerArvore(no, destino);
		}
	}
	
	/*
	 * Metodo responsavel por verificar se existem ligacoes
	 * 	
	 */
	private boolean existemLigacoes(No2 origem) {
		return origem.getLigacoes()!=null && !origem.getLigacoes().isEmpty();
	}

	/*
	 * Metodo responsavel por imprimir o caminho
	 * 	
	 */
	private void imprimirCaminho(No2 origem) {
		this.caminho = this.caminho+" , "+origem.getValor()+" ";
		System.out.print("Caminho : ");
		System.out.println("("+caminho.replaceFirst("[,]","")+")");
	}

	/*
	 * M�todo respons�vel por verificar se � o destino procurado
	 * 	
	 */	
	private boolean isDestinoProcurado(No2 origem, No2 destino) {
		return origem.getValor()==destino.getValor();
	}
	
/*
 * M�todo respons�vel por limpar os caminhos
 * 	
 */
   public void limparCaminho(){
	   this.caminho = "";
   }
	
}
