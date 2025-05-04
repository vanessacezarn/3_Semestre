using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exercicio05
{
    class Estudante
    {
        private String _nome;
        private double _notaFinal;

        public Estudante(string nome, double notaFinal)
        {
            Nome = nome;
            _notaFinal = notaFinal;
        }
        public String Nome
        {
            get { return _nome; }
            set { _nome = value; }
        }

        public String GetNotaFinal()
        {
            if (_notaFinal >= 70)
            {
                return "APROVADO";
            }
            else
            {
                return "REPROVADO";
            }
        }

    }
}
