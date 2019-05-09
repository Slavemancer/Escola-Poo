package ninja;

public class Le�o extends Selvagem {

	private String continente;

	public Le�o(String nome, String meio, String continente) {
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
