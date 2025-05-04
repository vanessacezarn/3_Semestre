using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
/*3) Crie uma classe Pessoa com as propriedades Nome e Idade. Adicione validação nas propriedades para que:  
a) Nome não aceite valores nulos ou strings vazias.  
b) Idade não aceite valores menores que 0 ou maiores que 120.*/
namespace exercicio03
{
    class Pessoa
    {
        private String _nome;
        private int _idade;

        public String Nome
        {
            get { return _nome; }
            set {
                if (string.IsNullOrEmpty(value))
                {
                    throw new ArgumentException("nome não pode ser nulo ou vazio");
                }
                else
                {
                    _nome = value;
                }
            }
        }

        public int Idade
        {
            get { return _idade; }
            set {
                if (value < 0 || value > 120) {
                    throw new ArgumentException("idade não pode ser menor que 0 ou maior que 120");
                } else {
                    _idade = value;
                }
            }

        }
    }
}
