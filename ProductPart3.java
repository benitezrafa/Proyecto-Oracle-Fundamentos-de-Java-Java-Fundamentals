package javaInventory;

/*
En este punto, los alumnos deben crear nuevas clases ProductPart3 y
ProductTesterPart3 que se sumarán a la funcionalidad de la parte 2 del proyecto.
(Copie y pegue el código de la parte 2 en las nuevas clases de la parte 3)
*/

public class ProductPart3 {

	private String numeroElemento; 
	private String nombreProducto;
	private int numeroUnidadesExistencias;
	private double precioUnidad;
	
	public ProductPart3()
	{
	     this.numeroElemento = null;  
	     this.nombreProducto = null;
	     this.numeroUnidadesExistencias = 0;
	     this.precioUnidad = 0;
	}
	
	public ProductPart3(String _numeroElemento, String _nombreProducto, int _numeroUnidadesExistencias, double _precioUnidad)
	{
		this.numeroElemento = _numeroElemento;
		this.nombreProducto = _nombreProducto;
		this.numeroUnidadesExistencias = _numeroUnidadesExistencias;
		this.precioUnidad = _precioUnidad;
	}
	
	public String getNumeroElemento()
	{
		return this.numeroElemento;
	}
	public void setNumeroElemento(String _numeroElemento)
	{
		this.numeroElemento = _numeroElemento;
	}
	
	public String getNombreProducto()
	{
		return this.nombreProducto;
	}
	public void setNombreProducto(String _nombreProducto)
	{
		this.nombreProducto = _nombreProducto;
	}

	public int getNumeroUnidadesExistencias()
	{
		return this.numeroUnidadesExistencias;
	}
	public void setNumeroUnidadesExistencias(int _numeroUnidadesExistencias)
	{
		this.numeroUnidadesExistencias = _numeroUnidadesExistencias;
	}
	
	public double getPrecioUnidad()
	{
		return this.precioUnidad;
	}
	public void setPrecioUnidad(double _precioUnidad)
	{
		this.precioUnidad = _precioUnidad;
	}
	
	public String toString()
	{
		String mensaje = "";
		
		mensaje = mensaje + "Numero de Elemento: " + this.numeroElemento + "\n";
		mensaje = mensaje + "Nombre de Producto: " + this.nombreProducto + "\n";
		mensaje = mensaje + "Numero de unidades: " + this.numeroUnidadesExistencias + "\n";
		mensaje = mensaje + "Precio de unidad: " + "$" + this.precioUnidad + "\n";
		mensaje = mensaje + "Valor de inventario: " + "$" + calcularValor() + "\n";
		
		return mensaje;
	}
	
	public double calcularValor()
	{
		return this.numeroUnidadesExistencias * this.precioUnidad;
	}
	
}



