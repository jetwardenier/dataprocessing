import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class ReizigerOracleDaolmpl extends Driver implements ReizigerDAO {
	private List<Reiziger> reizigers = new ArrayList<Reiziger>();
	
	public List<Reiziger> findAll() {	
		return reizigers;
	}
	
	public List<Reiziger> findAllByGBdatum(String GBdatum) {
		List<Reiziger> Reizigers = new ArrayList<Reiziger>();
		
		try {
			Connection myConn = getConnection();
			Statement myStmt = myConn.createStatement();
			String strQuery = "SELECT * FROM REIZIGER WHERE gebortedatum = to_date(" + "'" + GBdatum + "'" + ", 'DD-MM-YYYY')";
			ResultSet rs = myStmt.executeQuery(strQuery);
			
			while(rs.next()) {
				Reiziger reiziger = new Reiziger();
				reiziger.setNaam(rs.getString("VOORLETTERS") + " " + rs.getString("ACHTERNAAM"));
				reiziger.setReizigerId(rs.getInt("REIZIGERID"));
				Reizigers.add(reiziger);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return Reizigers;
	}
	
	private Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	public Reiziger save(Reiziger reiziger) {
		try {
			int reizigeridint = 0;
			Connection myConn = getConnection();
			Statement myStmt = myConn.createStatement();
			ResultSet myRs = myStmt.executeQuery("SELECT * FROM reiziger ORDER BY reizigerid");
			while (myRs.next()) {
				reizigeridint = myRs.getInt("reizigerid");
			}
			reizigeridint = reizigeridint + 1;
			reiziger.setReizigerId(reizigeridint);
			String voorletter = reiziger.getNaam();
			voorletter = Character.toString(voorletter.charAt(0));
			String[] naam = reiziger.getNaam().split(" ");
			String achternaam = naam[1];
			Statement insertStmt = myConn.createStatement();
			insertStmt.executeQuery("INSERT INTO reiziger(reizigerid, voorletters, achternaam)	VALUES('"+ reizigeridint + "','" + voorletter + "','" + achternaam +  "')");
		
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		
		return reiziger;
	}
	
	public Reiziger update(Reiziger reiziger) {
		try {
			Connection myConn = getConnection();
			Statement myStmt = myConn.createStatement();
			String voorletter = reiziger.getNaam();
			voorletter = Character.toString(voorletter.charAt(0));
			String[] naam = reiziger.getNaam().split(" ");
			String achternaam = naam[1];
			
			String q = "Update REIZIGER SET voorletters = '" + voorletter + "', ACHTERNAAM = '" + achternaam + "' where REIZIGERID = " + reiziger.getReizigerID();
			ResultSet myRs = myStmt.executeQuery(q);
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		
		return reiziger;
	}
	
	public boolean delete1(Reiziger reiziger) {
		try {
			Connection myConn = getConnection();
			Statement myStmt = myConn.createStatement();
			ResultSet myRs = myStmt.executeQuery("delete from REIZIGER "
					+ "where REIZIGERID = " + reiziger.getReizigerID());
			return true;
		} catch (Exception exc) {
			exc.printStackTrace();
			return false;}
		}

	@Override
	public void closeConnection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Reiziger delete(Reiziger reiziger) {
		// TODO Auto-generated method stub
		return null;
	}
}