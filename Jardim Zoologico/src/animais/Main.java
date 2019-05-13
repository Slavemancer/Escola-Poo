package animais;

public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Animal animal = new Le�o("Simba", "�frica");
		zoo.add(animal);
		animal = new Crocodilo("Roger", "Tejo");
		zoo.add(animal);
		animal = new C�o("Bobby", "Caniche");
		zoo.add(animal);
		animal = new Ovelha("Chon�", 54.5);
		zoo.add(animal);
		animal = new Le�o("Jafar", "�sia");
		zoo.add(animal);
		animal = new Crocodilo("Croqi", "Nilo");
		zoo.add(animal);
		animal = new C�o("Edgar", "Pug");
		zoo.add(animal);
		animal = new Ovelha("Dolly", 45.5);
		zoo.add(animal);
		zoo.listarAnimais();
		System.out.println(zoo.contarDomesticos());
		System.out.println(zoo.contarC�es());
		String ra�a = "";
		for (int i = 0; i < zoo.contarAnimais(); i++) {
			ra�a = zoo.getRa�a(i);
			if (ra�a != "") {
				System.out.println(ra�a);
			}
		}
		System.out.println(zoo.getPesoOvelhas());
		System.out.println(zoo.listarNomeVoz());
	}

}
