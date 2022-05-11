package exemplo;

import java.util.HashMap;

import java.util.Map;

public class ProdutoRepository {
	
	private Map<String, Produto> catalogo;
	
	
	public ProdutoRepository() {
		this.catalogo = new HashMap<String, Produto>();
		
	}
	
	public String addProduto(Produto produto) {
		this.catalogo.put(produto.getId(), produto);
		return produto.getId();
		
	}
	
	public void atualizarProduto(String ID, String nome, String fabricante) {
		Produto produto = this.recuperarProduto(ID);
		
		produto.setNome(nome);
		produto.setFabricante(fabricante);
		
	}
	
	public void removerProduto(String ID) {
		this.catalogo.remove(ID);
		
	}
	
	public Produto recuperarProduto(String ID) {
		return this.catalogo.get(ID);
		
	}
	
	public String listarProdutos() {
		String listaProdutos = new String();
	    
		for (Produto produto : this.catalogo.values()) {
	        listaProdutos += produto.toString() + "\n";
	    }
		
	    return listaProdutos;
	}
	

}
