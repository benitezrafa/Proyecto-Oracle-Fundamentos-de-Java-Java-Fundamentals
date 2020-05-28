/*
En este punto, los alumnos deben crear nuevas clases ProductPart4 y
ProductTesterPart4 que se sumarán a la funcionalidad de la parte 3 del proyecto.
(Copie y pegue el código de la parte 3 en las nuevas clases de la parte 4)
*/

package javaInventory;

public class ProductPart4 {
	
	private String numeroElemento; 
	private String nombreProducto;
	private int numeroUnidadesExistencias;
	private double precioUnidad;
	
	public ProductPart4()
	{
	     this.numeroElemento = null;  
	     this.nombreProducto = null;
	     this.numeroUnidadesExistencias = 0;
	     this.precioUnidad = 0;
	}
	
	public ProductPart4(String _numeroElemento, String _nombreProducto, int _numeroUnidadesExistencias, double _precioUnidad)
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
	

/*
Cree dos nuevos métodos en la clase ProductPart4, uno que permitirá al usuario
sumar al número de unidades en existencias, y otro que permitirá al usuario
restar del número de unidades en existencias. Ambos métodos deben tener un
parámetro para el número de elementos que se van a sumar o restar.
*/
	
	public double calcularValor()
	{
		return this.numeroUnidadesExistencias * this.precioUnidad;
	}
	
	public void sumarNumeroUnidades(int cantidad)
	
	{
		this.numeroUnidadesExistencias += cantidad;
	}
	
	public void restarNumeroUnidades(int cantidad)
	{
		this.numeroUnidadesExistencias -= cantidad;
	}

}
