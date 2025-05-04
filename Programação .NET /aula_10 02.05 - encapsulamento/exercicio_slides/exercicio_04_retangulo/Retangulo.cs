using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exercicio04
{
    class Retangulo
    {
        private double _largura;
        private double _altura;

        public double Largura { 
            get { return _largura; } 
            set {
                if (value <= 0) {
                    throw new ArgumentException("a largura tem que ser maior que 0 ");
                } else {
                    _largura = value;
                }
            }
        }
        public double Altura
        {
            get { return _altura; }
            set
            {
                if (value <= 0)
                {
                    throw new ArgumentException("a altura tem que ser maior que 0 ");
                }
                else
                {
                    _altura = value;
                }
            }
        }

        public double Area()
        {
            return Largura * Altura;
        }


    }
}
