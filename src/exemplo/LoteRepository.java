package exemplo;

import java.util.HashMap;
import java.util.Map;

public class LoteRepository {
	
	private Map<String,Lote> loteRepository = new HashMap<String, Lote>();
	
	
	public String addLote(Lote lote) {
		loteRepository.put(lote.getId(), lote);
		return lote.getId();
		
	}
	

}
