package Ambiente;

public class Banheiro extends Ambiente {

	private boolean banheira;
	
	public Banheiro(float area) {
		super(area);
	}

	public boolean isBanheira() {
		return banheira;
	}

	public void setBanheira(boolean banheira) {
		this.banheira = banheira;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banheiro [banheira=");
		builder.append(banheira);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
