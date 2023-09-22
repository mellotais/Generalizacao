package NaveEspacial;

public class NaveEspacialMain {

	public static void main(String[] args) {
		
		NaveEspacial ne = new NaveEspacial(2);
		System.out.println(ne);
		
		Apolo11 a = new Apolo11(3);
		a.setTipoCombustivel("Gasolina");
		System.out.println(a);
		
		MillenniumFalcon m = new MillenniumFalcon(7000);
		m.setClasseHiperpropulsor(30);
		System.out.println(m);

	}

}
