package animais;

public class Cão extends Domestico {
	
	@Override
	public String toString() {
		return "Cão ["+super.toString()+ " raça=" + raça + "]";
	}

	private String raça;

	public String getRaça() {
		return raça;
	}

	public Cão(String nome, String raça) {
		super(nome, "Carnivoro");
		this.raça = raça;
	}

	@Override
	public String voz() {
		// TODO Auto-generated method stub
		return "ão";
	}
	
	

}
