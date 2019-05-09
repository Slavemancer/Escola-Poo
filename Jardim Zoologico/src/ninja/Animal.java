package ninja;

abstract public class Animal {
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
