# ENCAPSULAMENTO
## campo
     • se é campo é private
         exemplo: int _numero;
      • 
**CLASSE - produto**
```.cs
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace encapsulamento
{
    internal class Produto
    {
        private int _codigo;
        private string _nome;
        private double _valor;

        //PROPRIEDADE -> privado
        public int Quantidade { get; set; } //atalho prop

        public string Nome {
            get
            {
                return _nome;
            }

            set
            {
                _nome = value;
            }
        }
        public int Codigo {
            get => _codigo; /* equivale a  get {
                                        return _codigo;}*/
            set => _codigo = value;
            /* equivale a set{
                _codigo = value; }*/
        }

        public double Valor
        {
            get
            {
                return _valor;
            }
            set
            {
                _valor = value;
            }
        }
        public void exibir()
        {
            Console.WriteLine("Codigo: "+Codigo);
            Console.WriteLine("nome: " + _nome);
            Console.WriteLine("valor: " + _valor);
            Console.WriteLine("quantidade: "+Quantidade);

        }
    }
}


```

**CLASSE - principal**
```.cs

```
