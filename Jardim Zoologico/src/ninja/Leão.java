package ninja;

public class Leão extends Selvagem {

	private String continente;

	public Leão(String nome, String meio, String continente) {
		super(nome, meio);
		this.continente = continente;
	}

	public String getContinente() {
		return continente;
	}

	@Override
	public String voz() {
		return "rugido";
	}

}
