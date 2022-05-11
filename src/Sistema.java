import java.util.List;

import exemplo.Lote;
import exemplo.Produto;
import exemplo.ProdutoRepository;

public class Sistema {

	public static void main(String[] args) {
		
		Produto leite = new Produto("Leite", "Parmalat");
		Lote lote = new Lote(leite, 10L);
		
		System.out.println(leite);
		System.out.println(lote);
		
		
		Produto pao = new Produto("Pão", "Padaria dois irmãos");
		Produto ovos = new Produto("Ovos", "Distribuidora dois irmãos");
		
		ProdutoRepository catalogo = new ProdutoRepository();
		
		
		catalogo.addProduto(ovos);	
		catalogo.addProduto(leite);
		
		System.out.println(catalogo.atualizarProduto(catalogo.addProduto(pao), "paozinho" , "ana paula"));
		
		System.out.println(catalogo.recuperarProduto(pao.getId()));
		System.out.println(catalogo.removerProduto(pao.getId()));
		
		List<Produto> lista = catalogo.listarProdutos();
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
		
		
		
		
	}
}
