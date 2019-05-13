package animais;

public abstract class Selvagem extends Animal {

	public Selvagem(String nome, String meio) {
		super(nome);
		this.meio = meio;
	}

	private String meio;

	@Override
	public String toString() {
		return super.toString()+" meio=" + meio;
	}

	public String getMeio() {
		return meio;
	}

}
