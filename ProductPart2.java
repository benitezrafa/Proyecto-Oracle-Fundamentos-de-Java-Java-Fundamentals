package javaInventory;

public class ProductPart2 {

//En este punto, los alumnos deben crear nuevas clases ProductPart2 y
//ProductTesterPart2 que se sumarán a la funcionalidad de la parte 1 del proyecto.
//(Copie y pegue el código de la parte 1 en las nuevas clases de la parte 2)

	private String numeroElemento;
	private String nombreProducto;
	private int numeroUnidadesExistencias;
	private double precioUnidad;

	public ProductPart2() {

		this.numeroElemento = null;
		this.nombreProducto = null;
		this.numeroUnidadesExistencias = 0;
		this.precioUnidad = 0;

	}

	public ProductPart2(String numeroElemento, String nombreProducto, int numeroUnidadesExistencias,
			double precioUnidad) {
		this.numeroElemento = numeroElemento;
		this.nombreProducto = nombreProducto;
		this.numeroUnidadesExistencias = numeroUnidadesExistencias;
		this.precioUnidad = precioUnidad;
	}

	public String getNumeroElemento() {
		return this.numeroElemento;
	}

	public void setNumeroElemento(String _numeroElemento) {
		this.numeroElemento = _numeroElemento;
	}

	public String getNombreProducto() {
		return this.nombreProducto;
	}

	public void setNombreProducto(String _nombreProducto) {
		this.nombreProducto = _nombreProducto;
	}

	public int getnumeroUnidadesExistencias() {
		return this.numeroUnidadesExistencias;
	}

	public void setNumeroUnidadesExistencias(int _numeroUnidadesExistencias) {
		this.numeroUnidadesExistencias = _numeroUnidadesExistencias;
	}

	public double getPrecioUnidad() {
		return this.precioUnidad;

	}

	public void setPrecioUnidad(double _precioUnidad) {
		this.precioUnidad = _precioUnidad;
	}

	public String toString() {
		String mensaje = "";

		mensaje = mensaje + "Nombre de producto " + this.nombreProducto + "\n";
		mensaje = mensaje + "Número de Elementos " + this.numeroElemento + "\n";
		mensaje = mensaje + "Número de unidades en existencia " + this.numeroUnidadesExistencias + "\n";
		mensaje = mensaje + "Precio unidad " + "$" + this.precioUnidad + "\n";
				
//PUNTO 3
				
		//Muestre la información en ProductTesterPart2 para estos productos tal y
		//como era en la parte 1. Además, incluya el valor de inventario para cada
		//producto modificando el método toString() en ProductPart2.
				
		mensaje = mensaje + "Valor de inventario " + "$" + this.calcularValor() + "\n";
		

		return mensaje;

	}
// PUNTO 2
	//2 Cree un método en la clase ProductPart2 que calculará el valor de cada
	// elemento del inventario, usando la cantidad disponible y el precio.
	
	public double calcularValor()

	{
		return this.numeroUnidadesExistencias * this.precioUnidad;
	}
}
