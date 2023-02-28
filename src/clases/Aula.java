package clases;

import java.util.Arrays;

import comparador.CompararAlumnos;

public class Aula {
	
	private Alumno[] aula;
	
	public Aula() {
		aula = new Alumno[30];
		this.rellenar();
	}
	
	public void rellenar() {
		for (int i=0; i<aula.length;i++) {
			aula[i] = new Alumno(i);
		}
	}

	public void ordenarNotaBBDD1() {
		CompararAlumnos ca = new CompararAlumnos();
		ca.setComparar(CompararAlumnos.BBDD1);
		Arrays.sort(aula, ca);
	}
	public void ordenarNotaPR1() {
		CompararAlumnos ca = new CompararAlumnos();
		ca.setComparar(CompararAlumnos.PR1);
		Arrays.sort(aula, ca);
	}
	public void ordenarID() {
		CompararAlumnos ca = new CompararAlumnos();
		ca.setComparar(CompararAlumnos.ID);
		Arrays.sort(aula,ca);
	}
	
	
	@Override
	public String toString() {
		return "Aula [aula=" + Arrays.toString(aula) + "]";
	}
	
}
