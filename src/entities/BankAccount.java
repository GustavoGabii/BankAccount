package entities;


public class BankAccount {

	
	private String usuario;
	private double saldo;
	
	
	public BankAccount (String usuario, double saldoInicial) {
		this.usuario = usuario;
		this.saldo = saldoInicial;
		
	}
	

	public void Depositar(double valor) {
			saldo += valor;
			System.out.println("Depósito de R$" + valor + " realizado.");
		
	}
	
	public void Retirar(double valor) {
		if(valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque de R$" + valor + " realizado.");
		} else {
			System.out.println("Saldo insuficente.");
		}
	}
	
	public double Getsaldo() {
		return saldo;
	}
	
}
