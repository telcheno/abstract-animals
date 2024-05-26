//> **Esercizio 1 : classi astratte*

//> Dobbiamo realizzare un programma che rappresenti il regno animale.
//> Creiamo quindi una classe astratta Animale e delle classi che la estendono : 
//> Cane, 
//> Passerotto, 
//> Aquila, 
//> Delfino

//> Vogliamo che gli animali abbiano i seguenti metodi
//> - void dormi() (mostra a video “Zzz”)
//> - void verso() (mostra a video il verso fatto dall'animale specifico)
//> - void mangia() (mostra a video quello che mangia : erba, carne, ...?)

//> Quali di questi metodi devono essere implementati nella classe astratta e 
//> quali devono essere lasciati astratti e implementati dalle classi che la estendono?
//> Una volta create le classi, nel programma istanziare alcuni animali e utilizzare i metodi implementati.

//> **Esercizio 2 : interfacce**
//> Alcuni degli animali che abbiamo creato 
//> volano, 
//> altri nuotano.

//> Gli animali che volano hanno il seguente metodo :
//> - void vola() (mostra a video “Sto volando!!!”)
//> Gli animali che nuotano hanno il seguente metodo :
//> - void nuota() (mostra a video “Sto nuotando!!!”)

//> Scrivere un programma avente 2 metodi :
//> - void faiVolare(IVolante animale)
//> - void faiNuotare(INuotante animale)

//> Questi metodi prendono come parametro un animale 
//> che può o volare / nuotare e richiamano il corrispondente 
//> metodo vola() / nuota().

//> Scrivere un programma che istanzi animali che 
//> volano o nuotano e richiamare i metodi faiVolare / faiNuotare 
//> passandoglieli come parametro.

package javaAbstractAnimals;

import javaRegnoAnimaleInterface.INuotanle;
import javaRegnoAnimaleInterface.IVolare;

//classe astratta generica
public abstract class Animale implements INuotanle, IVolare{
	
//atributi della classe abstratta
	protected String nome;
	protected String mangia;
	protected String famiglia;
	
//*****metodi da implementare con le classi figlie******	
//si puo creare anche metodi non astratte 
	public   void dormi() {
		System.out.println("Stò dormendo 😴Zzzzz \n");
	}

//metodi astratti da valorizare 
	public abstract void faiVerso();
	public abstract  void mangia();
	public abstract  void famiglia();

//metodi astratti setter per valorisare gli atributi 
	public abstract void setNome(String nome);

	public abstract void setMangia(String mangia);

	public abstract void setFamiglia(String famiglia);
	
	
}
