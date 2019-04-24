package P1AftekenOpdracht;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 

public class ReizigerDAOImpl extends OracleBaseDao implements ReizigerDAO{
	{ private List<Reizger> reizigers = new ArrayList<Reiziger>(); 
	public List<Reizger> findAll() {
		return reizigers; 
	}
	}
 
public List <Reiziger> findAllByGBdatum(String GBdatum){
	List<Reiziger> GbReiziger = new ArrayList<Reiziger>();
	for (Reiziger reiziger : this.reizigers) {
		if (reiziger.getGBdatum() =± null) {
			if (reiziger.getGBdatum().toString()equals(GBdatum))
				GbReiziger.add(reiziger);}
		}
	}
}

return GbReiziger; 

} public Reiziger save(Reiziger reiziger) {
	if (!this.reizigers.contains(reiziger)) {
		this.reizigers.add(reiziger);
	}
	return reiziger; 
}

public boolean delete (Reiziger reiziger) {
	if (this.reizigers.contains(reiziger)) {
		this.reizigers.remove(reiziger); 
		return true; 
	}
	return false; 
}

