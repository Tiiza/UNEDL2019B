using System;
using System.Collections;

namespace ExamenFinalTeorico
{
    class Program
    {
        static void Main(string[] args)
        {

            Stack pila = new Stack();
            pila.Push(1);
            pila.Push(1);
            pila.Push(1);
            pila.Push(2);
            pila.Push(3);
            Stack pila2 = new Stack();
            pila2.Push(4);
            pila2.Push(3);
            pila2.Push(2);
            Stack pila3 = new Stack();
            pila3.Push(1);
            pila3.Push(4);
            pila3.Push(1);
            pila3.Push(1);

            Console.WriteLine("Tamaño de las pilas: ");
            Console.WriteLine(pila.Count);
            Console.WriteLine(pila2.Count);
            Console.WriteLine(pila3.Count);

            int p1 = pila.Count;
            int p2 = pila2.Count;
            int p3 = pila3.Count;

            int valor = 0;
            int suma = 0;

            for (int i = 0; i < p1; i++)
            {
                valor = (int)pila.Pop();
                suma += valor;
                if (suma == pila.Count)
                {
                    Console.WriteLine("Pila 1 valor sumado: ");
                    Console.WriteLine(suma);
                    break;
                }


                for (int j = 0; j < p2; j++)
                {
                    valor = (int)pila2.Pop();
                    suma += valor;
                    if (suma == pila2.Count)
                    {
                        Console.WriteLine("Pila 2 valor sumado: ");
                        Console.WriteLine(suma);
                        break;
                    }
                }

                for (int k = 0; k < p3; k++)
                {
                    valor = (int)pila3.Pop();
                    suma += valor;
                    if (suma == pila3.Count)
                    {
                        Console.WriteLine("Pila 3 valor sumado: ");
                        Console.WriteLine(suma);
                        break;
                    }
                }

            }
        }
    }
}

