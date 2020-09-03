# Escuela Colombiana de Ingeniería  Ciclos de vida del desarrollo de Software - CVDS Parcial Práctico - 1er Tercio


## Parte II. - Pruebas 'Eci TV'

Para la segunda parte del parcial, se creará el componente encargado de realizar el cálculo del valor a cobrar a un cliente que desea suscribirse al servicio de televisión en la compañía ‘eci tv’. 


1. Arbol del proyecto del parcial

```bash
	.
	+-- .gitignore
    +-- parcial-1.pdf
    +-- pom.xml
    +-- readme.md
    +-- src
	+-- main
	|	+-- java
	|		+-- edu
	|			+-- eci
	|				+-- cvds
	|					+-- ecitv
	|						+-- model
	|						|	+-- SubscriptionCategory.java
	|						+-- eci
	|						|	+-- SubscriptionService.java
	+-- test
	|	+-- java
	|		+-- edu
	|			+-- eci
	|				+-- cvds
	|					+-- ecitv
	|						+-- eci
	|						|	+-- SubscriptionServiceTest.java
```

2. El proyecto cuenta con una estructura inicial, la cual se describirá a continuación:
	* Paquete `edu.eci.cvds.ecitv.model`: Tiene las clases básicas del modelo.
		* Enumeración `SubscriptionCategory`: Enumeración con 3 categorías de subscripción (Plata, Oro, Diamante).
	* Paquete `edu.eci.cvds.ecitv.service`: Se encuentra la lógica de negocio.
		* Clase `SubscriptionService`: Clase principal de la lógica de negocio, donde se realiza el cálculo para la suscripción.
	* Paquete `edu.eci.cvds.ecitv.service` (en src/test/java): Se encuentran las pruebas de la lógica de negocio.
		* Clase `SubscriptionServiceTest`: en esta clase deben estar las pruebas para `SubscriptionService`.

3. Para el cálculo de la suscripción, se tienen las siguientes tarifas:
	* Categoría de la suscripción: El precio base de la suscripción por mes está relacionado a la categoría de la suscripción de la siguiente manera:
		* *Plata*: Es las suscripción mas básica que se ofrece, tiene una tarifa base de $15.000 pesos.
		* *Oro*: Es las suscripción intermedia que se ofrece, tiene una tarifa base de $20.000 pesos.
		* *Diamante*: Es las suscripción mas completa que se ofrece, tiene una tarifa base de $30.000 pesos.
	* Fidelización de Clientes: La empresa desea tener un programa de fidelización de clientes, donde ofrece un descuento para los clientes frecuentes dependiendo de la categoría.
		* *De 18 a 25 años*: Rango de edades inicial, se ofrece un 15% de descuento sobre el valor total.
		* *De 26 a 30 años*: Segundo rango de edades, se ofrece 12% de descuento en la suscripción.
		* *De 31 a 60 años*: Tercer rango de edades, donde se ofrece un 10% de descuento sobre el valor total. 
		* *Mas 60 años*: Último rango de edades, donde se ofrece un 20% de descuento sobre el valor total.

4. Defina las clases de equivalencia necesarias para realizar las pruebas y asegurar la calidad del programa. Estas pueden ser realizadas en cualquier archivo que sea claramente visible.

5. Realice la implementación de las pruebas unitarias en la clase `SubscriptionServiceTest` según las clases de equivalencia anteriormente definidas (no olvidar tener en cuenta los límites / fronteras).

6. Implemente la lógica específica en la clase `SubscriptionService` para realizar el cálculo de la suscripción, con base en la información anterior. Revisar el "tip" dado en la clase para realizar los cálculos necesarios.

7. Verifique la correcta compilación, ejecución y pruebas del proyecto, por medio de la construcción con Maven.

8. Realice los ajustes requeridos a las pruebas o al cálculo de la suscripción, según lo encontrado luego de las ejecucions de maven.

## Entrega

* Cada que se realice uno de los puntos 3 al 7, realice un commit indicando el avance,
* Cargar en Moodle antes de finalizar el parcial.
* Elimine completamente la carpeta target para reducir el tamaño del archivo.
* Comprima todo el contenido del proyecto en un archivo .zip (excluyendo la carpeta target) y agreguela al espacio correspondiente en Moodle.
