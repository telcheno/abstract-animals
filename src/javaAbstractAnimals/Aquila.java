package javaAbstractAnimals;

//estendo la classe astratta per implementare metodi e atributi
public class Aquila extends Animale {

//metodi implementati della super classe	
	@Override
	public void faiVerso() {
		System.out.println("Il mio verso è lo STRIDO ");
	}

	@Override
	public void mangia() {
		System.out.println("Sono un animale CARNIVORO 🦅");
	}

	@Override
	public void famiglia() {
		System.out.println("La mia famiglia è ACCIPITRIDAE");		
	}

	@Override
	public void setNome(String nome) {
		super.nome = nome;
		System.out.println("Ciao sono " + nome + " un'acquila 🦅");
	}

	@Override
	public void setMangia(String mangia) {
		
	}

	@Override
	public void setFamiglia(String famiglia) {
		
	}
	
//	metodo specifico della classe
	public void vista() {
		System.out.println("Ho una vista molto svilupata \n");
	}
}
