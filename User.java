
public class User {
	private String name;
	private int mySJID;
	private String ic;
	private String state;
	private RiskReport riskreport;
	private DigitalCertificate cert;
	private History history;
	
		
	public User() {
		
	}


	public User(String name, int mySJID, String ic, String state) {
		this.name = name;
		this.mySJID = mySJID;
		this.ic = ic;
		this.state = state;	
	}
	

	public User(String name, int mySJID, String ic, String state, RiskReport riskreport, DigitalCertificate cert,
			History history) {
		this.name = name;
		this.mySJID = mySJID;
		this.ic = ic;
		this.state = state;
		this.riskreport = riskreport;
		this.cert = cert;
		this.history = history;
	}
	
	

	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getMySJID() {
		return mySJID;
	}




	public void setMySJID(int mySJID) {
		this.mySJID = mySJID;
	}




	public String getIc() {
		return ic;
	}




	public void setIc(String ic) {
		this.ic = ic;
	}





	public String getState() {
		return state;
	}





	public void setState(String state) {
		this.state = state;
	}





	public RiskReport getRiskreport() {
		return riskreport;
	}





	public void setRiskreport(RiskReport riskreport) {
		this.riskreport = riskreport;
	}





	public DigitalCertificate getCert() {
		return cert;
	}





	public void setCert(DigitalCertificate cert) {
		this.cert = cert;
	}





	public History getHistory() {
		return history;
	}





	public void setHistory(History history) {
		this.history = history;
	}





	@Override
	public String toString() {
		return String.format("name=%s, mySJID=%s, ic=%s, state=%s", name, mySJID, ic, state);
	}
	
	
	
	
	
	
}
