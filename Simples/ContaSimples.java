package Simples;

public class ContaSimples extends Conta {

	private double saldoPoupanca;
	
	public ContaSimples(String banco, int agencia, int numeroconta, double saldo) {
		super(banco, agencia, numeroconta, saldo);
	}

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}

	public boolean depositoPoupanca(double valor) {
		if (valor > 0) {
            this.saldoPoupanca += valor;
            return true;
        } else {
            return false; 
	    }
	}
	
	public boolean saquePoupanca(double valor) {
		if (valor > 0 && valor <= this.saldoPoupanca) {
            this.saldoPoupanca -= valor;
            return true; 
        } else {
            return false; 
        }
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
