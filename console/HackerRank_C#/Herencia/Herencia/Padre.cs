using System;
using System.Collections.Generic;
using System.Text;

namespace Herencia
{
    class Padre
    {

        private String apellido;
        private String colorPelo;
        private String tipoPelo;
        private String colorOjos;


        public Padre()
        {
           this.apellido = "Villarruel Castellanos";
           this.colorOjos = "Cafes";
           this.colorPelo = "Castaño";
           this.tipoPelo = "Quebradizo";

        }

        public String getApellido()
        {
            return apellido;
        }
        public String getColorOjos()
        {
            return colorOjos;
        }
        public String getColorPelo()
        {
            return colorPelo;
        }
        public String getTipoPelo()
        {
            return tipoPelo;
        }


        //Metodos

        protected void Caracter()
        {
            Console.WriteLine("Es serio");
        }

        protected void Sonrisa()
        {
            Console.WriteLine("Sonrisa igual que la mama");
        }

        protected void Lunar()
        {
            Console.WriteLine("Lunares en la espalda igual que el papa");
        }
    }
}
