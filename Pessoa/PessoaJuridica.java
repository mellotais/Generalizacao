package Pessoa;

public class PessoaJuridica extends Pessoa {
	
	private String cnpf;
	private String tipoEmpresa;

	public PessoaJuridica(String nome, String endereco) {
		super(nome, endereco);

	}
	
	public String getCnpf() {
		return cnpf;
	}

	public void setCnpf(String cnpf) {
		this.cnpf = cnpf;
	}
	
	
	public String getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaJuridica [cnpf=");
		builder.append(cnpf);
		builder.append(", tipoEmpresa=");
		builder.append(tipoEmpresa);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}


}