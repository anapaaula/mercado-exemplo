import exemplo.Lote;
import exemplo.LoteRepository;
import exemplo.Produto;
import exemplo.ProdutoRepository;

public class Sistema {

	public static void main(String[] args) {
		
		Produto leite = new Produto("Leite", "Parmalat");
		Produto pao = new Produto("Pão", "Padaria dois irmãos");
		Produto ovos = new Produto("Ovos", "Distribuidora dois irmãos");
		
		ProdutoRepository catalogo = new ProdutoRepository();
		
		
		catalogo.addProduto(ovos);	
		catalogo.addProduto(leite);
		catalogo.atualizarProduto(catalogo.addProduto(pao), "paozinho" , "ana paula");
		catalogo.recuperarProduto(pao.getId());
		catalogo.removerProduto(pao.getId());
		System.out.println(catalogo.listarProdutos());
		
		Lote loteLeite = new Lote(leite, 10L);
		Lote lotePao = new Lote(pao, 89L);
		Lote loteOvo = new Lote(ovos, 30L);
		
		LoteRepository lotes = new LoteRepository();
		
		lotes.addLote(loteLeite);
		lotes.addLote(lotePao);
		lotes.recuperarLote(lotes.addLote(loteOvo));
		lotes.removerLote(loteLeite.getId());
		System.out.println(lotes.listarLotes());
		
		
	}
}
