Para llevar un mejor control de los datos, se debe crear las siguientes tablas. Cada una va a tener su tabla intermedia, para las FOREIGN KEY

## - [] OBRA

-   Se llevara el control del estado de las obras: 'En proceso', 'Finalizada', 'En espera' y 'Cancelada'. Entre los campos mas importantes, se encuentra el presupuesto y la direccion.

### FOREIGN KEY OBRA

-   Es necesario llevar el control de los oficiales y ayudantes en las obras, para eso se creara una tabla intermedia entre obra y empleados

## - [] Usuario

-   Esta tabla servira para almacenar los distintos usuarios, tanto administradores como oficiales

**Se podria hacer una tabla intermedia para obtener los datos de los oficiales**

## - [] Empleados

-   Se Almacenara los distintos obreros que estan disponibles.

## - [] Herramientas

-   Se almacenara con detalle las distintas herramientas que se encuentran el en pañol.

**Esta es una pieza clave en el sistema, ya que sera el motor de las obras**
