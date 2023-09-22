package Item;

public class ItemMain {

	public static void main(String[]args) {
	
	Item i = new Item(1, "Descricao");
	System.out.println(i);
	
	Livro l = new Livro(2, "Corte de Espinhos e Rosas");
	l.setAutor("Srah J Mass");
	System.out.println(l);
	
	Midia m = new Midia(3, "Midia");
	m.setGravadora("Som Livre");
	m.setDuracao(3);
	System.out.println(m);

	CD cd= new CD(3, "CD");
	cd.setFaixas(11);
	cd.setArtista("Ivete");
	cd.setAlbum("Album");
	cd.setGravadora("Som Livre");
	cd.setDuracao(3);
	System.out.println(cd);
	
	VHS vhs= new VHS(4, "VHS");
	vhs.setTitulo("Titulo");
	vhs.setGravadora("Som Livre");
	vhs.setDuracao(3);
	System.out.println(vhs);
	
	}
}
