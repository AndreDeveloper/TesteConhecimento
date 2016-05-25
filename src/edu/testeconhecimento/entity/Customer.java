package edu.testeconhecimento.entity;

public class Customer implements Comparable<Customer>{
	private long idCustomer;
	private String cpfCnpj;
	private String name;
	private boolean isActive;
	private double vlTotal;
	
	public Customer() {
		super();
	}
	public Customer(long idCustomer, String cpfCnpj, String name, boolean isActive, double vlTotal) {
		super();
		this.idCustomer = idCustomer;
		this.cpfCnpj = cpfCnpj;
		this.name = name;
		this.isActive = isActive;
		this.vlTotal = vlTotal;
	}
	public long getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(long idCustomer) {
		this.idCustomer = idCustomer;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public double getVlTotal() {
		return vlTotal;
	}
	public void setVlTotal(double vlTotal) {
		this.vlTotal = vlTotal;
	}
	@Override
	public String toString() {
		return "Customer [idCustomer=" + idCustomer + ", cpfCnpj=" + cpfCnpj + ", name=" + name + ", isActive="
				+ isActive + ", vlTotal=" + vlTotal + "]";
	}
	@Override
	public int compareTo(Customer arg0) {
		if (this.vlTotal < arg0.vlTotal) {
            return -1;
        }
        if (this.vlTotal > arg0.vlTotal) {
            return 1;
        }
		return 0;
	}
	
	
}
