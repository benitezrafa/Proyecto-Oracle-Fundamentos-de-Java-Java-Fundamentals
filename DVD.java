package javaInventory;


public class DVD extends ProductPart5 {
//1 Cree una subclase de la clase ProductPart5 que tenga dos variables 
//adicionales. (Por ejemplo, una subclase DVD podr�a utilizar una longitud y un t�tulo de pel�cula).

	private String titulo;
	private int duracion; 

	public DVD()
	{
		super();
		this.titulo ="";
		this.duracion = 0;
	}
	
	public DVD(String _numeroElemento, String _nombreProducto, int _numeroUnidadesExistencias, double _precioUnidad, String _titulo, int _duracion)
			{
				super(_numeroElemento, _nombreProducto, _numeroUnidadesExistencias, _precioUnidad);
				this.titulo = _titulo;
				this.duracion = _duracion;
			}
	
	public String getTitulo()
	{
		return this.titulo;
	}
	public void setTitulo(String _titulo)
	{
		this.titulo = _titulo;
	}
	
	public int getDuracion()
	{
		return this.duracion;
	}
	public void setDuracion(int _duracion)
	{
		this.duracion = _duracion;
	}
	
//2 En la subclase, sustituya el m�todo para calcular el valor del inventario de un producto 
//con el mismo nombre que el m�todo creado anteriormente para la clase de producto. 
//El m�todo de subclase debe sumar tambi�n una tasa de devoluci�n al almac�n del 5% al valor 
//del inventario de ese producto.
	
	@Override
	public double calcularValor()
	{
		double valor = this.getNumeroUnidadesExistencias() * this.getPrecioUnidad();
		return valor + valor * 0.05;
		
	}
	
//3 Sustituya el m�todo toString() de la clase ProductPart5 de modo que toda 
//la informaci�n sobre los objetos de la nueva subclase pueda mostrarse en el resultado.

	
	@Override
	public String toString()
	{
		String mensaje = "";
		
		mensaje = mensaje + "Numero de Elemento: " + this.getNumeroElemento() + "\n";
		mensaje = mensaje + "Nombre de Producto: " + this.getNombreProducto() + "\n";
		mensaje = mensaje + "Numero de unidades: " + this.getNumeroUnidadesExistencias() + "\n";
		mensaje = mensaje + "Precio de unidad: " + "$" + this.getPrecioUnidad() + "\n";
		mensaje = mensaje + "Valor de inventario: " + this.calcularValor() + "\n";
		mensaje = mensaje + "T�tulo DVD: " + "$" + this.titulo + "\n";
		mensaje = mensaje + "Duraci�n del DVD: "+ this.duracion +  " minutos" +"\n";

		
		return mensaje;
	}
}
