package animais;

public class Le�o extends Selvagem {

	private String continente;

	public Le�o(String nome, String continente) {
		super(nome, "Terrestre");
		this.continente = continente;
	}

	public String getContinente() {
		return continente;
	}

	@Override
	public String toString() {
		return "Le�o [" + super.toString() + " continente=" + continente + "]";
	}

	@Override
	public String voz() {
		return "rugido";
	}

}
