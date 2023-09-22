import java.util.ArrayList;
import java.util.Date;

public class myTrack {

	public static void main(String[] args) {
		
		ArrayList <User> ulist = new ArrayList <User>();
		User p1 = new User("Chin", 0162350735, "0212343434", "Johor");
		PregnantWomen ppw1 = new PregnantWomen("Ming", 0111111111, "0212565656", "Kuala Lumpur", 7, new Date(122,7,3));
		
		ulist.add(p1);
		ulist.add(ppw1);
		
		for(User u: ulist) {
			System.out.println(u);		
		}
		
		
		User p2 = new User("Ahmad", 6768699, "0212565656", "Sabah");
		RiskReport rr1 = new RiskReport("Risiko Rendah / Low Risk", "Red Zone", false, "A1688");
		
		
		p2.setRiskreport(rr1);
		System.out.println(p2.getRiskreport());
		
		
		ArrayList <Doses> dlist = new ArrayList <Doses>();
		Doses d1 = new Doses(new Date(121, 9, 3), "CoronaVac Suspension for Injection", "Dewan Jubli Intan", "5019697");
		Doses d2 = new Doses(new Date(121, 12, 3), "CoronaVac Suspension for Injection", "Dewan Jubli Intan", "5020086");
		
		dlist.add(d1);
		dlist.add(d2);
		
		DigitalCertificate d = new DigitalCertificate(dlist);
		
		p2.setCert(d);
		
		System.out.println(p2.getCert());
		
		
	
		ArrayList <Place> plist = new ArrayList <Place>();
		Place pl1 = new Place("Mcdonald", new Date(121, 5, 3));
		Place pl2 = new Place("DaBoba", new Date(121, 3, 3));
		
		plist.add(pl1);
		plist.add(pl2);
		
		History p = new History(plist);
		
		p2.setHistory(p);
		
		System.out.println(p2.getHistory());
		
		
	}
}


