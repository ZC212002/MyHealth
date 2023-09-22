import java.util.Date;

public class Doses {
	private Date date;
	private String manufacturer;
	private String facility;
	private String batch;
	
	
	
	public Doses() {
		date = null;
		manufacturer = "";
		facility = "";
		batch = "";
	}



	public Doses(Date date, String manufacturer, String facility, String batch) {
		this.date = date;
		this.manufacturer = manufacturer;
		this.facility = facility;
		this.batch = batch;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}




	public String getManufacturer() {
		return manufacturer;
	}




	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}



	public String getFacility() {
		return facility;
	}





	public void setFacility(String facility) {
		this.facility = facility;
	}





	public String getBatch() {
		return batch;
	}





	public void setBatch(String batch) {
		this.batch = batch;
	}





	@Override
	public String toString() {
		return String.format("\ndate=%s\n manufacturer=%s\n facility=%s\n batch=%s\n", date, manufacturer, facility,
				batch);
	}
	
	
}
