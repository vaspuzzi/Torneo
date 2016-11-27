import java.util.Comparator;

class LexicographicComparator implements Comparator<Partecipante> {
	    @Override
	    public int compare(Partecipante a, Partecipante b) {
	        return a.getSquadra().compareToIgnoreCase(b.getSquadra());
	    }
}