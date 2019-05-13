package animais;

import java.util.ArrayList;

public class Zoo {

	private ArrayList<Animal> animais;

	public ArrayList<Animal> getAnimais() {
		ArrayList<Animal> animais = new ArrayList<Animal>();
		for (int i = 0; i < this.animais.size(); i++) {
			animais.add(this.animais.get(i));
		}
		return animais;
	}

	public Zoo(ArrayList<Animal> animais) {
		super();
		this.animais = animais;
	}

	public Zoo() {
		super();
		this.animais = new ArrayList<Animal>();
	}

	public void add(Animal animal) {
		animais.add(animal);
	}

	public Animal getAnimal(String nome, String voz) {
		return animais.get(0);
	}

	public void listarAnimais() {
		System.out.println("Inicio da Lista\n");
		for (int i = 0; i < this.animais.size(); i++) {
			System.out.print("Nome: ".concat(this.animais.get(i).getNome()));
			System.out.print("| Voz: ".concat(this.animais.get(i).voz()));
			System.out.println();
		}
		System.out.println("\nFim da Lista\n");
	}

	public int contarAnimais() {
		return animais.size();
	}

	public int contarDomesticos() {
		int contador = 0;
		for (int i = 0; i < this.animais.size(); i++)
			contador = animais.get(i) instanceof Domestico ? contador + 1 : contador;
		return contador;
	}

	public int contarSelvagens() {
		int contador = 0;
		Selvagem selv = new Leão("haha", "haha");
		for (int i = 0; i < this.animais.size(); i++)
			contador = animais.get(i).getClass().getSuperclass() == selv.getClass().getSuperclass() ? contador + 1
					: contador;
		return contador;
	}

	public int contarSelvagens(String continente) {
		int contador = 0;
		Selvagem selv = new Leão("haha", "haha");
		for (int i = 0; i < this.animais.size(); i++)
			if (animais.get(i).getClass().getSuperclass() == selv.getClass().getSuperclass()) {
				contador = ((Leão) animais.get(i)).getContinente() == continente ? contador + 1 : contador;
			}
		return contador;
	}

	public int contarCães() {
		int contador = 0;
		for (int i = 0; i < this.animais.size(); i++)
			contador = animais.get(i) instanceof Cão ? contador + 1 : contador;
		return contador;

	}

	public String getNome(int index) {
		return animais.get(index).getNome();
	}

	public String getVoz(int index) {
		return animais.get(index).voz();
	}

	public String getRaça(int index) {
		return animais.get(index) instanceof Cão ? ((Cão) animais.get(index)).getRaça() : "";
	}

	public double getPesoOvelhas() {
		double acumulador = 0;
		Ovelha ovelha = new Ovelha("haha", 0.0);
		for (int i = 0; i < this.animais.size(); i++)
			acumulador = animais.get(i).getClass() == ovelha.getClass()
					? acumulador + ((Ovelha) animais.get(i)).getPeso()
					: acumulador;
		return acumulador;
	}

	public String listarNomeVoz() {
		String texto = "";
		for (int i = 0; i < animais.size(); i++) {
			texto = texto + "Nome: " + animais.get(i).getNome() + " Voz" + animais.get(i).voz() + "\n";
		}
		return texto;
	}
}
