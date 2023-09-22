package Pessoa;


public class PessoaMain {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Tais", "Rua XV");
		System.out.println(p);
		
		PessoaFisica pf = new PessoaFisica("Jane", "Pouso");
		pf.setCpf("000.000.000-00");
		pf.setEstadoCivil("Casada");
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica("Eva", "Rio");
		pj.setCnpf("000.000.000/01");
		pj.setTipoEmpresa("Tinta");
		System.out.println(pj);

	}

}