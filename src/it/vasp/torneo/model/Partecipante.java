package it.vasp.torneo.model;

public class Partecipante {
	private String squadra;
	private String nome;
	private String cognome;
	private int punteggio;
	
	
	
	
	
	
	@Override
	public String toString() {
		return " NOME: " + nome + " COGNOME: " + cognome + " SQUADRA: " + squadra + "\n";
	}

	//getters e setters
	
	public String getSquadra() {
		return squadra;
	}


	public void setSquadra(String squadra) {
		this.squadra = squadra;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}



	public int getPunteggio() {
		return punteggio;
	}


	public void setPunteggio(int punteggio) {
		this.punteggio = punteggio;
	}

}
