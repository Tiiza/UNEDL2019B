using System;
using System.Collections.Generic;
using System.Text;

namespace Herencia
{
    class Hijo : Padre
    {

        public void Imprimir()
        {
            Console.WriteLine("Atributos de los padres: ");
            Console.WriteLine("Apellidos: ", getApellido());
            Console.WriteLine("Tipo de pelo: ", getTipoPelo());
            Console.WriteLine("Color de pelo: ", getColorPelo());
            Console.WriteLine("Color de ojos: ", getColorOjos());
        }

        public void Valores()
        {
            Console.WriteLine("- Es respetuoso");

        }

        public void Trabajo()
        {
            Console.WriteLine("- Entregar todo a tiempo");
        }

        public void futbol()
        {
            Console.WriteLine("- Patear correctamente el balon");
        }
    }
}
