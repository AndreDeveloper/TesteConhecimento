package edu.testeconhecimento.control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import edu.testeconhecimento.entity.Customer;

public class CustomerControl {
	
	public double CalcMedia(List<Customer> lista) {
		double media = 0;
		int aux = 0;
		List<Customer> selecionados = selecionarParaMedia(lista);
		
		for (Customer c : selecionados) {
				media += c.getVlTotal();
				aux++;
		}
		media /= aux;
		
		return media;
	}
	
	public List<Customer> Ordenar(List<Customer> lista){
		Collections.sort(lista);
		return lista;
	}
	
	public List<Customer> selecionarParaMedia(List<Customer> lista){
		List<Customer> selecionados = new ArrayList<Customer>();
		for (Customer c : lista) {
			if (c.getVlTotal() > 560 && 
					c.getIdCustomer() >= 1500 && 
					c.getIdCustomer() <= 2700) {
				selecionados.add(c);
			}
		}
		return selecionados;
	}
}
