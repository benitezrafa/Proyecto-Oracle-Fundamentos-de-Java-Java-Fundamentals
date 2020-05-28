package javaInventory;

import java.util.Scanner;

public class ProductTesterPart2 {

	public static void main(String[] args) {
		
		
/*
PUNTO 1
		
Modifique ProductTesterPart2 
Creamos dos objetos por defecto
/*
		
	ProductPart2 producto1 = new ProductPart2();
	ProductPart2 producto2 = new ProductPart2();
		
		
/*
a) Agregue un escáner. 
Creamos cuatro objetos por parámetros.
/*
		
		Scanner sc = new Scanner(System.in);

/*
b) Pida al usuario que introduzca valores para los argumentos de los dos productos 
del paso 6a de la parte 1.
*/


		String numeroElemento;
		String nombreProducto;
		int numeroUnidadesExistencia;
		double precioUnidad;

		System.out.println("Ingresa número de elemento: ");
		numeroElemento = sc.nextLine();
		System.out.println("Ingresa título de la serie: ");
		nombreProducto = sc.nextLine();
		System.out.println("Ingresa cantidad en existencia: ");
		numeroUnidadesExistencia = sc.nextInt();
		System.out.println("Ingresa precio: ");
		precioUnidad = sc.nextDouble();

		
		
/*
Modificamos y seguimos en el punto 3
3. Muestre la información en ProductTesterPart2 para estos productos tal y
como era en la parte 1. Además, incluya el valor de inventario para cada
producto modificando el método toString() en ProductPart2.
/*

		ProductPart2 producto1 = new ProductPart2(numeroElemento, nombreProducto, numeroUnidadesExistencia, precioUnidad);
	

		System.out.println(producto1.toString());

	}

}


