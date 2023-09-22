import java.util.ArrayList;

public class DigitalCertificate {
	private ArrayList<Doses> dose = new ArrayList <Doses>();

	public DigitalCertificate(ArrayList<Doses> dose) {
		this.dose = dose;
	}

	public ArrayList<Doses> getDose() {
		return dose;
	}

	public void setDose(ArrayList<Doses> dose) {
		this.dose = dose;
	}

	@Override
	public String toString() {
		return String.format("DigitalCertificate dose=%s", dose);
	}
	
	
}
