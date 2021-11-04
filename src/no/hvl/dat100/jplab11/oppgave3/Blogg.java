package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] blogg;
	private int nesteLedig;

	public Blogg() {

		blogg = new Innlegg[20];
		nesteLedig = 0;

	}

	public Blogg(int lengde) {

		blogg = new Innlegg[lengde];
		nesteLedig = 0;

	}

	public int getAntall() {

		return nesteLedig;

	}

	public Innlegg[] getSamling() {

		return blogg;

	}

	public int finnInnlegg(Innlegg innlegg) {
		int mid = -1;

		for (int i = 0; i < blogg.length; i++) {
			if (blogg[i].erLik(innlegg)) {
				mid = i;
			}
		}
		return mid;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean mid = false;
		
		for (int i = 0; i < blogg.length; i++) {
			if (blogg[i].erLik(innlegg)) {
				mid = true;
			}
		}
		return mid;
	}

	public boolean ledigPlass() {
		
		

	}

	public boolean leggTil(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public String toString() {
		throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}