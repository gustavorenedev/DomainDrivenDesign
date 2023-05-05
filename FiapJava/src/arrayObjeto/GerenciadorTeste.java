package arrayObjeto;

public class GerenciadorTeste {
	public static void main(String[] args) {
		GerenciadorContatos gc = new GerenciadorContatos(1);
		gc.adicionarContatos();
		gc.mostrarContatos();
		gc.atualizarContatos();
		gc.mostrarContatos();
		gc.deletarContato();
		gc.mostrarContatos();

	}
}
