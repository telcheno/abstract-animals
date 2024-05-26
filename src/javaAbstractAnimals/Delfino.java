package javaAbstractAnimals;

//estendo la classe astratta per implementare metodi e atributi
public class Delfino extends Animale{

	//metodi implementati della super classe	
	@Override
	public void faiVerso() {
		System.out.println("Il mio verso si chiama SCOPPIETTO");
	}

	@Override
	public void mangia() {
		System.out.println("Mangio pesci come acciughe, sardine, aringhe e altre specie di dimensioni simili");
	}

	@Override
	public void famiglia() {
		System.out.println("Sono della famiglia dei DELPHINIDAE 🐬");
	}

	@Override
	public void setNome(String nome) {
		super.nome = nome;
		System.out.println("Sono " + nome + " il delfino 🐬");
	}

	@Override
	public void setMangia(String mangia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFamiglia(String famiglia) {
		// TODO Auto-generated method stub
		
	}
	
	//	metodo specifico della classe
	public void film() {
		System.out.println("Il delfino più famoso era Flipper");
	}

	@Override
	public void nuota() {
		System.out.println("Sto nuotando \n");
	}

	@Override
	public void vola() {
		// TODO Auto-generated method stub
		
	}
}
