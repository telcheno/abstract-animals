package javaAbstractAnimals;

public class Cane extends Animale{
//-+-+-+-metodi implementati della super classe-+-+-+-\\
	@Override
	public void setNome(String nome) {
//specifico la variabile della super classe
		super.nome = nome;
		System.out.println("Ciao sono " + nome);
	}
	
	@Override
	public void faiVerso() {
		System.out.println("Sono un cane e il mmio verso é 🐶 BAUBAU");
	}

	@Override
	public void mangia() {
		System.out.println("Sono un animale ONNIVORO");
	}

	@Override
	public void famiglia() {
		System.out.println("Sono della famiglia dei CANIDI 🐩");
	}

	@Override
	public void setMangia(String mangia) {
	}

	@Override
	public void setFamiglia(String famiglia) {		
	}

	//++++meto implementato solo della classe specifica+++\\
//Si puo implementare solo stansiando la classe specifica
	public void saluto() {
		System.out.println("Saluto scodinsolando 🐕‍🦺🐕‍🦺 \n");
	}
}
