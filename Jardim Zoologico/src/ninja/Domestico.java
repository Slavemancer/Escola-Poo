package ninja;

public abstract class Domestico extends Animal {

	private String tipo;

	public Domestico(String nome, String tipo) {
		super(nome);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

}
