package ninja;

public class Ovelha extends Domestico {

	private double peso;
	
	public double getPeso() {
		return peso;
	}

	public Ovelha(String nome, double peso) {
		super(nome, "Herbivoro");
		this.peso = peso;
	}

	@Override
	public String voz() {
		// TODO Auto-generated method stub
		return "mיייייייי";
	}

}
