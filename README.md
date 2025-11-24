# Proyecto - Java con Pruebas para Autograding

Plantilla básica para proyecto de Java con Autograding

## Diagrama de clases
[Editor en línea](https://mermaid.live/)
```mermaid
---
title: Clase
---
classDiagram
      class Clase
      Clase: -x
      Clase: -y
      Clase: +op1()
      Clase: +op2()
      Clase: +op3()
      Clase: +op4()
```
[Referencia-Mermaid](https://mermaid.js.org/syntax/classDiagram.html)

## Diagrama de clases UML con draw.io
El repositorio está configurado para crear Diagramas de clases UML con ```draw.io```. Para usarlo simplemente agrega un archivo con extensión ```.drawio.png```, das doble clic sobre el mismo y se activará el editor ```draw.io``` incrustado en ```VSCode``` para edición. Asegúrate de agregar las formas UML en el menú de formas del lado izquierdo (opción ```+Más formas```).

## Uso del proyecto con make

### Default - Compilar+Probar+Ejecutar
```
make
```
### Compilar
```
make compile
```
### Probar todo
```
make test
```
### Ejecutar App
```
make run
```
### Limpiar binarios
```
make clean
```
## Comandos Git-Cambios y envío a Autograding

### Por cada cambio importante que haga, update su historia usando los comandos:
```
git add .
git commit -m "Descripción del cambio"
```
### Envíe sus actualizaciones a GitHub para Autograding con el comando:
```
git push origin main
```
## Comandos individuales
### Compilar

```
find ./ -type f -name "*.java" > compfiles.txt
javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```
Ejecutar ambos comandos en 1 sólo paso:

```
find ./ -type f -name "*.java" > compfiles.txt ; javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```


### Ejecutar Todas la pruebas locales de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-class miTest.AppTest
```
### Ejecutar 1 prueba local de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-method miTest.AppTest#appHasAGreeting
```
### Ejecutar App
```
java -cp build miPrincipal.Principal
```
Los comandos anteriores están considerados para un ambiente Linux. [Referencia.](https://www.baeldung.com/junit-run-from-command-line)

## UML del paquete grafo
Puedes visualizar este diagrama copiando el siguiente código en [PlantUML Online](https://www.plantuml.com/plantuml/):

```plantuml
@startuml
package grafo {
  class GrafoMatriz {
    - int numVerts
    - Vertice[] verts
    - int[][] matAd
    + GrafoMatriz()
    + GrafoMatriz(int tot)
    + void inicializarMatrizPesos()
    + int[][] getMatriz()
    + void nuevoVertice(String nom)
    + int numVertice(String nom)
    + String nombreVertice(int v)
    + void nuevoArco(String a, String b)
    + void nuevoArco(String a, String b, int peso)
    + boolean adyacente(String a, String b)
    + boolean adyacente(int a, int b)
    + String imprimirMatriz()
    + String imprimirVertices()
    + int numeroDeVertices()
    + void borrarArco(String a, String b)
    + void borrarVertice(String nom)
    + static int[] recorrerAnchura(GrafoMatriz g, String origen)
    + static int[] recorrerProfundidad(GrafoMatriz g, String origen)
    + static int[][] matrizCaminos(GrafoMatriz g)
  }

  class Vertice {
    - String nombre
    + Vertice(String nombre)
    + String getNombre()
    + void setNombre(String nombre)
    + String toString()
  }

  GrafoMatriz "1" o-- "*" Vertice : contiene
}
@enduml
```
