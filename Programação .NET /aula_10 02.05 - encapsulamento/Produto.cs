using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace aula_02._05
{
    class Produto
    {
        private string _nome;
        private double _preco;
        private double _imposto;
        private double _precoFinal;

        public string Nome
        {
            get { return _nome; }
            set { _nome = value; } // SE SET FICAR APENAS COMO COMENTARIO SERÁ POSSIVEL APENAS LEITURA DO VARIAVEL NOME
        }
        public double Preco
        {
            get { return _preco; }// SE GET FICAR APENAS COMO COMENTARIO SERÁ POSSIVEL APENAS MODIFICAR A VARIAVEL PRECO
            set { _preco = value; }
        }
        public double Imposto
        {
            get { return _imposto; }
            set { _imposto = value; } 
        }
        public double PrecoFinal
        {
            get { return Preco + Imposto; }
             
        }
    }
}
