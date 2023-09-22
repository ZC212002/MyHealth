import java.util.ArrayList;

public class History {
	private ArrayList<Place> visitedPlaces = new ArrayList <Place>();

	public History(ArrayList<Place> visitedPlaces) {
		this.visitedPlaces = visitedPlaces;
	}

	public ArrayList<Place> getVisitedPlaces() {
		return visitedPlaces;
	}

	public void setVisitedPlaces(ArrayList<Place> visitedPlaces) {
		this.visitedPlaces = visitedPlaces;
	}

	@Override
	public String toString() {
		return String.format("History visitedPlaces=%s", visitedPlaces);
	}
	
	
}
