/*
 
1. Describa en sus propias palabras el concepto de colecciones y cuales tipos existen
   Son clases las cuales se especializan en el control de los valores u objetos de distintos tipos. list, hash, sorted list, stack, queue, bit array

2. Defina a que se refiere el concepto de codigo no seguro y que se necesita para implementarlo
   Al codigo el cual involucre el uso de apuntadores se le da el nombre de codigo no seguro, tambien este se ejecuta fuera del control del recolector de
   basura. Para implementarlo necesitamos usar el modificador 'unsafe', pero se debe habilitar en el compilador el uso de unsafe, si no genera errores
   de compilacion

3. Mencione al menos tres clases que se utilizan en i/o y proporcione brevemente la idea central de las mismas
   FileStream: lee y escribe bytes desde y hacia un archivo
   PipeStream: lee y escribe bytes desde y hacia diferentes procesos
   MemoryStream: lee y escribe bytes desde y hacia memoria

4. Explique la diferencia entre los siguientes codigos en csharp
    a. Console.WriteLine("resultado: (*ptr)");
    b. Console.WriteLine("resultado: ((int)ptr)");

5. Mencione al menos tres caracteristicas de las excepciones
   Es un evento inesperado
   Es una respuesta a una circuntancia excepcional durate la ejecucion del programa
   Se derivan de una clase la cual se generan o por aplicacion o por el sistema

6. En java, mencione y describa los tres tipos de excepciones
   NullPointerException: Lanza la excepcion cuando intentas acceder a una parte de un objeto cuando aun no se le reserva memoria
   NumberFormatException: Lanza la excepcion cuando se procesa un numero pero ete es un dato alfanumerico
   ArrayIndexOutOfBoundsException: Lanza una excepcion cuando se accede a una posicion de un array que no existia

7. Explique brevemente a que se refiere con directivas para prodesador y que se necesita para usarlas
   Estas le dan instrucciones al compilador para que procese la informacion antes de inciar con la propia compilacion. Para usarlas necesitamos
   iniciar con "#" y no terminar con ";", necesitan ser las unicas instrucciones por linea

8. Explique las diferencias entre ArrayList, SortedList y Hash code
   El array list es una lista la cual almacena datos a manera de arreglo, el sortedList es igual una lista pero a diferencia del arraylist este 
   genera llaves estas llaves hacen que los datos esten acomodados de modo ascendente y el hashcode es un mapa de informacion

9. Describa para que sirven StreamReader y StreamWriter
   Son unas clases de apoyo las cuales permiten la lectura(StreamReader) y escritura (StreamWriter) convirtiendo bytes en caracteres y viceversa

10. Explique el funcionamiento del algoritmo Quick sort
    Es un algoritmo el cual toma de referencia esta misma parte en dos segmentos la lista, los elementos mayores a la referenca van a la derecha y los 
    a la izquierda 

11. En java, explique cual es la dferencia entre System.out, System.in y System.err
    System out lo usamos comunmente para mostrar en consola algo, el system.err se usa para imprimir un error estandar, el system.in nos da un flujo de 
    entrada estandar.

12. Explique cuales son las ventajas de utilizar "generic collections"
    Podemos almacenar cualquier tipo de elementos
    Impacta en el rendimiento
    Contiene las mismas erramientas como el collections
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 */
