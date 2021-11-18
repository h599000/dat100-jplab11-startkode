package no.hvl.dat100.jplab11.oppgave4;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		File file = new File(mappe + filnavn);
		PrintWriter innhold;
		try {
			file.createNewFile();
			innhold = new PrintWriter(file);
			innhold.write(samling.toString());
			innhold.close();
			return true;
		} catch (IOException E) {
			return false;
		}
	}
}
