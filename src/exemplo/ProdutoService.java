package exemplo;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
	
	LoteRepository loteRepository;
	ProdutoRepository produtoRepository;
	
	public ProdutoService() {
		this.loteRepository = new LoteRepository(); 
	}
	
	public List<Produto> listarProdsLote(String nome) {
		List<Lote> lotes = this.loteRepository.getAll();
		List<Produto> prodsLotes = getProdsFromLotes(lotes);
		List<Produto> prods = getProdsByName(nome, prodsLotes);
		return prods;
	}
	
	public List<Produto> getProdsByName(String name, List<Produto> prodsLote) {
		
		
	}

	public List<Produto> getProdsFromLotes(List<Lote> lotes){
		return null;
		
	}
	public List<Produto> getProdsByName(String nome) {
		List<Produto> produtos = this.produtoRepository.getAll();
		List<Produto> prods = getProdsByName(nome, produtos);
		return prods;
	}
	
	
}
