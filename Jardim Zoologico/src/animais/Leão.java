package animais;

public class Leão extends Selvagem {

	private String continente;

	public Leão(String nome, String continente) {
		super(nome, "Terrestre");
		this.continente = continente;
	}

	public String getContinente() {
		return continente;
	}

	@Override
	public String toString() {
		return "Leão [" + super.toString() + " continente=" + continente + "]";
	}

	@Override
	public String voz() {
		return "rugido";
	}

}
