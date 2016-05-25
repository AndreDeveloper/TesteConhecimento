package edu.testeconhecimento.boundary;

import java.util.ArrayList;
import java.util.List;

import edu.testeconhecimento.control.CustomerControl;
import edu.testeconhecimento.entity.Customer;

public class Principal {

	public static void main(String[] args) {
		//criando e populando os objetos
		//exercicio 1

		Customer customer0 = new Customer(2007, "35621485268", "José Felipe Martins", true, 590.9);
		Customer customer1 = new Customer(1950, "47821485297", "Maria Alice Barros", true, 700);
		Customer customer2 = new Customer(850, "25521485858", "Carlos Eduardo", true, 750);
		Customer customer3 = new Customer(2150, "32412587548", "Gev Alisson", true, 400);
		
		//2 ­ Criar um programa que percorra uma lista de objetos do tipo 
		//criado acima e calcule a média do campo ​vl_total​ apenas para os 
		//itens que este valor seja maior que 560 e o capo id_customer​ 
		//esteja entre 1500 e 2700.
		
		List<Customer> lista = new ArrayList<Customer>();
		lista.add(customer0);
		lista.add(customer1);
		lista.add(customer2);
		lista.add(customer3);
		
		CustomerControl control = new CustomerControl();
		double media = control.CalcMedia(lista);

		//3 ­ Exibir a média final.
		System.out.println("a media é: "+ media);
		
		//4 ­ Imprima cada um dos obejtos selecionados para o cálculo da média. 
		System.out.println("objetos selecionados para media\n");
		for(Customer c : control.selecionarParaMedia(lista)){
			System.out.println(c.toString());
		}
		//5 - 5 ­ Ordene pelo campo vlTotal os objetos selecionados para o cálculo da média. 
		List<Customer> listaOrdenada = control.Ordenar(control.selecionarParaMedia(lista));
		
		System.out.println("\n\n resultado da lista ordenada");
		for(Customer c : listaOrdenada){
			System.out.println(c.toString());
		}

	}

}
