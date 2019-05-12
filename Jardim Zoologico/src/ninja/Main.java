package ninja;

public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Leão leao1= new Leão("Simba","África");
		zoo.adicionarAnimal(leao1);
		Crocodilo croc = new Crocodilo("Roger", "Tejo");
		zoo.adicionarAnimal(croc);
		Cão cao = new Cão("Bobby","Caniche");
		zoo.adicionarAnimal(cao);
		zoo.adicionarAnimal(cao);
		Ovelha ovelha = new Ovelha("Choné",54.5);
		zoo.adicionarAnimal(ovelha);
		//zoo.listarAnimais();
		System.out.println(zoo.contarDomesticos());
		System.out.println(zoo.contarCães());
		System.out.println(zoo.getRaça(0));
		System.out.println(zoo.getPesoOvelhas());
		}

}
