package ar.edu.unlp.info.oo2.biblioteca;

public class Main {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		AdapterToSimpleJSON adapter = new AdapterToSimpleJSON();
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		biblioteca.setExporter(adapter);
		System.out.println(biblioteca.exportarSocios());

	}

}
