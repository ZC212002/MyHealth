import java.util.Date;
public class Place {
	private String nameofplace;
	private Date checkIn;
	
	
	public Place() {
		nameofplace = "";
		checkIn = null;
	}


	public Place(String nameofplace, Date checkIn) {
		this.nameofplace = nameofplace;
		this.checkIn = checkIn;
	}


	public String getNameofplace() {
		return nameofplace;
	}


	public void setNameofplace(String nameofplace) {
		this.nameofplace = nameofplace;
	}


	public Date getCheckIn() {
		return checkIn;
	}


	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}


	@Override
	public String toString() {
		return String.format("nameofplace=%s checkIn=%s", nameofplace, checkIn);
	}
	
	
	
}
