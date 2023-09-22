package PecaXadrez;

public class PecaMain {

	public static void main(String[] args) {
		
		Peca p = new Peca(3,5,true,1);
		System.out.println(p);
		
		Peao pe = new Peao(4,6,true,2);
		pe.mover(1,2);
		System.out.println(pe);
		
		Torre t = new Torre(5,7,true,1);
		t.mover(2,4);
		System.out.println(t);
		
		Rei r = new Rei(5,7,true,1);
		r.mover(2,4);
		System.out.println(r);
		
		Rainha ra = new Rainha(5,7,true,1);
		ra.mover(2,4);
		System.out.println(ra);
		
		Cavalo c  = new Cavalo(5,7,true,1);
		c.mover(2,4);
		System.out.println(c);
		
		Bispo b  = new Bispo(5,7,true,1);
		b.mover(2,4);
		System.out.println(b);
		
	}
}
