package ninja;

public class Crocodilo extends Selvagem {
	private String rio;

	public Crocodilo(String nome, String meio, String rio) {
		super(nome, meio);
		this.rio = rio;
	}

	public String getRio() {
		return rio;
	}

	@Override
	public String voz() {
		return "som do crocodilo";
	}

}
