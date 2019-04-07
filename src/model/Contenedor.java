package model;

public class Contenedor{
	private double ancho;
	private double largo;
	private double alto;
	public Contenedor (double ancho, double largo, double alto){
		this.ancho=ancho;
		this.largo=largo;
		this.alto=alto;
	}
	public double getAncho(){
		return  ancho;
	}
	public double getLargo(){
		return  largo;
	}
	public double getAlto(){
		return  alto;
	}


	public double getVolumen(){
		double volumen=0.0;

		volumen= alto*largo*ancho;
		return volumen;
	}
	
}