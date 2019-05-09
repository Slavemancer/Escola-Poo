package ninja;

import java.util.ArrayList;

public class Zoo {
	
	private ArrayList<Animal> animais = new ArrayList<Animal>();
	
	public void adicionar(Animal animal) {
		animais.add(animal);
	}
}
