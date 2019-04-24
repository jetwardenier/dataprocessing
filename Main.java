package P1AftekenOpdracht;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat; 


public class Main {

	public static void main(String[] args) {
		try {
			
		ReizigerDAO reizigerDAO = new ReizigerDAOImpl();
		
		Reiziger r1 = new Reiziger();
		Reiziger r2 = new Reiziger();
		Reiziger r3 = new Reiziger();
		
		Date datum1 = new SimpleDateFormat("dd/mm/yyyy").parse("23/02/2000"); 
		r1.setNaam("Henkje");
		r1.setGBdatum(datum1);
		reizigerDAO.save(r1);
		
		r2.setNaam("Henkje de boom");
		reizigerDAO.save(r2);
		
		r3.setNaam("Freek vonk fan");
		reizigerDAO.save(r3);
		
	
	for (Reiziger reiziger : reizigerDAO.findAll()) {
		System.out.println(reiziger.getNaam());
	}
	
	r1.setNaam("Frank");
	reizigerDAO.update(r1);
	
	for (Reiziger reiziger : reizigerDAO.findAll()) {
		System.out.println(reiziger.getNaam());
	}
	reizigerDAO.delete(r3);
	for (Reiziger reiziger : reizigerDAO.findAll()) {
		System.out.println(reiziger.getNaam());
	}
	
		} catch 
		(ParseException e) {
	e.printStackTrace();
 
}
}
}