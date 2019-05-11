import java.sql.Date;

public class OVChipkaart {
private int kaartNummer;
private Date geldigTot; 
private int klasse; 
private double saldo; 
private int reizigerId; 

public OVChipkaart(){};

public int getkaartNummer(){
	return kaartNummer;
}
public void setkaartNummer(int kaartNummer) {
	this.kaartNummer = kaartNummer; 
}
public Date getgeldigTot() {
	return geldigTot;
}
public void setgeldigTot(Date geldigTot) {
	this.geldigTot = geldigTot;
}
public int getklasse() {
	return klasse;
}
public void setklasse(int klasse) {
	this.klasse = klasse; 
}
public double getSaldo() {
	return this.saldo; 
}
public void setSaldo(double saldo) {
	this.saldo = saldo; 
}
public void setReizigerId(int reizigerId) {
	this.reizigerId= reizigerId;
}
public int getReizigerId() {
	return this.reizigerId;
}
}