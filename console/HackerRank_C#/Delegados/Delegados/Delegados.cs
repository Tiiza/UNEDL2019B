using System;
using System.Collections;
using System.Collections.Generic;

public delegate int Estadistica(List<int> lista);

namespace Delegados
{
    class Delegados
    {
        static void Main(string[] args)
        {
            int prom = 0;
            int mod = 0;
            var lista = new List<int> { 4, 5, 6, 5, 2 };

            metodos met = new metodos();

            Estadistica suma = new Estadistica(met.Sumar);
            Estadistica promedio = new Estadistica(met.Promedio);
            Estadistica mayor = new Estadistica(met.Mayor);

            promedio(lista);
            Console.WriteLine("El promedio de la lista es: ",met.getResultado());
            suma(lista);
            Console.WriteLine("La suma de la lista es:", met.getResultado());
            mayor(lista);
            Console.WriteLine("El numero mayor de la lista es: ", met.getResultado());


        }
    }
}
