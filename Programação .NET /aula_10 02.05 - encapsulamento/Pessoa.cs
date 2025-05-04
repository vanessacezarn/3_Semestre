using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace aula_02._05
{
    internal class Pessoa
    {
        private string _nome;
        //Criem uma propiedade que nao aceita idade menor que 0
        private int _idade;
        public int Idade
        {
            get
            {
                return _idade;
            }
            set
            {
                if (value < 0)
                {
                    throw new Exception("idade não pode ser menor que 0");
                }
                _idade = value;
            }
        }
        public String Nome
        {
            get
            {
                return _nome;
            }
            set
            {
                if (string.IsNullOrEmpty(value))
                {
                    throw new Exception("nome não pode ser vazio");
                }
                {
                    _nome = value;
                }
            }
        }
    }
}
