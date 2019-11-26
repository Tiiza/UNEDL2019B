using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;

namespace Collections
{
    class Arrays
    {
        public void Arreglo1() { 
            ArrayList al = new ArrayList();
            al.Add(null);
            al.Add("string");
            al.Add(1);
            al.Add(null);
            al.Add("string");
            al.Add(1);
            foreach(var i in al)
            {
                Console.WriteLine(i);
            }
        }
    }
}
