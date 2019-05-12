package ninja;

public class Cão extends Domestico {
	
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
