package exemploArrayList;

import java.util.Scanner;

public class GerenciadorContatoTeste {
	public static void main(String[] args) {
		
		GerenciadorContatoArrayList gc = new GerenciadorContatoArrayList();

		gc.adicionar(new Contato("Gostavo", "12312312"));
		gc.adicionar(new Contato("Muito", "43241432"));
		gc.adicionar(new Contato("Lindo", "4143141"));

		gc.mostrar();
		
		gc.remover(0);
		
		gc.mostrar();



	}
}
