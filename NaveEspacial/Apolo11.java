package NaveEspacial;

public class Apolo11 extends NaveEspacial {

	private String tipoCombustivel;
	
	public Apolo11(double velocidadeMaxima) {
		super(velocidadeMaxima);
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Apolo11 [tipoCombutivel=");
		builder.append(tipoCombustivel);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
