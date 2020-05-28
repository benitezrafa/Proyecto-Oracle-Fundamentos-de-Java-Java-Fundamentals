package javaInventory;

	//PUNTO 1

	//Elija un producto que se preste a ser sometido a inventario (por ejemplo,
	// productos del hogar, centro educativo o lugar de trabajo: suministros de
	// oficina, CD de m�sica, pel�culas de DVD o software)

	//En mi caso DVD.

public class ProductPart1 {

	

	// PUNTO 2.

	// Cree una clase Product denominada ProductPart1 con variables de instancia
	// para:
	// a) N�mero de elemento
	// b) Nombre del producto
	// c) N�mero de unidades en existencias
	// d) Precio de cada unidad

	// JUSTIFICACI�N

	// Podr�amos usar un entero o un String es saber qu� vamos arealizar con el
	// elemento.
	// Si es serial es muy grande, podr�a no cargar el entero.
	// Si es un identificador por tipolofg�a tipo ENG, ESP, JP... usamos String.

	private String numeroElemento;
	private String nombreProducto;
	private int numeroUnidadesExistencias;
	private double precioUnidad;

	// Usamos el public para la accesibilidad. Para que Tester pueda acceder a ese
	// m�todo.
	// Tiene el mismo nombre que la clase y no tiene palabra para el retorno "void"
	// Este por defecto no recibe par�metros y los par�ntesis est�n vac�os.
	
	//PUNTO 3

	// Cree dos constructores:

	// a) Un constructor por defecto sin par�metros que inicializar� las variables
	// num�ricas con ceros y variables String con valores nulos.

	public ProductPart1() {
		// Inicianilizamos con valor nulo como dice el enunciado.

		this.numeroElemento = null;
		this.nombreProducto = null;

		// Empezamos en cero como se desarrolla en el enunciado.

		this.numeroUnidadesExistencias = 0;
		this.precioUnidad = 0;

	}

	// b) Sobrecargue el constructor por defecto y cree un constructor con
	// par�metros para las cuatro variables de instancia mencionadas en el
	// punto 2 anterior que puedan inicializar el objeto con valores del
	// probador.
	
	public ProductPart1(String numeroElemento, String nombreProducto, int numeroUnidadesExistencias, double precioUnidad)
	{
		this.numeroElemento = numeroElemento;
		this.nombreProducto = nombreProducto;
		this.numeroUnidadesExistencias = numeroUnidadesExistencias;
		this.precioUnidad =precioUnidad;
	}
	

	// A�adimos en los parentesis los elementos que va a recibir.
	// A�adimos un nombre diferente con gui�n bajo para saber cu�l es el par�metro y
	// cual el atributo.

	public String getNumeroElemento() {
		return this.numeroElemento;
	}
	
	//PUNTO 4

	// Escriba los m�todos de acceso (getter) y mutadores (setter) para las
	// cuatro variables de la instancia.

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
	
	//PUNTO 5
	
	//Sustituya el m�todo toString() de la clase de objeto que mostrar� una
	//descripci�n de cada objeto que incluye los valores de variable.
	//El m�todo toString devuelve la informaci�n en un solo mensaje en la consola.
	//Cuando tenemos el objeto creado en el orden que nosotros queramos.
	
	
	public String toString()
	{
		String mensaje = "";
		
		mensaje = mensaje + "Nombre de producto " + this.nombreProducto + "\n";
		mensaje = mensaje + "N�mero de Elementos " + this.numeroElemento + "\n";
		mensaje = mensaje + "N�mero de unidades en existencia " + this.numeroUnidadesExistencias + "\n";
		mensaje = mensaje + "Precio unidad " + this.precioUnidad + "\n";
		
		return mensaje;
		
	}
	


}
