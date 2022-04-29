package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class AdapterToSimpleJSON extends VoorheesExporter {	
	@SuppressWarnings("unchecked")
	@Override 
	public String exportar(List<Socio> socios) {
		JSONArray jsonList = new JSONArray() ;
		for (Socio socio : socios) {
			JSONObject data = new JSONObject();
			data.put("nombre", socio.getNombre());
			data.put("email", socio.getEmail());
			data.put("legajo", socio.getLegajo());
			jsonList.add(data);
		}		
		return jsonList.toJSONString();
	}
}
