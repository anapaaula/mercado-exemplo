package exemplo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ProdutoRepository {
	
	private Map<String, Produto> catalogo = new HashMap<String, Produto>();
	
	public String addProduto(Produto produto) {
		catalogo.put(produto.getId(), produto);
		return produto.getId();
		
	}
	
	public boolean atualizarProduto(String ID, String nome, String fabricante) {
		catalogo.get(ID).setNome(nome);
		catalogo.get(ID).setFabricante(fabricante);
		
		return true;
	}
	
	public boolean removerProduto(String ID) {
		catalogo.remove(ID);
		
		return true;
	}
	
	public Produto recuperarProduto(String ID) {
		return catalogo.get(ID);
		
	}
	
	public List<Produto> listarProdutos() {
		List<Produto> listaProdutos = new LinkedList<Produto>();
		
		for(Produto produto: catalogo.values()) {
			listaProdutos.add(produto);
		}
		
		return listaProdutos;
		
	}
	
	
	
	

}
