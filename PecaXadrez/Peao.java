package PecaXadrez;

public class Peao extends Peca {

	public Peao(int linha, int coluna, boolean cor, int movimentos) {
		super(linha, coluna, cor, movimentos);
	}
	
	
	public boolean mover(int linha, int coluna) {
		if(linha>0 && coluna>0) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Peao [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
