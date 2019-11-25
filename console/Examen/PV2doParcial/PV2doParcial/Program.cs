using System;
using System.Collections;

namespace PV2doParcial
{
    class Program
    {

        static void Main(string[] args) {
            Stack paretnesis = new Stack();
            String ecuacion;

            Console.WriteLine("[-- Ingresa la ecuacion --]"); 
            ecuacion = Console.ReadLine();
            
            for (int i = 0; i < ecuacion.Length; ++i)
            {
                if ((ecuacion[i] == '(') || (ecuacion[i] == '{') || (ecuacion[i] == '['))
                {
                    paretnesis.Push(ecuacion[i]);
                }
                else if (paretnesis.Count > 0)
                {
                    switch (ecuacion[i])
                    {
                        case ']':
                            paretnesis.Pop();
                            break;
                        case '}':

                            paretnesis.Pop();
                            break;
                        case ')':
                            paretnesis.Pop();
                            break;
                    }
                }
            }
            if (paretnesis.Count == 0)
            {
                Console.WriteLine("Ecuacion Correctamente balanceada");
            }
            else
            {
                Console.WriteLine("Ecuacion incorrectamente balanceada");
            }




        }
    }
}
