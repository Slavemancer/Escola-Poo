package ninja;

public abstract class Selvagem extends Animal {

	public Selvagem(String nome, String meio) {
		super(nome);
		this.meio = meio;
	}

	private String meio;

	public String getMeio() {
		return meio;
	}

}
