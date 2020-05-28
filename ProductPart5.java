package javaInventory;

public class ProductPart5 {

	private String numeroElemento; 
	private String nombreProducto;
	private int numeroUnidadesExistencias;
	private double precioUnidad;
	
	public ProductPart5()
	{
	     this.numeroElemento = null;  
	     this.nombreProducto = null;
	     this.numeroUnidadesExistencias = 0;
	     this.precioUnidad = 0;
	}
	
	public ProductPart5(String _numeroElemento, String _nombreProducto, int _numeroUnidadesExistencias, double _precioUnidad)
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
	
	public void sumarNumeroUnidades(int cantidad)
	{
		this.numeroUnidadesExistencias += cantidad;
	}
	
	public void restarNumeroUnidades(int cantidad)
	{
		this.numeroUnidadesExistencias -= cantidad;
	}
	
}

