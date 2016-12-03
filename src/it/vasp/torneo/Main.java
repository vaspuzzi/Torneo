package it.vasp.torneo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import it.vasp.torneo.model.AbsFactoryPartecipanti;
import it.vasp.torneo.model.ConcreteFactoryPartecipanti;
import it.vasp.torneo.model.Partecipante;

public class Main {

	public static void main(String[] args) {
		//TODO: INTERFACCIA GRAFICA
		
		AbsFactoryPartecipanti afp = new ConcreteFactoryPartecipanti();
		
		Scanner in = new Scanner(System.in);
		
		
		// l'utente inserisce numero partecipanti e numero gironi
		int numGironi, numPartecipanti;
//		System.out.print("Inserisci il numero di partecipanti: ");
//		numPartecipanti = in.nextInt();
		
//		in.nextLine();
		
//		System.out.print("Inserisci il numero di gironi: ");
//		numGironi = in.nextInt();
		
//		in.nextLine();
		
		System.out.print("Inserisci nome torneo: ");
		String nomeTorneo = in.nextLine();
		
		System.out.print("Inserisci disciplina: ");
		String nomeDisciplina = in.nextLine();
		
		in.close();
		
//		Torneo t = new Torneo(numGironi, numPartecipanti/numGironi, nomeTorneo,nomeDisciplina);
		
		
		
		
		List<Partecipante> tutti = new ArrayList<Partecipante> ();
		
		// inserimento partecipanti nella lista che li contiene tutti
		
		while(tutti.size() < numPartecipanti)
			tutti.add(afp.creaPartecipanteRandom());
		
		System.out.println(tutti.toString());
		
		
		// ordino in base al nome della squadra ??????? prob inutile
		//Collections.sort(tutti, new LexicographicComparator());
		
		
		// creo mappa che raggruppa per squadra
		Map<String, List<Partecipante>> bySquadra
			= new LinkedHashMap<String,List<Partecipante>>();
		
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
		
		// randomizzo i partecipanti di ogni squadra
		for(String squadra : keys)
			Collections.shuffle(bySquadra.get(squadra));
		
		// inserisco partecipanti nel girone
		for (String squadra  : keys) {
			int i=0;
			for(Partecipante p : bySquadra.get(squadra)) {
				//aggiungo partecipante nel girone i,
				i%=t.getNumGironi();
				while(t.getArrayGironi().get(i).isFull())
					i++;
				t.getArrayGironi().get(i%t.getNumGironi()).aggiungiPartecipante(p);
				i++;
			}
		}				

		System.out.println(t);
		
		
	}
	
}
