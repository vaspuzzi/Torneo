import java.util.ArrayList;
import java.util.List;

public class Torneo {
	
	private int numGironi;
	List<Girone> arrayGironi = new ArrayList<Girone>();
	private String disciplina;
	private String nomeTorneo;
	private int partecpantiPerGirone;
	
	public Torneo(int numGironi, int partecipantiPerGirone) {
		while(arrayGironi.size() < numGironi)
			arrayGironi.add(new Girone(partecipantiPerGirone));
	}
	
	
	
	
	//getters e setters
	public int getNumGironi() {
		return numGironi;
	}
	public void setNumGironi(int numGironi) {
		this.numGironi = numGironi;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public String getNome() {
		return nomeTorneo;
	}
	public void setNome(String nome) {
		this.nomeTorneo = nome;
	}
	public int getPartecpantiPerGirone() {
		return partecpantiPerGirone;
	}
	public void setPartecpantiPerGirone(int partecpantiPerGirone) {
		this.partecpantiPerGirone = partecpantiPerGirone;
	}
	
	public List<Girone> getArrayGironi () {
		return arrayGironi;
	}

	
}
