

public class Torneo {
	
	private int numGironi;
	private Girone[] arrayGironi = new Girone[numGironi];
	private String disciplina;
	private String nomeTorneo;
	private int partecpantiPerGirone;
	
	public Torneo(int numGironi, int partecipantiPerGirone) {
		for(int i=0;i<numGironi;++i) {
			arrayGironi[i]=new Girone(partecipantiPerGirone);
			System.out.println();
		}
		
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
	

	
}
