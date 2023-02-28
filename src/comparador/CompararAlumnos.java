package comparador;

import java.util.Comparator;

import clases.Alumno;

public class CompararAlumnos implements Comparator<Alumno>{

	public static final int ID = 1;
	public static final int BBDD1 = 2;
	public static final int PR1 = 3;
	
	private int comoOrdenar;
	
	
	@Override
	public int compare(Alumno o1, Alumno o2) {
		int devolver=0;
		if (comoOrdenar == ID ) {devolver=o2.getID().compareTo(o1.getID());}
		if (comoOrdenar == BBDD1 ) {devolver=o2.getBBDD1()-o1.getBBDD1();}
		if (comoOrdenar == PR1) {devolver=o2.getPR1()-o1.getPR1();}
		return devolver;
	}
	public void setComparar(int como) {
		switch(como) {
		case (ID): comoOrdenar = ID; break;
		case (BBDD1): comoOrdenar = BBDD1; break;
		case (PR1): comoOrdenar = PR1; break;
		}
	}

}
