package javaInventory;
import java.util.Scanner;

public class ProductTesterPart4 {

	public static void main(String[] args)
	{
		ProductPart4[][] matriz = new ProductPart4[2][2];
		Scanner sc = new Scanner(System.in);
		int cantidad = 0;
		
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

            		ProductPart4 producto1 = new ProductPart4(numeroElemento, nombreProducto, numeroUnidadesExistencia, precioUnidad);
            		matriz[i][j] = producto1;
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
        
 //Modifique ProductTesterPart4 de modo que el usuario pueda modificar los
 // elementos. Pregunte al usuario si desea sumar o restar del inventario del
 // elemento tal y como se muestra cada elemento.   
        
        if(cantidad > 0)
        {
        	
        	//SUMA
        	
        	Scanner sc3 = new Scanner(System.in);
        	System.out.println("Ingresa la cantidad que quieres aumentar en inventario (Producto 1): ");
        	int cantidadSumar = sc3.nextInt();
        	matriz[0][0].sumarNumeroUnidades(cantidadSumar);
        	System.out.println(matriz[0][0].toString());
        	
        	//RESTA
        	
        	System.out.println("Ingresa la cantidad que quieres disminuir en inventario (Producto 1): ");
        	int cantidadRestar = sc3.nextInt();
        	matriz[0][0].restarNumeroUnidades(cantidadRestar);
        	System.out.println(matriz[0][0].toString());
        }

	}
	
}
