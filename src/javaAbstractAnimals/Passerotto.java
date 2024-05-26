package javaAbstractAnimals;

import javaRegnoAnimaleInterface.IVolare;

//estendo la classe astratta per implementare metodi e atributi
public class Passerotto extends Animale implements IVolare{

	//metodi implementati della super classe
	@Override
	public void faiVerso() {
		System.out.println("Faccio un bell CINGUETTIO ");
	}

	@Override
	public void mangia() {
		System.out.println("Maigio semi, grani, vermi ...");
	}

	@Override
	public void famiglia() {
		System.out.println("La mia famiglia è la dei PASSERIDI");
	}

	@Override
	public void setNome(String nome) {
		super.nome = nome;
		System.out.println("Il mio nome è " + nome + " il passerotto 🐦‍⬛");
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
	public void canto() {
		System.out.println("Canto \"Passerotto non andare via\" 🐦‍⬛ \n");
	}

	@Override
	public void nuota() {
		System.out.println("No, sono un ucello selvatico! \n");
	}

	@Override
	public void vola() {
		System.out.println("Sto volando \n");
	}

}
