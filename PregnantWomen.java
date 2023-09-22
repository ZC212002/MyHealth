import java.util.Date;

public class PregnantWomen extends User {
	private int monthofPregnancy;
	private Date lastCheckupDate;
	
	
	public PregnantWomen() {
		super();
	}


	public PregnantWomen(String name, int mySJID, String ic, String state, int monthofPregnancy, Date lastCheckupDate) {
		super(name, mySJID, ic, state);
		this.monthofPregnancy = monthofPregnancy;
		this.lastCheckupDate = lastCheckupDate;
		
	}
	
	public PregnantWomen(String name, int mySJID, String ic, String state, int monthofPregnancy, Date lastCheckupDate, RiskReport riskreport, DigitalCertificate cert, History history) {
		super(name, mySJID, ic, state, riskreport, cert, history);
		this.monthofPregnancy = monthofPregnancy;
		this.lastCheckupDate = lastCheckupDate;
		
	}


	public int getMonthofPregnancy() {
		return monthofPregnancy;
	}


	public void setMonthofPregnancy(int monthofPregnancy) {
		this.monthofPregnancy = monthofPregnancy;
	}


	public Date getLastCheckupDate() {
		return lastCheckupDate;
	}


	public void setLastCheckupDate(Date lastCheckupDate) {
		this.lastCheckupDate = lastCheckupDate;
	}


	@Override
	public String toString() {
		return String.format("%s Pregnantuser: monthofPregnancy=%s, lastCheckupDate=%s\n", super.toString(), monthofPregnancy,
				lastCheckupDate);
	}
	
	
	
	
}
