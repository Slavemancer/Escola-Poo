package ninja;

public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Le�o leao1= new Le�o("Simba","�frica");
		zoo.adicionarAnimal(leao1);
		Crocodilo croc = new Crocodilo("Roger", "Tejo");
		zoo.adicionarAnimal(croc);
		C�o cao = new C�o("Bobby","Caniche");
		zoo.adicionarAnimal(cao);
		zoo.adicionarAnimal(cao);
		Ovelha ovelha = new Ovelha("Chon�",54.5);
		zoo.adicionarAnimal(ovelha);
		//zoo.listarAnimais();
		System.out.println(zoo.contarDomesticos());
		System.out.println(zoo.contarC�es());
		System.out.println(zoo.getRa�a(0));
		System.out.println(zoo.getPesoOvelhas());
		}

}
