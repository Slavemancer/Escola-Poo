package animais;

public class C�o extends Domestico {
	
	@Override
	public String toString() {
		return "C�o ["+super.toString()+ " ra�a=" + ra�a + "]";
	}

	private String ra�a;

	public String getRa�a() {
		return ra�a;
	}

	public C�o(String nome, String ra�a) {
		super(nome, "Carnivoro");
		this.ra�a = ra�a;
	}

	@Override
	public String voz() {
		// TODO Auto-generated method stub
		return "�o";
	}
	
	

}
