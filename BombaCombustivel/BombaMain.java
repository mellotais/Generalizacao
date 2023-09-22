package BombaCombustivel;

public class BombaMain {

	public static void main(String[] args) {
		
		Bomba b = new Bomba(23, 4);
		b.abastecerPorLitro(3);
		b.abastecerPorValor(10);
		System.out.println(b);
		
		BombaGasolina bg = new BombaGasolina(5, 3);
		bg.abastecerPorLitro(4);
		bg.abastecerPorValor(30);
		System.out.println(bg);
		
		
		BombaEtanol be = new BombaEtanol(13, 3);
		be.abastecerPorLitro(5);
		be.abastecerPorValor(14);
		System.out.println(be);
		
		
		BombaDiesel bd = new BombaDiesel(25, 5);
		bd.abastecerPorLitro(2);
		bd.abastecerPorValor(18);
		System.out.println(bd);
		

	}

}
