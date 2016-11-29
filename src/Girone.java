import java.util.ArrayList;
import java.util.List;

public class Girone {
	
	private int dimensioneGirone;
	private int numeroGirone;
	
	List<Partecipante> partecipantiGirone = new ArrayList<Partecipante>();
	
	
	
	public Girone(int dim, int num) {
		this.numeroGirone = num;
		this.dimensioneGirone = dim;
		
	}
	public void aggiungiPartecipante(Partecipante p){
		if(partecipantiGirone.size() < dimensioneGirone)
			partecipantiGirone.add(p);
		
	}
	
	public boolean isFull() {
		return partecipantiGirone.size() == dimensioneGirone;
	}
	
	@Override
	public String toString() {
		String s = new String("GIRONE "+numeroGirone+"\n");
		for( Partecipante p: partecipantiGirone )
			s += p;
		return s;
	}
	

}
