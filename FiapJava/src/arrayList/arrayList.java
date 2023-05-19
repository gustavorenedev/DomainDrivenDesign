package arrayList;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 
 * @author Fernando
 * ArrayList
 * Array dinâmico
 * Pode ser alterado em tempo de execução
 * Framework Collection
 * Java.util
 * */
public class arrayList {
	public static void main(String[] args) {
		// Criando arrayList
		// Instanciando um arraylist
		ArrayList<String> carros = new ArrayList<String>();
		
		// Adicionar elementos no ArrayList carros - método add()
		carros.add("BMW");
		carros.add("Celta");
		carros.add("Audi");
		carros.add("Uno");
		carros.add("Corsa");
		
		// imprimir todos os elementos do ArrayList (lista)
		System.out.println(carros);
		
		// Acesso à um elemento do ArrayList - método get()
		System.out.println(carros.get(4));
		
		// Alterar um elemento do ArrayList - método set()
		// 							indice valor
		System.out.println(carros.set(0, "Fusca"));
		System.out.println(carros);
		
		// Remover um elemento do ArrayList = método remove()		
		System.out.println(carros.remove(0));
		System.out.println(carros);

		// Apagar todos os elementos do ArrayList - método clear()
		// carros.clear();
		// System.out.println(carros);
		
		// Obter o tamanho do ArrayList - método size()
		System.out.println(("Tamanho: " + carros.size()));
		
		// Percorrer o ArrayList com for "tradicional"
		for (int i = 0; i < carros.size(); i += 1) {
			//				indice	carro  sai 1			i = busca o carro 0 até o 4			
			System.out.printf("%d- %s ", i + 1, carros.get(i));
		}
		
		// Percorrer o ArrayList com foreach
		// para cada carros dentro da minha lista de carros
		int i = 1;
		for (String carro : carros) {
			System.out.printf(" \n%d - %s", i, carro);
			i++;
		}
		
		// Obter o índice de um elemento específico - indexOf()
		System.out.println("Índice: " + carros.indexOf("Corsa"));
		
		// Verificar ocorrências de um determinado elemento
		System.out.println("Contém: " + carros.contains("Celta"));
		
		// Operador Ternário
		// ? = se for verdade 
		// : = senao
		// var/ teste ? verdadeiro : falso
		
		// Verificar ocorrências de um determinado elemento
		System.out.println("Contém: " + (carros.contains("Celta") ? "sim" : "não"));
		System.out.println("---------------------------------");
		
		// ArrayList - Integer(int)
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(4);
		numeros.add(-2);
		numeros.add(10);
		numeros.add(7);
		numeros.add(20);
		System.out.println(numeros);
		
		for (Integer n : numeros) {
			System.out.println("Número: \n" + n);
		}
		
		// Ordernar um ArrayList - método sort()
		System.out.println("");
		Collections.sort(numeros);
		System.out.println(numeros);
		
		Collections.sort(carros);
		System.out.println(carros);
	}
}
