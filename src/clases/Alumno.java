package clases;

public class Alumno {
	
	private String ID;
	private int BBDD1;
	private int PR1;
	
	public Alumno(int ID) {
		BBDD1= (int)(Math.random()*11);
		PR1= (int)(Math.random()*11);
		this.ID = "DAW"+ID;
	}
	
	public String getID() {
		return ID;
	}
	public int getBBDD1() {
		return BBDD1;
	}
	public int getPR1() {
		return PR1;
	}
	public void setBBDD1(int bBDD1) {
		BBDD1 = bBDD1;
	}

	public void setPR1(int pR1) {
		PR1 = pR1;
	}
	public void setID(String iD) {
		ID = iD;
	}
	@Override
	public String toString() {
		return "Alumno [codigo=" + ID +" BBDD1=" + BBDD1 + ", PR1=" + PR1 + "]";
	}
	
}
