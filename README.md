# Proyecto-Oracle-Fundamentos-de-Java-Java-Fundamentals

## Grado superior de DAW - FOC

## Visión general

Este proyecto avanzará al ritmo del usuario durante el curso. Después de cada
sección, se podrán realizar más aportaciones hasta que se cree una aplicación
Java completa para mantener el inventario. En cada parte, tome como base la
última parte de modo que se cumplan tanto los requisitos anteriores como los
nuevos. Incluya todas las partes en un paquete denominado javaInventory.

Cree un programa de inventario que se pueda utilizar para una serie de productos
distintos (CD, DVD, software, etc.).

# Sección 4: Creación de un proyecto de inventario

## Requisitos: (Soluciones: ProductPart1, ProductTesterPart1)

Tema(s): Tipos de datos, creación de clases/objetos, variables de
instancia/campos, constructores, métodos (de acceso/getter, mutadores/setter),
sobrecarga, clases principal/de prueba, toString()

### 1. Elija un producto que se preste a ser sometido a inventario 

(por ejemplo, productos del hogar, centro educativo o lugar de trabajo: suministros de
oficina, CD de música, películas de DVD o software).

### 2. Cree una clase Product denominada ProductPart1 con variables de instancia para:

a) Número de elemento
b) Nombre del producto
c) Número de unidades en existencias
d) Precio de cada unidad

### 3. Cree dos constructores:

a) Un constructor por defecto sin parámetros que inicializará las variables
numéricas con ceros y variables String con valores nulos.
b) Sobrecargue el constructor por defecto y cree un constructor con
parámetros para las cuatro variables de instancia mencionadas en el
punto 2 anterior que puedan inicializar el objeto con valores del
probador.

### 4. Escriba los métodos de acceso (getter) y mutadores (setter) para las cuatro variables de la instancia.

### 5. Sustituya el método toString() de la clase de objeto que mostrará una descripción de cada objeto que incluye los valores de variable.

### 6. Cree una clase principal Java denominada ProductTesterPart1 que cree e inicialice seis objetos ProductPart1.
a) Dos de los productos deben crearse mediante el constructor por defecto
b) Los otros cuatro deben crearse mediante valores para los argumentos

### 7. Desde ProductTesterPart1, visualice el número de producto, el nombre del producto, el número de unidades en existencias y el precio de cada unidad


## Requisitos: (Soluciones: ProductPart2, ProductTesterPart2)

En este punto, los alumnos deben crear nuevas clases ProductPart2 y
ProductTesterPart2 que se sumarán a la funcionalidad de la parte 1 del proyecto.
(Copie y pegue el código de la parte 1 en las nuevas clases de la parte 2)

Tema(s): Entrada del teclado/escáner

### 1. Modifique ProductTesterPart2

a) Agregue un escáner.
b) Pida al usuario que introduzca valores para los argumentos de los dos
productos del paso 6a de la parte 1.

### 2. Cree un método en la clase ProductPart2 que calculará el valor de cada elemento del inventario, usando la cantidad disponible y el precio.

### 3. Muestre la información en ProductTesterPart2 para estos productos tal y como era en la parte 1. Además, incluya el valor de inventario para cada producto modificando el método toString() en ProductPart2.

## Requisitos: (Soluciones: ProductPart3, ProductTesterPart3)


En este punto, los alumnos deben crear nuevas clases ProductPart3 y
ProductTesterPart3 que se sumarán a la funcionalidad de la parte 2 del proyecto.
(Copie y pegue el código de la parte 2 en las nuevas clases de la parte 3)

Tema(s): Matrices de objetos, bucles for.

## 1. Modifique ProductTesterPart3 para manejar varios productos mediante una matriz de productos.

### 2. Pida al usuario que introduzca el número de productos que desea agregar. Acepte un entero positivo para representar el número de productos y maneje el valor de cero.

### 3. Utilice un bucle for y pida al usuario que introduzca los valores para los elementos.
### 4. Utilice otro bucle for para mostrar la información de un producto cada vez, incluido el número del artículo, el nombre del producto, el número de unidades en existencias, el precio de cada unidad y el valor del inventario de ese producto.

> Nota: La clase de objeto ProductPart3 es la misma que la de ProductPart2, sin que se necesiten modificaciones.

