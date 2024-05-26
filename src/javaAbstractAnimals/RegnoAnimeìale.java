package javaAbstractAnimals;

public class RegnoAnimeìale {

	public static void main(String[] args) {

System.out.println("\"Metodi ereditati della super classe\"  \n");		

//**ISTANSIO LA CLASSE CON I METODI EREDITATI**\\
		Animale cane = new Cane();
//metodo ereditato dalla super lasse
		cane.setNome("Lolli");
//metodi implementati dalla classe istanziata
		cane.faiVerso();
		cane.famiglia();;
		cane.mangia();
//metodo implementato dalla super classe
		cane.dormi();
		
//metodo implementato dal interface
System.out.println("\"Metodo implementato dal interface\" ");
		cane.nuota();
	
		
System.out.println("\"Metodi della classe specifica\" \n");
//**ISTANSIO LA CLASSE CON I METODI SPECIFICI**\\
		Cane cane1 = new Cane();
		cane1.setNome("Jack");
		cane1.faiVerso();
		cane.famiglia();
		cane1.mangia();
		cane1.dormi();

System.out.println("\"Si puo implementare solo stansiando la classe specifica\" \n");
//metodo sepecifico della classe
		cane1.saluto();
	
System.out.println("\"Metodo inplementato dall' interface\"");
//metodo implementato dal interface		
		cane.nuota();
		
		Animale aquila = new Aquila();
		aquila.setNome("Luccio");
		aquila.faiVerso();
		aquila.famiglia();
		aquila.mangia();
		aquila.dormi();

//metodo implementato dal interface		
		aquila.vola();

//metodo sepecifico della classe
		Aquila aquila1 = new Aquila();
		aquila1.vista();

		
		Animale passerotto = new Passerotto();
		passerotto.setNome("Kiko");
		passerotto.faiVerso();
		passerotto.famiglia();
		passerotto.mangia();
		passerotto.dormi();

//metodo sepecifico della classe
		passerotto.vola();
		
//metodo sepecifico della classe		
		Passerotto passerotto1 = new Passerotto();
		passerotto1.canto();
		
		Animale delfino = new Delfino();
		delfino.setNome("Ciccio");
		delfino.faiVerso();
		delfino.famiglia();
		delfino.mangia();
		delfino.dormi();
		
//metodo sepecifico della classe
		delfino.nuota();
		
//metodo sepecifico della classe
		Delfino delfino1 = new Delfino();
		delfino1.film();
	}

}
