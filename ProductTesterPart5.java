package javaInventory;

/*
4. Modifique ProductTesterPart5 de modo que se pueda crear una matriz de objetos 
de la nueva subclase a partir de la entrada de usuario. Muestre los productos de 
la subclase utilizando un bucle for.
*/


import java.util.Scanner;

public class ProductTesterPart5 {

	public static void main(String[] args)
	{
		ProductPart5[][] matriz = new ProductPart5[2][2];
		Scanner sc = new Scanner(System.in);
		int cantidad = 0;
		
		do
		{
			System.out.println("Introduce cantidad de productos (DVD) ");
			cantidad = sc.nextInt();
			
		}while(cantidad < 1 || cantidad > 4);
		
		String numeroElemento;
		String nombreProducto;
		int numeroUnidadesExistencia;
		double precioUnidad;
		String titulo;
		int duracion;
		int cont = 0;
		
        for(int i = 0; i < 2; i++)
        {
        	for(int j = 0; j < 2; j++)
        	{
        		if(cont < cantidad)
        		{
        			Scanner sc2 = new Scanner(System.in);
        			System.out.println("Ingresa numero de elemento: ");
            		numeroElemento = sc2.nextLine();
            		System.out.println("Ingresa nombre de producto: ");
            		nombreProducto = sc2.nextLine();
            		System.out.println("Ingresa cantidad del producto: ");
            		numeroUnidadesExistencia = sc2.nextInt();
            		System.out.println("Ingresa precio del producto: ");
            		precioUnidad = sc2.nextDouble();
            		
            		Scanner sc4 = new Scanner(System.in);
            		System.out.println("Ingresa el título del DVD: ");
            		System.out.println();
            		titulo = sc4.nextLine();
            		System.out.println("Ingresa duración en minutos del DVD: ");
            		duracion = sc4.nextInt();


            		DVD dvd1 = new DVD(numeroElemento, nombreProducto, numeroUnidadesExistencia, precioUnidad, titulo, duracion);
            		matriz[i][j] = dvd1;
            		cont++;
        		}
        	}
        }
        
        cont = 0;
        for(int i = 0; i < 2; i++)
        {
        	for(int j = 0; j < 2; j++)
        	{
        		if(cont < cantidad)
        		{
        			System.out.println(matriz[i][j].toString());
        			cont++;
        		}
        	}
        }
        
        if(cantidad > 0)
        {
        	Scanner sc3 = new Scanner(System.in);
        	System.out.println("Ingresa la cantidad que desea aumentar en inventario (DVD 1):");
        	int cantidadSumar = sc3.nextInt();
        	matriz[0][0].sumarNumeroUnidades(cantidadSumar);
        	System.out.println(matriz[0][0].toString());
        	
        	System.out.println("Ingresa la cantidad que desea quitar en inventario (DVD 1):");
        	int cantidadRestar = sc3.nextInt();
        	matriz[0][0].restarNumeroUnidades(cantidadRestar);
        	System.out.println(matriz[0][0].toString());
        }

	}
	
}
