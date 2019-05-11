

import java.util.List;

public interface ReizigerDAO {
	public List<Reiziger> findAll();
	public List<Reiziger> findAllByGBdatum (String GBdatum);
	public Reiziger save(Reiziger reiziger);
	public Reiziger update (Reiziger reiziger);
	public Reiziger delete (Reiziger reiziger);
	public void closeConnection();
	
	}


