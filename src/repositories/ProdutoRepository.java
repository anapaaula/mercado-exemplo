package repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Produto;

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
	
	public List<Produto> getAll() {
		List<Produto> listProds = new ArrayList<Produto>();
	    
		for (Produto produto : this.catalogo.values()) {
	        listProds.add(produto);
	    }
		
	    return listProds;
	}
	    
	
	public List<Produto> getProdsfromName(String nome) {
		List<Produto> produtos = new ArrayList<Produto>();
	    
		for (Produto produto : this.catalogo.values()) {
			if(produto.getNome().toLowerCase().contains(nome.toLowerCase()))
	        produtos.add(produto);
	    }
		
	    return produtos;
	}
	

}
