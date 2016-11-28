import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
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
		
		
		// creo mappa che raggruppa per squadra
		Map<String, Queue<Partecipante>> bySquadra
			= new LinkedHashMap<String,Queue<Partecipante>>();
		
		for(Partecipante p: tutti) {
			List<Partecipante> tmp = new LinkedList<Partecipante>();
			// nessun partecipante inserito della squadra
			if(!bySquadra.containsKey(p.getSquadra())) {
				tmp.add(p);
				bySquadra.put(p.getSquadra(), tmp);
			}
				
				
			// esiste almeno un partecipante della squadra
			else {
				bySquadra.get(p.getSquadra()).add(p);
				
				
			}
				
		}
		
		// prendo le squadre in ordine random 
		List<String> keys = new ArrayList<String>(bySquadra.keySet());
		Collections.shuffle(keys);
		for (String squadra  : keys) {
			int i=0;
		    // Access keys/values in a random order
			while(!bySquadra.isEmpty()) {
				Partecipante pp = bySquadra.get(squadra).poll();
				if(i>t.getNumGironi())
					i=i%t.getNumGironi();
				// ?? 
					
				
			}
		}
		
		
		
		
		System.out.println(bySquadra);
				

	
	}
	
}
