package ninja;

public class Crocodilo extends Selvagem {
	private String rio;

	public Crocodilo(String nome, String rio) {
		super(nome, "Aquático");
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
