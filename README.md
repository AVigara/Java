# Proyecto del Segundo Cuatrimestre Fundamentos de Programación (Curso  \<2021\>/\<2022\>)
Autor/a: \<Álvaro Vigara Suárez\>   uvus:\<alvvigsua\>

El dataset usado es una recopilacion de nacimientos dados en distintos centros de andlucía.


## Estructura de las carpetas del proyecto

* **/src**: Contiene los diferentes archivos que forman parte del proyecto. Debe estar estructurado en los siguentes paquetes
  * **fp.nacimientos**: Paquete que contiene los tipos del proyecto.
  * **fp.nacimientos.test**: Paquete que contiene las clases de test del proyecto.
  * **fp.common**: Paquete que contiene los tipos auxiliares del proyecto
  * **fp.utiles**:  Paquete que contiene las clases de utilidad. 
* **/data**: Contiene el dataset o datasets del proyecto
    * **\<Nacimientos_v2.csv\>**: Recoge los nacimientos y sus datos relaccionados de centros médicos en andalucía.
    
## Estructura del *dataset*

El dataset se compone registros sobre nacimientos de diferentes centros de andalucía durante un periodo de tiempo.

El dataset esta compuesto por 12 columnas:

* **Nombre**: de tipo String, representa el nombre del centro al que pertenece el registro.
* **Tipo De Centro**: de tipo Enumerate, representa la clase de centro a la que pertenece el centro del registro.
* **Municipio**: de tipo String, guarda el municipio en el que se encuentra el centro.
* **Provincia**: De tipo String, almacena la provincia en la que se encuentra el centro.
* **Fecha De Nacimiento**: De tipo LocalDate, representa la fecha en la que se tomó el registro.
* **Hombres**: De tipo Integer, representa el numero de hombres que nacieron.
* **Mujeres**: De tipo Integer, representa el numero de Mujeres que nacieron.
* **Promedio Peso Hombres**: De tipo Double, representa el peso medio de los hombres en kilogramos.
* **Promedio Peso Mujeres**: De tipo Double, representa el peso medio de las mujeres en kilogramos.
* **Promedio Estatura Hombres**: De tipo Double, representa la estatura media de los hombres en centímetros.
* **Promedio Estatura Mujeres**: De tipo Double, representa la estatura media de los mujeres en centímetros.
* **Helipuerto**: De tipo Boolean, representa si el centro tiene helipuerto.
....

## Tipos implementados

Clase Nacimientos: Guarda toda la informacion de un registro del dataset.

Enumerate TipoCentro: Determina los distintos tipos de centro.(COMARCAL, CONCERTADO, ESPECIALIDADES, REGIONAL)

### Tipo Base
El tipo base es el tipo Nacimientos, cuyos atributos son todos consultables y algunos modificables.

**Propiedades**:

- **nombre**, de tipo String, consultable. 
- **tipoDeCentro**, de tipo TipoCentro, consultable. 
- **municipio**, de tipo String, consultable. 
- **provincia**, de tipo String, consultable. 
- **fechaDeNacimiento**, de tipo LocalDate, consultable. 
- **h**, de tipo Integer, consultable y modificable. 
- **m**, de tipo Integer, consultable y modificable. 
- **promedioPesoH**, de tipo Double, consultable y modificable.
- **promedioPesoM**, de tipo Double, consultable y modificable.  
- **promedioEstaturaH**, de tipo Double, consultable y modificable. 
- **promedioEstaturaM**, de tipo Double, consultable y modificable. 


**Constructores**: 

- C1: Requiere de todas las propiedades.
- C2: Si falta la provincia la inicializa con un valor por defecto y requiere del resto de propiedades.
- C3: Si faltan los promedios los inicializa con una media global y requiere del resto de propiedades.
- C4: Si falta la provincia y los promedios los inicializa con los valores anteriormente mencionados y requiere del resto de las propiedades.


**Restricciones**:
 
- R1: La fecha no puede ser superior a la actual.
- R2: Los promedios de los pesos no pueden ser negativos.
- R3: Los promedios de las estaturas no pueden ser negativos.
- R4: Los nacimientos de hombres y/o mujeres no pueden ser negativos.


**Criterio de igualdad**: Un tipo nacimientos es igual a otro si todas sus propiedades son iguales menos los pesos y estaturas promedio.

**Criterio de ordenación**: Ordena por nombre, tipo de centro, municipio, Fecha de nacimiento, nacimientos de hombres, nacimientos de mujeres y si tiene helipuerto.

**Otras operaciones**:
 
-	_mÃ©todo 1_: DescripciÃ³n del mÃ©todo 1.
- ...

#### Tipos auxiliares
DescripciÃ³n de los tipos auxiliares que sean necesarios aÃ±adir al proyecto.

### FactorÃ­a
DescripciÃ³n breve de la factorÃ­a.

- _mÃ©todo 1_: DescripciÃ³n del mÃ©todo 1.
-	_mÃ©todo 2_: DescripciÃ³n del mÃ©todo 2.

### Tipo Contenedor

DescripciÃ³n breve del tipo contenedor.

**Propiedades**:

- _propiedad1_, de tipo \<Tipo1\>, consultable. 
- _propiedad2_, de tipo \<Tipo2\>, consultable y modificable. 
- ...
- 
**Constructores**: 

- C1: DescripciÃ³n del constructor 1.
- C2: DescripciÃ³n del constructor 2.
- ...

**Restricciones**:
 
- R1: DescripciÃ³n de la restricciÃ³n 1.
- R2: DescripciÃ³n de la restricciÃ³n 2.
- ...
- 
**Criterio de igualdad**: Describir el criterio de igualdad

**Criterio de ordenaciÃ³n**: Describir el criterio de ordenaciÃ³n (si lo hay).

**Otras operaciones**:
 
-	_mÃ©todo 1_: DescripciÃ³n del mÃ©todo 1.
- ...
