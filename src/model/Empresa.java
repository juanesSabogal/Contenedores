package model;

public class Empresa{
	private Contenedor contenedores1;
	private Contenedor contenedores2;
	private Contenedor contenedores3;


	public Empresa( Contenedor contenedores1, Contenedor contenedores2, Contenedor contenedores3){
		this.contenedores1=contenedores1;
		this.contenedores2=contenedores2;
		this.contenedores3=contenedores3;
	}
	public Contenedor getContenedores1(){
		return contenedores1;
	}
	public Contenedor getContenedores2(){
		return contenedores2;
	}
	public Contenedor getContenedores3(){
		return contenedores3;
	}
	
	public double vPromedio(){
		double total=0.0;

		total= (contenedores1.getVolumen()+contenedores2.getVolumen()+contenedores3.getVolumen())/3;

		return total;
	}
	
	public double vTotal(){
		double total=0.0;

		total= contenedores1.getVolumen()+contenedores2.getVolumen()+contenedores3.getVolumen();

		return total;
	}



}