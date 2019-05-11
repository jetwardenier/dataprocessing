import java.util.ArrayList;
import java.util.Date;

public class Reiziger {
	private int reizigerId; 
	private String naam;
	private Date gbdatum;
	private ArrayList<OVChipkaart> Chipkaarten = new ArrayList<OVChipkaart>();
	
	public Reiziger() {}
	
	public int getReizigerID() {
		return reizigerId; 
	}
	public void setReizigerId(int reizigerId) {
		this.reizigerId = reizigerId; 
	}
	
	public String getNaam() {
		return naam;
	}
	
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	public Date getGBdatum() {
		return gbdatum;
	}
	
	public void setGBdatum(Date gbdatum) {
		this.gbdatum = gbdatum;
	}
	public void voegKaartToe (OVChipkaart kaart) {	
		if (!Chipkaarten.contains(kaart)) {
			Chipkaarten.add(kaart);
			
		}
	}
}