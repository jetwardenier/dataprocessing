package P1AftekenOpdracht;

import java.sql.Date;
import java.util.Date; 

public class Reiziger {
	private String naam;
	private Date gbdatum; 


public Reiziger() {};

public String getNaam() {
return naam; }

public void setNaam(String nm) {
	naam = nm; 
}

public Date getGBdatum() {
	return gbdatum; 
}
public void setGBdatum(Date datum1) {
	gbdatum = datum1; 
	
}
}