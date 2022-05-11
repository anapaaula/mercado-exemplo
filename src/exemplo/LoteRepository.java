package exemplo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class LoteRepository {
	
	private Map<String,Lote> lotes;
	
	public LoteRepository() {
        this.lotes = new HashMap<String, Lote>();
    }
	
	
	public String addLote(Lote lote) {
		this.lotes.put(lote.getId(), lote);
		return lote.getId();
		
	}
	
	public void atualizarLote(String ID, Long quantidade, Date dataFabricacao, Date dataValidade) {
		Lote lote = this.recuperarLote(ID);
		
		lote.setQuantidade(quantidade);
		lote.setDataFabricacao(dataFabricacao);
		lote.setDataValidade(dataValidade);
	
	}
	
	public void removerLote(String ID) {
		this.lotes.remove(ID);
		
	}
	
	public Lote recuperarLote(String ID) {
		return this.lotes.get(ID);
		
	}
	
	public String listarLotes() {
		String listaLotes = new String();
        
		for (Lote lote : this.lotes.values()) {
            listaLotes += lote.toString() + "\n";
        }
		
        return listaLotes;
    	
	}
	

}
