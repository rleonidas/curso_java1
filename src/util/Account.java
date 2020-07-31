package util;

public class Account {

	private int conta;
	private String titular;
	private double saldo;
	
	public Account(int conta, String titular) {
		this.conta = conta;
		this.titular = titular;
	}

	public int getConta() {
		return conta;
	}		
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double saldo) {
		this.saldo += saldo;
	}
	
	public void sacar(double saldo) {
		this.saldo -= saldo + 5.00;
	}
	
	public String toString() {
		return  "Conta: "
				+ conta 
				+ ", Titular: "
				+ titular
				+ ", Saldo: "
				+ String.format("%.2f%n", saldo);
	}
	
}
