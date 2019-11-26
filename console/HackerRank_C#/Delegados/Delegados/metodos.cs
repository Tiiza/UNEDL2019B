using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;

namespace Delegados
{

    class metodos
    {
        private int resultado = 0;
        
        public int Sumar(List<int> numero)
        {
            resultado = numero[0] + numero[1] + numero[2] + numero[3] + numero[4];
            return resultado;
        }

        public int Promedio(List<int> numero)
        {

            resultado = numero[0] + numero[1] + numero[2] + numero[3] + numero[4];
            resultado = resultado / numero.Count;
          
            return resultado;
        }

        public int Mayor(List<int> numero)
        {
            numero.Sort();
            resultado = numero[4];
            return resultado;
        }

        public int getResultado()
        {
            return resultado;
        }
    }
}
