# OO2

Este repositorio al igual que todos los comenzados en POO_ estan hechos con el proposito de mostrar ejercicios hechos durante la materia OO2.
En esta materia enseñan y realizan ejercicios relacionados a los patrones de diseño.
Practica 1: Patron **Adapter** 

# Ejercicio 2: Friday the 13th en Java 

Nota: Para realizar este ejercicio, utilice el recurso que se encuentra en el sitio de la cátedra.
Allí encontrará un proyecto Maven que contiene el código fuente de las clases Biblioteca, Socio y VoorheesExporter.

La clase Biblioteca implementa la funcionalidad de exportar el listado de sus socios en formato JSON. 
Para ello define el método exportarSocios() de la siguiente forma:
```java
    /**
     * Retorna la representación JSON de la colección de socios.
     */
    public String exportarSocios() {
        return exporter.exportar(socios);
    }
```

La Biblioteca delega la responsabilidad de exportar en una instancia de la clase  VoorheesExporter que dada una colección de socios, retorna un texto con la representación de la misma en formato JSON. Esto lo hace mediante el mensaje de instancia `exportar(List<Socio>)`. 

De un socio se conoce el nombre, el email y el número de legajo. Por ejemplo, para una biblioteca que posee una colección con los siguientes socios:

Nombre: Arya Stark
e-mail:needle@stark.com
legajo: 5234-5

Nombre: Tyron Lannister
e-mail:tyron@thelannisters.com
legajo: 2345-2


Ud. puede probar la funcionalidad ejecutando el siguiente código:

```java 
Biblioteca biblioteca = new Biblioteca();
biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
System.out.println(biblioteca.exportarSocios());
```

Al ejecutar, el mismo imprimirá el siguiente JSON:
```json
[
    {
   	 "nombre": "Arya Stark",
   	 "email": "needle@stark.com",
   	 "legajo": "5234-5"
    },
    {
   	 "nombre": "Tyron Lannister",
   	 "email": "tyron@thelannisters.com",
   	 "legajo": "2345-2"
    }
]
```

## Tareas
1. Analice la implementación de la clase Biblioteca, Socio y VoorheesExporter que se provee con el material adicional de esta práctica.
2. Documente la implementación mediante un diagrama de clases UML. 
3. Programe los Test de Unidad para la implementación propuesta.

# Ejercicio 2.b - Usando la librería JSON.simple

Su nuevo desafío consiste en utilizar la librería JSON.simple para imprimir en formato JSON a los socios de la Biblioteca en lugar de utilizar la clase VoorheesExporter. Pero con la siguiente condición: **nada de esto debe generar un cambio en el código de la clase Biblioteca.**

## Tareas

1. Instale la librería JSON.simple agregando la siguiente dependencia al archivo pom.xml de Maven

```xml
<dependency>
    <groupId>com.googlecode.json-simple</groupId>
    <artifactId>json-simple</artifactId>
    <version>1.1.1</version>
</dependency>
```

2. Utilice esta librería para imprimir, en formato JSON, los socios de la Biblioteca en lugar de utilizar la clase VoorheesExporter, sin que esto genere un cambio en el código de la clase Biblioteca.
    - Modele una solución a esta alternativa utilizando un diagrama de clases UML. Si utiliza patrones de diseño 
    indique los roles en las clases utilizando estereotipos.

    - Implemente en Java la solución incluyendo los tests que crea necesarios.
    
-

1. [Implementacion de ejercicio](/main/java/ar/edu/unlp/info/oo2/biblioteca/)
2. [Implementacion de Tests](/test/java/ar/edu/unlp/info/oo2/biblioteca/)
3. ![UML_Design](/BibliotecaUML.png)