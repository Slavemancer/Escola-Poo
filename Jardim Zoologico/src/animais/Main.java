package animais;

public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Animal animal = new Leão("Simba", "África");
		zoo.add(animal);
		animal = new Crocodilo("Roger", "Tejo");
		zoo.add(animal);
		animal = new Cão("Bobby", "Caniche");
		zoo.add(animal);
		animal = new Ovelha("Choné", 54.5);
		zoo.add(animal);
		animal = new Leão("Jafar", "Ásia");
		zoo.add(animal);
		animal = new Crocodilo("Croqi", "Nilo");
		zoo.add(animal);
		animal = new Cão("Edgar", "Pug");
		zoo.add(animal);
		animal = new Ovelha("Dolly", 45.5);
		zoo.add(animal);
		zoo.listarAnimais();
		System.out.println(zoo.contarDomesticos());
		System.out.println(zoo.contarCães());
		String raça = "";
		for (int i = 0; i < zoo.contarAnimais(); i++) {
			raça = zoo.getRaça(i);
			if (raça != "") {
				System.out.println(raça);
			}
		}
		System.out.println(zoo.getPesoOvelhas());
		System.out.println(zoo.listarNomeVoz());
	}

}
