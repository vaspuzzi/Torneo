import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//TODO: INTERFACCIA GRAFICA
		
		AbsFactoryPartecipanti afp = new ConcreteFactoryPartecipanti();
		
		Scanner in = new Scanner(System.in);
		
		
		// l'utente inserisce numero partecipanti e numero gironi
		int numGironi, numPartecipanti;
		System.out.print("Inserisci il numero di partecipanti: ");
		numPartecipanti = in.nextInt();
		
		System.out.print("Inserisci il numero di gironi: ");
		numGironi = in.nextInt();
		
		Torneo t = new Torneo(numGironi, numPartecipanti/numGironi);
		
		List<Partecipante> tutti = new ArrayList<Partecipante> ();
		
		// inserimento partecipanti nella lista che li contiene tutti
		
		while(tutti.size() < numPartecipanti)
			tutti.add(afp.creaPartecipanteRandom());
		
		System.out.println(tutti.toString());
		
		
		// ordino in base al nome della squadra ???????
		Collections.sort(tutti, new LexicographicComparator());
		
		

				

	
	}
	
}
