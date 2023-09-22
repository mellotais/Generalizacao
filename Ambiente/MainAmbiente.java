package Ambiente;

public class MainAmbiente {

	public static void main(String[] args) {
		
		Ambiente a = new Ambiente(1);
		System.out.println(a);
		
		Quarto q = new Quarto(2);
		q.setCapacidade(3);
		System.out.println(q);

		Sala s = new Sala(1);
		s.setTv(true);
		System.out.println(s);
		
		
		Banheiro b = new Banheiro(2);
		b.setBanheira(true);
		
		Cozinha c = new Cozinha(1);
		c.setMicroondas(false);
		System.out.println(c);
		
	}

}
