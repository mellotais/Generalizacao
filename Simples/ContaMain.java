package Simples;

public class ContaMain {

	public static void main(String[] args) {
		
		Conta c = new Conta("Bradesco", 000, 12, 1500);
		c.deposito(5);
		c.saque(2);
		System.out.println(c);
		
		ContaSimples cs = new ContaSimples("Banco do Brasil", 111, 13, 2000);
		cs.setSaldoPoupanca(999);
		cs.depositoPoupanca(20);
		cs.saquePoupanca(5);
		System.out.println(cs);

		ContaEspecial ce = new ContaEspecial("Nubank", 222, 14,5000);
		ce.setDiasSemJuros(4);
		ce.setLimite(30);
		System.out.println(ce);
	}

}
