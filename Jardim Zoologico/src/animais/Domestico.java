package animais;

public abstract class Domestico extends Animal {

	private String tipo;

	public Domestico(String nome, String tipo) {
		super(nome);
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + " tipo=" + tipo;
	}

	public String getTipo() {
		return tipo;
	}

}
