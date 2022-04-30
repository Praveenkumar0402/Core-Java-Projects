package com;

abstract class Instrument{

	public abstract void Play();
}
class Piano extends Instrument{

	@Override public void Play() {
		System.out.println("Piano is playing tan tan tan tan for Piano class");
		}
	}
class Flute extends Instrument{

	@Override public void Play() {
		System.out.println("Flute is playing toot toot toot toot for Flute class");
		}
	}
class Guitar extends Instrument{
	@Override public void Play() {
		System.out.println("Guitar is playing tin tin tin for Guitar class");
		}
	}
class InstrumentMain{

	public static void main(String args[]){

		Instrument A[] = new Instrument[12];
		for (int iLoop=0; iLoop<12; iLoop++)

		{
			switch (iLoop%3){
			case 0: { A[iLoop] = new Piano(); break; }

			case 1: { A[iLoop] = new Flute(); break; }

			case 2: { A[iLoop] = new Guitar(); break; }
			}
			}

for (int iLoop=0; iLoop<12; iLoop++) {

	System.out.println("------------------------------------");
	System.out.println(" object # " + (iLoop+1));

	A[iLoop].Play();

//	if (A[iLoop] instanceof Piano) { System.out.println("Piano"); }
//
//	if (A[iLoop] instanceof Flute) { System.out.println("Flute"); }
//
//	if (A[iLoop] instanceof Guitar) { System.out.println("Guitar"); }
	}
}
}