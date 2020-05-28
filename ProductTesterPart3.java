package javaInventory;

import java.util.Scanner;

public class ProductTesterPart3 {

public static void main(String[] args) {
	
	
	//1. Modifique ProductTesterPart3 para manejar varios productos mediante una matriz
	//de productos
	
	ProductPart3[][] matriz = new ProductPart3[2][2];
	
//2. Pida al usuario que introduzca el número de productos que desea agregar.
	//Acepte un entero positivo para representar el número de productos y maneje
	//el valor de cero.
	
	Scanner sc = new Scanner(System.in);
	int cantidad = 0;

//3. Utilice un bucle for y pida al usuario que introduzca los valores para los elementos.

	//Para que esto se repita:
	
	do
	{
		System.out.println("Introduzca cantidad de productos: ");
		cantidad = sc.nextInt();
		
	}while(cantidad < 1 || cantidad > 4);
	
	String numeroElemento;
	String nombreProducto;
	int numeroUnidadesExistencia;
	double precioUnidad;
	int cont = 0;
	
    for(int i = 0; i < 2; i++)
    {
    	for(int j = 0; j < 2; j++)
    	{
    		if(cont < cantidad)
    		{
    			Scanner sc2 = new Scanner(System.in);
    			System.out.println("Ingrese numero de elemento: ");
        		numeroElemento = sc2.nextLine();
        		System.out.println("Ingrese nombre de producto: ");
        		nombreProducto = sc2.nextLine();
        		System.out.println("Ingrese cantidad del producto: ");
        		numeroUnidadesExistencia = sc2.nextInt();
        		System.out.println("Ingrese precio del producto: ");
        		precioUnidad = sc2.nextDouble();

        		ProductPart3 producto1 = new ProductPart3(numeroElemento, nombreProducto, numeroUnidadesExistencia, precioUnidad);
        		matriz[i][j] = producto1;
        		cont++;
    		}
    	}
    }
    
//Utilice otro bucle for para mostrar la información de un producto cada vez, incluido
// el número del artículo, el nombre del producto, el número de unidades en
//  existencias, el precio de cada unidad y el valor del inventario de ese producto.
    
    
    
    	cont = 0;
    	for(int i = 0; i < 2; i++)
    	{
    	
    		for(int j = 0; j< 2; j++) 
    		{
    			if(cont < cantidad)
    			{
    				System.out.println(matriz[i][j].toString());
    				cont++;
    			}
    			
    		}
    			
    		
    	
	
	
	
	//En este punto, los alumnos deben crear nuevas clases ProductPart3 y
	//ProductTesterPart3 que se sumarán a la funcionalidad de la parte 2 del proyecto.
	//(Copie y pegue el código de la parte 2 en las nuevas clases de la parte 3)	
		
		
		//Scanner sc = new Scanner(System.in);
		//String numeroElemento;
		//String nombreProducto;
		//int numeroUnidadesExistencia;
		//double precioUnidad;

		//System.out.println("Ingresa número de elemento: ");
		//numeroElemento = sc.nextLine();
		//System.out.println("Ingresa título de la serie: ");
		//nombreProducto = sc.nextLine();
		//System.out.println("Ingresa cantidad en existencia: ");
		//numeroUnidadesExistencia = sc.nextInt();
		//System.out.println("Ingresa precio: ");
		//precioUnidad = sc.nextDouble();

		
		
		//ProductPart3 producto1 = new ProductPart3(numeroElemento, nombreProducto, numeroUnidadesExistencia, precioUnidad);
	

		//System.out.println(producto1.toString());

	}

	}
}


