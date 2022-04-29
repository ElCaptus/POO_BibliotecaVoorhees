package ar.edu.unlp.info.oo2.biblioteca;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {

	Biblioteca biblioteca;
	String socios;
	JSONParser parser;
	
	@BeforeEach
	void setUp() throws Exception{
		
		biblioteca = new Biblioteca();
		AdapterToSimpleJSON adapter = new AdapterToSimpleJSON();
		biblioteca.setExporter(adapter);
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		socios = biblioteca.exportarSocios();
		parser = new JSONParser();
	}
	
	@Test
	public void exporter() throws ParseException {
		
		JSONObject obj = (JSONObject) parser.parse(socios);
		assertEquals(obj.get("nombre"),null);
		
		
	}

}
