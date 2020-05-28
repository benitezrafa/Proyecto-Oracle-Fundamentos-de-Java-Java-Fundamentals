package javaInventory;

public class ProductTesterPart1 {
		
/*
6. Cree una clase principal Java denominada ProductTesterPart1 que cree e
inicialice seis objetos ProductPart1.
a) Dos de los productos deben crearse mediante el constructor por defecto
b) Los otros cuatro deben crearse mediante valores para los argumentos.
*/
	
	public static void main(String[] args) {
		
/*Crear dos objetos por defecto
Cuando inicializamos el objeto,  creamos con new y llamamos al constructor y verificamos
cual es el objeto (ProductPar1) y constructor.
Guardando esa información en producto (Aunque su valores estén en cero o null).
/*
		
		ProductPart1 producto1 = new ProductPart1();
		ProductPart1 producto2 = new ProductPart1();
		
		//Creamos 4 objetos por parámetros:
		
		ProductPart1 producto3 = new ProductPart1("01", "El Mentalista", 2, 50);
		ProductPart1 producto4 = new ProductPart1("02", "House", 5, 60);
		ProductPart1 producto5 = new ProductPart1("03", "Serie V", 100, 40);
		ProductPart1 producto6 = new ProductPart1("04", "MadMen", 4, 70);
		
/*
7. Desde ProductTesterPart1, visualice el número de producto, el nombre
del producto, el número de unidades en existencias y el precio de cada
unidad
*/
		
		System.out.println(producto3.toString());
		System.out.println(producto3.toString());
		System.out.println(producto4.toString());
		System.out.println(producto5.toString());
		System.out.println(producto6.toString());



		System.out.println(producto1.toString());

	}

}
