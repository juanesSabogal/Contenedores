package ui;
import model.Empresa;
import model.Contenedor;
import java.util.Scanner;

public class Main{

	public static void main( String[]args){


		Scanner reader = new Scanner(System.in);
		 int options;


		 do{

		 	System.out.println("==============");
		 	System.out.println("Bienvenido");
		 	System.out.println("==============");
		 	
		 	System.out.println("introduzca los valores del primer contenedor ");
		 	
		 	System.out.println("digite el ancho del contenedor1");
		 	double anchoC1=reader.nextDouble();
		 	System.out.println("digite el largo del contenedor1");
		 	double largoC1=reader.nextDouble();
		 	System.out.println("digite el alto del contenedor1");
		 	double altoC1=reader.nextDouble();

		 	System.out.println("Introduzca los valores del segundo contedor");

		 	System.out.println("Digite el ancho del contenedor2");
		 	double anchoC2= reader.nextDouble();
		 	System.out.println("Digite el largo del contenedor2");
		 	double largoC2= reader.nextDouble();
		 	System.out.println("Digite el alto del contenedor2");
		 	double altoC2= reader.nextDouble();

		 	System.out.println("Digite los valores del tercer contenedor");

		 	System.out.println("Digite el ancho del Contenedor 3");
		 	double anchoC3= reader.nextDouble();
		 	System.out.println("Digite el largo del contenedor 3");
		 	double largoC3= reader.nextDouble();
		 	System.out.println("Digite el alto del contenedor 3");
		 	double altoC3= reader.nextDouble();

			Contenedor contenedor1= new Contenedor(anchoC1, largoC1, altoC1);
			Contenedor contenedor2= new Contenedor(anchoC2, largoC2, altoC2);
			Contenedor contenedor3= new Contenedor(anchoC3, largoC3, altoC3);
			Empresa emp = new Empresa(contenedor1, contenedor2, contenedor3);


			System.out.println("[1].Calcular volumen promedio de los contenedores.\n [2].Calcular volumen total.\n[3].Salir del programa");
			options=reader.nextInt();
			switch(options){
				case 1:
				System.out.println("El volumen promedio de los contenedores es: "+emp.vPromedio());
				break;
				case 2:
				System.out.println("El volumen total de la mercancia es: "+emp.vTotal());
				break;

			}


		 }while(options!=3);







	}
	

}

	







	
