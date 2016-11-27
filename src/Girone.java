import java.util.ArrayList;
import java.util.List;

public class Girone {
	
	private int dimensioneGirone;
	
	List<Partecipante> partecipantiGirone = new ArrayList<Partecipante>();
	
	
	
	public Girone(int dim) {

		this.dimensioneGirone = dim;
		
	}
	void aggiungiPartecipante(Partecipante p){
		if(partecipantiGirone.size() < dimensioneGirone)
			partecipantiGirone.add(p);
		
	}
	

}
