package animais;

abstract public class Animal {
	@Override
	public String toString() {
		return " nome=" + nome + ", voz()=" + voz();
	}

	private String nome;

	abstract public String voz();

	public String getNome() {

		return nome;
	}

	public Animal(String nome) {
		super();
		this.nome = nome;
	}

}
