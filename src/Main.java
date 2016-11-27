import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//TODO: INTERFACCIA GRAFICA
		
		AbsFactoryPartecipanti afp = new ConcreteFactoryPartecipanti();
		
		Scanner in = new Scanner(System.in);
		
		int numGironi, numPartecipanti;
		System.out.print("Inserisci il numero di partecipanti: ");
		numPartecipanti = in.nextInt();
		
		System.out.print("Inserisci il numero di gironi: ");
		numGironi = in.nextInt();
		
		Torneo t = new Torneo(numGironi, numPartecipanti/numGironi);
		
//		for(int i=0;i<numGironi;++i)
//			for(int j=0;j<)

	}
	
}
