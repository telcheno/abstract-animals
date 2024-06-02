package javaAbstractAnimals;

import javaRegnoAnimaleInterface.INuotanle;
																		//Comparable usa il atributo scelto per l'ordinamento 				
public class Cane extends Animale implements INuotanle, Comparable<Cane>{
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

	@Override
	public void nuota() {
		System.out.println("Sto nuotando \n");
		
	}

	@Override
	public void vola() {
		System.out.println("No, sono un animale terrestre! \n");
	}

	@Override
	//nel'implementazione del interface si usa il tipo del oggeto come parametro
	public int compareTo(Cane o) {
		//nel compareTo si mete il atributo interesato per il ordinamento del ogieto
		return this.nome.compareTo(o.nome );
	}


	
}
