import java.util.Iterator;

public class Girone {
	
	private int dimensioneGirone;
	
	private Partecipante[] partecipantiGirone = new Partecipante[dimensioneGirone];
	
	
	
	public Girone(int dim) {

		this.dimensioneGirone = dim;
		
	}
	void aggiungiPartecipante(Partecipante p){
		for(int i=0;i<dimensioneGirone;++i)
		if(partecipantiGirone[i] != null)
			partecipantiGirone[i] = p;
		
	}
	

}
