 using System;

public delegate int MyDelegate(string s);

namespace Herencia
{
    class Herencia
    {
        static void Main(string[] args)
        {
            Hijo Isay = new Hijo();

            Isay.Imprimir();

            Console.WriteLine("Cosas que ha aprendido");
            Console.WriteLine("Familia:");
            Isay.Valores();
            Console.WriteLine("Escuela:");
            Isay.Trabajo();
            Console.WriteLine("Entrenador de Futbol:");
            Isay.futbol();
        }
    }
}
